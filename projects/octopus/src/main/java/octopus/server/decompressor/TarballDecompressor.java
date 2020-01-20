package octopus.server.decompressor;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream;

public class TarballDecompressor {
    /**
     * The constant BUFFER_SIZE.
     */
    private static final int BUFFER_SIZE = 4096;

    /**
     * Extract g zip.
     *
     * @param tgzFile
     *            the tgz file
     * @param outDir
     *            the out dir
     */
    public static void decompress(File tgzFile, File outDir) {
        try {
            TarArchiveInputStream tarIs = new TarArchiveInputStream(new GzipCompressorInputStream(new BufferedInputStream(new FileInputStream(tgzFile))));
            TarArchiveEntry entry;
            while ((entry = (TarArchiveEntry) tarIs.getNextEntry()) != null) {
                String name = entry.getName();
                
                if (entry.isDirectory()) {
                    mkDirs(outDir, name);
                } else {
                    String dir = directoryPart(name);
                    if (dir != null) {
                        mkDirs(outDir, dir);
                    }
                    extractFile(tarIs, outDir, name);
                }
            }
            tarIs.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Extract file.
     *
     * @param inputStream
     *            the input stream
     * @param outDir
     *            the out dir
     * @param name
     *            the name
     * @throws IOException
     *             the io exception
     */
    private static void extractFile(InputStream inputStream, File outDir, String name) throws IOException {
        int count = -1;
        byte buffer[] = new byte[BUFFER_SIZE];
        BufferedOutputStream out = null;
        
        try {
        	out = new BufferedOutputStream(new FileOutputStream(new File(outDir, name)), BUFFER_SIZE);
            if (out != null)
            	out = new BufferedOutputStream(new FileOutputStream(new File(outDir, name)), BUFFER_SIZE);
            
            while ((count = inputStream.read(buffer, 0, BUFFER_SIZE)) != -1) {
                out.write(buffer, 0, count);
            }
		} catch (Exception e) {
			//Sometimes directories are not recognized
			System.err.println("Error writing file, try do make a directory instead");
			mkDirs(outDir, name);
			return;
		} finally {
			out.close();
		}

    }

    /**
     * Mk dirs.
     *
     * @param outdir
     *            the outdir
     * @param path
     *            the path
     */
    private static void mkDirs(File outdir, String path) {
    	try {
            File d = new File(outdir, path);
            if (!d.exists()) {
                d.mkdirs();
            }
		} catch (Exception e) {
			System.err.println("Error making directory");
		}
    }

    /**
     * Directory part string.
     *
     * @param name
     *            the name
     * @return the string
     */
    private static String directoryPart(String name) {
        int s = name.lastIndexOf(File.separatorChar);
        return s == -1 ? null : name.substring(0, s);
    }

}
