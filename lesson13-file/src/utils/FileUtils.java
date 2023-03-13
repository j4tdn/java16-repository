package utils;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
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
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import bean.DataRow;
import model.DataModel;

public class FileUtils {
	private FileUtils() {
		
	}
	@SuppressWarnings("unchecked")
	public static <T> List<T> readObjects(File file){
		return (List<T>) readObject(file);
	}
	public static Object readObject(File file) {
		Object object = null;
		if(file.exists()) {
			FileInputStream fis = null;
			ObjectInputStream ois = null;
			try {
				fis = new FileInputStream(file);
				ois = new ObjectInputStream(fis);
				object = ois.readObject();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				FileUtils.close(ois, fis);
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
				// TODO Auto-generated catch block
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
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}return lines;
	}
	public static <T extends DataRow> void write(File file, Collection <T> object) {
		List<String> lines = object.stream().map(DataRow::toLine)
				.collect(Collectors.toList());
		writee(file, lines);
	}
	//==========DML====================
	public static void writee(File file, Iterable<String> lines) {
		if(file.exists()) {
			// ghi file
			try {
				Files.write(file.toPath(), lines);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Finished");
		FileUtils.open(file);
	}
	
	
	
	//==============DDl=================
	public static File create(String pathname) {
		File file = new File(pathname);
		if(!file.exists()) {
			createDir(file.getParent());
			try {
				boolean isSuccess = file.createNewFile();
				System.out.println("file" + file.getName() + "is created --> "
				+ (isSuccess ? " successfull" : "fail"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		else {
			System.out.println("file " + file.getName() + " already existed !");
		}
		return file;
	}
	public static boolean delete(String pathname) {
		File file = new File(pathname);
		boolean isdeleted = false;
		if(file.exists()) {
			isdeleted = file.delete();
			System.out.println("File " + isdeleted
					+ " is deleted");			
		}
		return isdeleted;
				
	}
	public static boolean delete(File file) {
		boolean isdeleted = file.delete();
		System.out.println("File '" + file.getName() +" ' is deleted");
		return isdeleted;
	}
	public static File createDir(String dirpath) {
		File dir = new File(dirpath);
		if(!dir.exists()) {
			boolean isSuccess = dir.mkdirs();
			System.out.println(">> Directory " + dir.getPath()
			+ "is created -->" + (isSuccess? "successful" : "fail"));
		}
		else {
			System.out.println(">> Directory '" + dir.getPath()+
					"' already existed.....");
		}
		return dir;
	}
	public static Path copy(String sourcePath, String targetDir) {
		Path source = Paths.get(sourcePath);
		Path target = createDir(targetDir).toPath()
				.resolve(rename(source.getFileName()));
		Path path = target;
		try {
			path = Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return path;
	}
	public static Path rename(Path path) {
		
		return Paths.get(rename(path.toString()));
		
	}
	public static String rename(String filename) {
		
		return System.currentTimeMillis() + "_l13_"
				+ filename.charAt(0)
				+ filename.charAt(filename.length() - 1)
				+ filename.substring(filename.lastIndexOf("."));
		
	}
	public static boolean isFile(File file, String ext) {
		return file.isFile() && file.getName().endsWith("." + ext);
		
	}
	public static void open(File file) {
		if(file.exists()) {
			try {
				Desktop.getDesktop().open(file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void close(AutoCloseable...closeables) {
		Arrays.stream(closeables).forEach(t -> {
			try {
				t.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
	}

}
