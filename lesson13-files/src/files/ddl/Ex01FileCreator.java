package files.ddl;

import java.io.File;

import util.FileUtils;

public class Ex01FileCreator {
	// --> path to current project
	// pathname: file name --> content.txt
	// pathname: path to file name --> data/content.txt

	// --> path to computer disc
	// pathname: D:/data/content.txt
	// pathname: D:\data\content.txt
	private static String pathname = "text\\data\\content.txt";

	public static void main(String[] args) {
		File file = FileUtils.createFile(pathname);
		System.out.println("File: " + file.getPath());
		System.out.println("File: " + file.getAbsolutePath());
		System.out.println("Finished...");
	}
}
