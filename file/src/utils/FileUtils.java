package utils;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileUtils {
	private FileUtils(){
		
	}
	
	public static Path copy(String sourcePath,String targetDir){
		Path source = Paths.get("root\\images\\meo.jpn");
		Path target = 	createDir("upload")
						.toPath()
						.resolve(rename(source.getFileName()));
		Path path = target;
		try {
			path = Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
			System.out.println("new path --> "+path);
		}
		catch (IOException e){
			e.printStackTrace();
		}
		return path;
	}
	
	public static File createDir(String dirpath) {
		File dir = new File(dirpath);
		if(!dir.exists()) {
			boolean isSuccess = dir.mkdirs();
			System.out.println(">> Directory '"+dir.getPath()+ "' is created --> " + (isSuccess ? "success":"fail"));
		}else {
			System.out.println(">> Directory '"+ dir.getPath()+"' already exits");
		}
		return dir;
	}
	
	public static File createFile(String pathname) {
		File file = new File(pathname);
		if (!file.exists()) {
			createDir(file.getParent());
			try {
				boolean isSucces = file.createNewFile();
				System.out
						.println(">> File " + file.getName() + " is created --> " + (isSucces ? "succesfull" : "fail"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println(">> File " + file.getName() + "already existed !");
		}

		return file;
	}
	
	public static boolean delete (String pathname) {
		File file = new File(pathname);
		boolean isDeleted = file.delete();
		if(file.exists()) {
			isDeleted = file.delete();
			System.out.println(">> File '" + file.getName() + "' Deleted !!!");
		}
			
		return isDeleted;
	}
	
	public static boolean delete (File file) {
		boolean isDeleted = file.delete();
		
		System.out.println(">> File '" + file.getName() + "' Deleted !!!");
		
		return isDeleted;
	}
	
	public static Path rename(Path path) {		
		return Paths.get(rename(path.toString()));
	}
	
	public static String rename(String filename) {
		return System.currentTimeMillis()
				+ "123"
				+ filename.charAt(0)
				+ filename.charAt(filename.lastIndexOf(".")-1)
				+ filename.substring(filename.lastIndexOf("."));
	}
	
	public static boolean isFile(File file,String ext) {
		return file.isFile() && file.getName().endsWith("." + ext);
	}
	
	public static void open(File file) {
		try {
			Desktop.getDesktop().open(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}