package files.ddl;

import java.io.File;

import util.FileUtils;

public class Ex05FileRename {
	public static void main(String[] args) {
		File source = new File("upload\\flower.jpg");
		String filename = source.getName();// flower.jpg
		String newName = FileUtils.rename(filename);

		File target = new File(source.getParent(), newName); // upload\new Name

		source.renameTo(target);

		System.out.println("...***Finish***...");
	}
}
