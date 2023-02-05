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
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import bean.DataRow;

public class FileUtils {
	private FileUtils() {

	}
	//trả về list
	public static <T> List<T> readObject(File serializedFile){
		return (List<T>)readObject(serializedFile);
	}
	
	//đọc file serialize
	public static Object readObJect(File file) {
		Object object =null;
		if(file.exists()) {
			//để ghi file
			FileInputStream fis = null;
			ObjectInputStream ois = null;
			try {
				fis = new FileInputStream(file);
			    ois = new ObjectInputStream(fis);
			    
			    //yêu cầu object ghi phải là 1 serialization data
			    //implement T từ Serializable
			    //serialversionUID
			   object = ois.readObject();
			}  catch (Exception e) {

				e.printStackTrace();
			}finally {
				FileUtils.close(ois,fis);
			}
			
		}
		return object;
	}
	
	
	//ghi file serialization
	public static void writeObject(File file, Object object) {
		if(file.exists()) {
			//để ghi file
			FileOutputStream fos = null;
			ObjectOutputStream oos = null;
			try {
				fos = new FileOutputStream(file);
			    oos = new ObjectOutputStream(fos);
			    
			    //yêu cầu object ghi phải là 1 serialization data
			    //implement T từ Serializable
			    //serialversionUID
			    oos.writeObject(object);
			}  catch (IOException e) {

				e.printStackTrace();
			}finally {
				FileUtils.close(oos,fos);
			}
			
		}
	}
	
	//đọc file
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
	
	
	
	//hàm write truyền được List<T>
	//convert object sang String
	public static<T extends DataRow> void write(File file, Collection<T> collection) {
		List<String> line = collection.stream().
				map(Object -> Object.toLine())//map(DataRow::toLine)
				.collect(Collectors.toList());
	
	writeLines(file, line);
	}
	
	//hàm viết vào file
	public static void writeLines(File file, Iterable<String> lines) {
		if(file.exists()) {
			//nếu file tồn tại thì ghi file
			try {//StandardOpenOption.APPEND: ghi thêm ở dưới khi load lại
				Files.write(file.toPath(), lines,StandardOpenOption.APPEND);
				
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
		System.out.println("---finish---");
		FileUtils.open(file);//chạy xong rồi mở file ra xem xét
	
	}
	
	
	
	////////////DDL///////////////////
	//text\\data\\content.txt
	public static File createFile(String pathname) {
		File file = new File(pathname);
		if(!file.exists()) {
			//....
			createDir(file.getParent());
			try {
				boolean isSuccess=file.createNewFile();
				System.out.println(">>file " +file.getName()+"is created -->" +(isSuccess ? "successful" : "fail"));
			}catch(IOException e) {
				e.printStackTrace();
			}
		}else {
			System.out.println(">>file " +file.getName() + "already existed !");
		}
		System.out.println("--finish--");
		
		return file;
	}
	public static boolean delete(String pathname) {
		File file = new File(pathname);
		boolean isDeleted = false;
		if(file.exists()) {
			isDeleted =file.delete();
			System.out.println(">> file '" +file.getName() + "'is delete !!!");
		}
	
		
		return isDeleted;
	}
	
	public static boolean delete(File file) {
		boolean isDeleted = file.delete();
		
		System.out.println(">> file '" +file.getName() + "'is delete !!!");
		
		return isDeleted;
	}
	public static File createDir(String dirpath) {
		File dir = new File(dirpath);
		if(!dir.exists()) {
			boolean isSuccess = dir.mkdirs();
			System.out.println(">> Directory " + dir.getParent() 
			                                   + "' is created --> " 
			                                   +(isSuccess? "successful" : "fail"));
		}else {
			System.out.println(">> Directory " + dir.getParent() 
            + "' already existed --> ");
		}

	return dir;
	}
	public static Path copy(String sourcePath, String targetDir) {
		Path source = Paths.get(sourcePath);
		Path target = createDir(targetDir)
				.toPath()
				.resolve(rename(source.getFileName()));
		Path path = target;
		try {
			path = Files.copy(source,target, StandardCopyOption.REPLACE_EXISTING);
		}catch (IOException e) {
			e.printStackTrace();
		}
		return path;
	}
	
	public static Path rename(Path path) {
		return Paths.get(rename(path.toString()));
	}
	
	public static String rename(String filename) {
		return System.currentTimeMillis()
				+ "l13"
				+ filename.charAt(0)
				+ filename.charAt(filename.lastIndexOf(".") - 1)
				+ filename.substring(filename.lastIndexOf("."));
	}
	public static boolean isFile(File file, String ext) {
		return file.isFile()&&file.getName().endsWith("." +ext);
	}
	
	//mở file khi ghi xong
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
	
	//hàm close
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
