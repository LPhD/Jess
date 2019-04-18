package octopus.server.decompressor;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream;
import org.apache.commons.compress.utils.IOUtils;

public class TarballDecompressor {

//	public void decompress(String tarballFilename, String outputDirectory) throws FileNotFoundException, IOException {
//		if (!outputDirectory.endsWith(File.separator))
//			outputDirectory = outputDirectory + File.separator;
//
//		TarArchiveInputStream tarIn = createTarInputStreamForFile(tarballFilename);
//
//		TarArchiveEntry entry;
//		while ((entry = (TarArchiveEntry) tarIn.getNextEntry()) != null) {
//			String outputFilename = outputDirectory + entry.getName();
//
//			if (outputFilename.contains("pax_global_header"))
//				continue;
//
//			if (entry.isDirectory()) {
//				createOutputSubDirectory(outputFilename);
//				continue;
//			}
//			try {
//				decompressFileToOutputDirectory(tarIn, outputFilename);
//			} catch (Exception e) {
//				System.out.println("Error while decompressing file");
//				e.printStackTrace();
//				throw new RuntimeException();
//			}
//
//		}
//		tarIn.close();
//	}
	
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
                System.out.println("Name: "+name);
                
                if (entry.isDirectory()) {
                	System.out.println(name+" is a directory");
                    mkDirs(outDir, name);
                } else {
                	System.out.println(name+" is a file");
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
        BufferedOutputStream out = new BufferedOutputStream(
                new FileOutputStream(new File(outDir, name)), BUFFER_SIZE);
        while ((count = inputStream.read(buffer, 0, BUFFER_SIZE)) != -1) {
            out.write(buffer, 0, count);
        }
        out.close();
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
        File d = new File(outdir, path);
        if (!d.exists()) {
            d.mkdirs();
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

//	private TarArchiveInputStream createTarInputStreamForFile(String tarballFilename) throws FileNotFoundException, IOException {
//		FileInputStream fin = new FileInputStream(tarballFilename);
//		BufferedInputStream in = new BufferedInputStream(fin);
//		GzipCompressorInputStream gzIn = new GzipCompressorInputStream(in);
//		TarArchiveInputStream tarIn = new TarArchiveInputStream(gzIn);
//		return tarIn;
//	}
//
//	private void createOutputSubDirectory(String outputFilename) {
//		File f = new File(outputFilename);
//		f.mkdirs();
//		System.out.println("Directory created! "+outputFilename);
//	}
//
//	private void decompressFileToOutputDirectory(TarArchiveInputStream tarIn, String outputFilename) throws IOException {
//		final int BUFFER_SIZE = 4096;
//		byte data[] = new byte[BUFFER_SIZE];
//		int bytesRead;
//
//		System.out.println("outputFilename: " + outputFilename);
//
//
//		FileOutputStream fos = new FileOutputStream(outputFilename);
//
//		System.out.println("Buffer");
//
//		BufferedOutputStream dest = new BufferedOutputStream(fos, BUFFER_SIZE);
//
//		System.out.println("ReadIn");
//
//		while ((bytesRead = tarIn.read(data, 0, BUFFER_SIZE)) != -1) {
//			dest.write(data, 0, bytesRead);
//		}
//		dest.close();
//
//	}

}
