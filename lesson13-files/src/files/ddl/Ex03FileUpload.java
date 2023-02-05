package files.ddl;

import java.nio.file.Path;

import utils.FileUtils;

public class Ex03FileUpload {
	// source: path\file

	// upload(source, target)

	// target: upload
	public static void main(String[] args) {
		// virtual: JFileChooser --> root\images\flower.png
		Path newPath = FileUtils.copy("root\\images\\flower.png", "upload");
		System.out.println("\newPath --> " + newPath);
		
		System.out.println("\n ... *** Finished *** ...");
	}
}
