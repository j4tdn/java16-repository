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

import bean.DataRow;

public class FileUtils {
	private FileUtils() {
	}
	
	@SuppressWarnings("unchecked")
	public static <T> List<T> readObjects(File serializedFiles) {
		return (List<T>) readObject(serializedFiles);
	}
	
	public static Object readObject(File serializedFiles) {
		Object object  = null;
		if(serializedFiles.exists()) {
			FileInputStream fis = null;
			ObjectInputStream ois = null;
			try {
				fis = new FileInputStream(serializedFiles);
				ois = new ObjectInputStream(fis);
				
				// streaming.txt
				object = ois.readObject();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
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
				
				// written object --> serialization data
				// implements T from Serializable
				// serialversionUID
				oos.writeObject(object);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				FileUtils.close(fos, oos);
			}
		}
	}
	
	//////////////DML ////////////////
	public static List<String> read(File file){
		List<String> lines = new ArrayList<>();
		if(file.exists()) {
			try {
				lines = Files.readAllLines(file.toPath());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
			return lines;
	}
	
	public static <T extends DataRow> void write(File file, Collection<T> collection) {
		List<String> lines = collection.stream()
									.map(DataRow::toLine)
									.collect(Collectors.toList());
		writeLines(file, lines);
	}
	
	public static void writeLines(File file, Iterable<String> lines) {
		if (file.exists()) {
			try {
				Files.write(file.toPath(),lines);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		FileUtils.open(file);
	}
	
	////////////// DDL ////////////////
	public static Path copy(String sourcePath, String targetDir) {
		Path source = Paths.get(sourcePath);
		Path target = createDir(targetDir).toPath().resolve(rename(source.getFileName()));
		Path path = target;
		try {
			path = Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return path;
	}

	public static File createFile(String pathname) {
		File file = new File(pathname);
		if (!file.exists()) {
			createDir(file.getParent());
			try {
				boolean isSuccess = file.createNewFile();
				System.out.println(
						">> File '" + file.getName() + "' is created --> " + (isSuccess ? "successful" : "failed"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println(">> File " + file.getName() + " already existed !");
		}
		return file;
	}

	public static File createDir(String dirpath) {
		File dir = new File(dirpath);
		if (!dir.exists()) {
			boolean isSuccess = dir.mkdirs();
			System.out.println(
					">> Directory '" + dir.getPath() + "' is created --> " + (isSuccess ? "successful" : "fail"));
		} else {
			System.out.println(">> Directory " + dir.getPath() + " already existed ...");
		}
		return dir;
	}

	public static boolean delete(String pathname) {
		File file = new File(pathname);
		boolean isDeleted = file.delete();
		if (file.exists()) {
			isDeleted = file.delete();
			System.out.println(">> File '" + file.getName() + "' is deleted !!!");
		}
		System.out.println(">> File '" + file.getName() + "' is deleted !!!");

		return isDeleted;
	}

	public static boolean delete(File file) {
		boolean isDeleted = file.delete();
		if (file.exists()) {
			isDeleted = file.delete();
			System.out.println(">> File '" + file.getName() + "' is deleted !!!");
		}
		System.out.println(">> File '" + file.getName() + "' is deleted !!!");

		return isDeleted;
	}

	public static Path rename(Path path) {
		return Paths.get(rename(path.toString()));
	}

	public static String rename(String filename) {
		return System.currentTimeMillis() 
				+ "_113_" 
				+ filename.charAt(0)
				+ filename.charAt(filename.lastIndexOf(".") - 1) 
				+ filename.substring(filename.lastIndexOf("."));
	}

	public static boolean isFile(File file, String ext) {
		return file.isFile() && file.getName().endsWith("." + ext);
	}

	public static void open(File file) {
		if (file.exists()) {
			try {
				Desktop.getDesktop().open(file);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void  close(AutoCloseable ...closeables) {
		Arrays.stream(closeables).forEach(closeable -> {
			try {
				closeable.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

}
