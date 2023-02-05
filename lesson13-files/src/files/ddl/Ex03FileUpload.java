package files.ddl;

import java.nio.file.Path;

import util.FileUtils;

public class Ex03FileUpload {

	// source: path\file
	// : root\image\flower.jpg

	// upload(source, target)

	// target: upload\file
	// : upload\flower.jpg
	public static void main(String[] args) {
		// virtual: JFileChooser --> root\image\flower.jpg
		Path file = FileUtils.copy("root\\image\\flower.jpg","upload");
		System.out.println("...*** Finished ***...");
	}
}
