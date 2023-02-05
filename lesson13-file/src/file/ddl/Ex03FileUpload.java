package file.ddl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import utils.FileUtils;

public class Ex03FileUpload {
	public static void main(String[] args) {
		Path source = Paths.get("root\\images");
		Path newdir = FileUtils.createDir("upload").toPath();
		Path target = newdir.resolve(source.getFileName());
		try {
			Path path = Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
			System.out.println("new path " + path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
