package file.ddl;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import util.FileUtils;

public class Ex03FileUpload {
	// source: path\file
	//       : root\\image\\flower.png
	
	// upload(source, target)
	
	// target: upload
	//       : upload\\flower.png
	
	public static void main(String[] args) {
		// virtual: JFileChooser --> root\image\123.png
		Path newPath = FileUtils.copy("root\\\\image\\\\123.png", "upload");
		
		System.out.println("\nnewPath --> " + newPath);
		
		System.out.println("...Finish...");

	}
}
