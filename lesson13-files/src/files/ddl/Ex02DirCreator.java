package files.ddl;

import java.io.File;

import files.utils.FileUtils;

public class Ex02DirCreator {
	private static String dirpath = "root/image";

	public static void main(String[] args) {
		File dir = FileUtils.createDir(dirpath);
	}
}
