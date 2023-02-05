package files.ddl;

import java.io.File;
import java.nio.file.Paths;

import utils.FileUtils;

public class Ex05FileRename {
	public static void main(String[] args) {
		File source = new File("upload\\flower.png");
		
		String filename = source.getName();
		String newName = FileUtils.rename(filename);
		
		File target = new File(source.getParent(),newName);
		source.renameTo(target);
		System.out.println("...***Finished***...");
	}
}
