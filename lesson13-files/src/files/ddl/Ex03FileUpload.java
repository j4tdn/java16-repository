package files.ddl;

import java.nio.file.Path;

import utils.FileUtils;

public class Ex03FileUpload {

	// source: path\file

	// upload(source, target)

	// target( folder)
	public static void main(String[] args) {

		Path newPath = FileUtils.copy("root\\images\\tenhag.png", "upload");
		System.out.println("\n newPath --> " + newPath);
		System.out.println(" ---- Finished -----");
	}
}
