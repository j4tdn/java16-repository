package files.ddl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import utils.FileUtils;

public class Ex03FileUpload {
	//source: path\file
	//		root\\images\\cat.png
	
	//upload(source, target)
	
	//target: upload
	//		upload\\cat.png
	public static void main(String[] args) {
		//virtual: JFileChoosen --> root\images\cat.png
		Path newpath = FileUtils.copy("root\\\\images\\\\cat.png", "upload");
		System.out.println("New path: "+ newpath);
		System.out.println("Finish!!!");
		
	}

}
