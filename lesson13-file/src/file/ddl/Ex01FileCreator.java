package file.ddl;

import java.io.File;
import java.io.IOException;

import utils.FileUtils;

public class Ex01FileCreator {
	private static String pathname = "text\\data\\conten.txt";
	public static void main(String[] args) {
		File file = FileUtils.create(pathname);
		
		System.out.println("file" + file);
		
		System.out.println("Finished.........");
	}

}
