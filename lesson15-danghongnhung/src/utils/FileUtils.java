package utils;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FileUtils {
	public FileUtils() {
		// TODO Auto-generated constructor stub
	}
	
	@SuppressWarnings("unchecked")
	public static <T> List<T> readObjeacts(File serializedFile){
		return (List<T>) readObject(serializedFile);
		
	}
	
	public static Object readObject(File serializedFile) {
		Object object = null;
		if(serializedFile.exists()) {
			FileInputStream fos = null;
			ObjectInputStream ois = null;
			try {
				fos = new FileInputStream(serializedFile);
				ois = new ObjectInputStream(fos);
				
				object = ois.readObject();
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				FileUtils.close(ois, fos);
			}
		}
		return object;
	}

	public static void writeObject(File file, Object object) {
		if(file.exists()) {
			FileOutputStream fos = null;
			ObjectOutputStream oos = null;
			try {
				fos = new FileOutputStream(file);
				oos = new ObjectOutputStream(fos);
				
				oos.writeObject(object);
			} catch (IOException e) {
				e.printStackTrace();
			}finally {
				FileUtils.close(oos, fos);
			}
		}
	}
	
	public static List<String> read(File file){
		List<String> lines = new ArrayList<>();
		if(file.exists()) {
			try {
				lines = Files.readAllLines(file.toPath());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return lines;
	}
	
	public static <T extends DataRow> void write(File file, Collection<T> collection){
		List<String> lines = collection.stream()
										.map(DataRow::toLine)
										.collect(Collectors.toList());
		writeLines(file, lines);
	}
	public static void writeLines(File file, Iterable<String> lines) {
		if(file.exists()) {
			try {
				Files.write(file.toPath(), lines);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("...***Finish***...");
		open(file);
	}

	public static File createFile(String pathname) {
		File file = new File(pathname);
		if(!file.exists()) {
			createDir(file.getParent());
			try {
				boolean isSuccess = file.createNewFile();
				System.out.println(">> File '" + file.getName() + "' is created -->"
						+ (isSuccess ? "successful" : "fail"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else {
			System.out.println(">> File '" + file.getName() + "' already existed !");
		}
		return file;
	}
	
	
	//crate folder
	public static File createDir(String dirpath) {
		File dir = new File(dirpath);
		if(!dir.exists()) {
			boolean isSuccess = dir.mkdirs();
			System.out.println(">> Directory '" + dir.getPath() + "' is created --> " 
					+ (isSuccess ? "successful" : "fail"));
		}else {
			System.out.println(">> Directory '" + dir.getPath() + "' already existed....");
		}
		return dir;
	}
	
	public static boolean isFile(File file,String ext) {
		return file.isFile() 
				&&
				file.getName().endsWith("." + ext);
	}
	
	public static void open(File file) {
		if(file.exists()) {			
			try {
				Desktop.getDesktop().open(file);
			} catch (Exception e) {
				e.printStackTrace(); 
			}
		}
	}
	
	public static void close(AutoCloseable ...closeables) {
		Arrays.stream(closeables).forEach(closeable -> {
			try {
				closeable.close();
			} catch (Exception e) {
				e.printStackTrace(); 
			}
		});
	}

}