package files.ddl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import utils.FileUtils;

public class Ex02FileUpload {

	// source: path/file
	// upload (source, target)
	// target: folder
	public static void main(String[] args) {
		Path source = Paths.get("root\\images\\flower.png");
		Path newDir = FileUtils.createDir("upload").toPath();
		Path target = newDir.resolve(FileUtils.rename(source.getFileName()));
		
		try { 
			Path path = Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
			System.out.println("new path --> " + path);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
