package files.ddl;

import java.io.File;

public class Ex02DirCreator {
	// dirpath --> root --> mkdir, mkdirs
	// dirpath --> root\\image --> mkdirs
	private static String dirpath = "root\\image";

	public static void main(String[] args) {
		File dir = new File(dirpath);
		if (!dir.exists()) {
			boolean isSucces = dir.mkdirs();
			System.out.println(
					">> Directory '" + dir.getPath() + "' is created --> " + (isSucces ? "successfull" : "fail"));
		}

		System.out.println("...*** Finished ***...");
	}
}
