package file.ddl;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import utils.FileUtils;

public class Ex03FileUpload {
	// source : path\file
	//		  : root\images\computer.png
	// target: upload
	
	// Upload(source , target)
	
	
	public static void main(String[] args) {
		// virtual: JFileChooser --> root\images\computer.png
		Path newPath = FileUtils.copy("root\\image\\computer.png", "upload"); 
		
		System.out.println("\nnewPath --> " + newPath);
		
		System.out.println("\n ... *** Finished *** ... ");
	}
}
