package util;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileUtils {
	private FileUtils() {

	}

	//////////////////////// DML /////////////////////////////
	public static List<String> read(File file) {
		List<String> lines = new ArrayList<>();
		if (file.exists()) {
			try {
				lines = Files.readAllLines(file.toPath());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return lines;
	}

	public static <T> void write(File file, Collection<T> collection) {
		List<String> lines = collection.stream().map(object -> String.valueOf(object)).collect(Collectors.toList());

		writeLines(file, lines);
	}

	public static void writeLines(File file, Iterable<String> lines) {
		if (file.exists()) {
			// ghi file
			try {
				Files.write(file.toPath(), lines);

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		FileUtils.open(file);
	}

	public static Path copy(String sourcePath, String targetDir) {
		Path source = Paths.get(sourcePath);
		Path targer = createDir(targetDir).toPath().resolve(rename(source.getFileName()));
		Path path = targer;
		try {
			path = Files.copy(source, targer, StandardCopyOption.REPLACE_EXISTING);
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
				boolean isSucces = file.createNewFile();
				System.out
						.println(">> File " + file.getName() + " is created --> " + (isSucces ? "succesfull" : "fail"));
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
			boolean isSucces = dir.mkdirs();
			System.out.println(
					">> Directory '" + dir.getPath() + "' is created --> " + (isSucces ? "successfull" : "fail"));
		} else {
			System.out.println(">> Directory '" + dir.getPath() + "' already existed...");
		}
		return dir;
	}

	public static boolean delete(String pathname) {
		File file = new File(pathname);
		boolean isDeleted = false;
		if (file.exists()) {
			isDeleted = file.delete();
			System.out.println(">> File '" + file.getName() + "' is deleted");
		}
		return isDeleted;
	}

	public static boolean delete(File file) {
		boolean isDeleted = file.delete();
		System.out.println(">> File '" + file.getName() + "' is deleted");
		return isDeleted;
	}

	public static Path rename(Path path) {
		return Paths.get(rename(path.toString()));
	}

	public static String rename(String filename) {
		return System.currentTimeMillis() + " l13 " + filename.charAt(0)
				+ filename.charAt(filename.lastIndexOf(".") - 1) + filename.substring(filename.lastIndexOf("."));
	}

	public static boolean isFile(File file, String ext) {
		return file.isFile() && file.getName().endsWith("." + ext);
	}

	public static void open(File file) {
		if (file.exists()) {
			try {
				Desktop.getDesktop().open(file);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
