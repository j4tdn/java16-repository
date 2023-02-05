package files.ddl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import utils.FileUtils;

public class Ex03FileUpload {
	// source : path\file
	//		  : root\images\flower.png
	
	// upload(source,target)
	
	// target : upload
	//		  : upload\flower.png
	public static void main(String[] args) {
		// virtual: JFileChooser --> root\image\flower.jpg
		Path file = FileUtils.copy("root\\image\\flower.jpg","upload");
		System.out.println("...*** Finished *...");
	}
}