package fileWalker;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class OrderedWalker extends SourceFileWalker {
	FileNameMatcher matcher = new FileNameMatcher();
	List<SourceFileListener> listeners = new LinkedList<SourceFileListener>();

	public OrderedWalker() {
		setFilenameFilter(DEFAULT_FILENAME_FILTER);
	}

	@Override
	public void setFilenameFilter(String filter) {
		matcher.setFilenameFilter(filter);
	}

	@Override
	public void addListener(SourceFileListener listener) {
		listeners.add(listener);
	}

	@Override
	protected void walkExistingFileOrDirectory(String dirOrFileName) throws IOException {
		walk(dirOrFileName);
	}

	private void walk(String dirOrFileName) {
		File file = new File(dirOrFileName);
		File[] dirContent = file.listFiles();
		Path path = file.toPath();
		
		// if this is not a directory
		if (dirContent == null)
			return;
		
		Arrays.sort(dirContent);		
		reportDirectoryEnter(path);

		for (File f : dirContent) {
			Path filePath = f.toPath();
			String absolutePath = f.getAbsolutePath();
			System.out.println("getAbsolutePath");

			if (f.isDirectory()) {
				System.out.println("isDirectory");
				walk(absolutePath);
				System.out.println("absolutePath");
				continue;
			}

			if (matcher.fileMatches(filePath)) {
				System.out.println("fileMatches");
				reportFile(filePath);
				System.out.println("reportFile");
			}
			System.out.println("enddirContent");
		}

		reportDirectoryLeave(path);
	}

	private void reportDirectoryEnter(Path path) {
		for (SourceFileListener listener : listeners)
			listener.preVisitDirectory(path);
	}

	private void reportDirectoryLeave(Path path) {
		for (SourceFileListener listener : listeners)
			listener.postVisitDirectory(path);
	}

	private void reportFile(Path path) {
		for (SourceFileListener listener : listeners)
			listener.visitFile(path);

	}

}
