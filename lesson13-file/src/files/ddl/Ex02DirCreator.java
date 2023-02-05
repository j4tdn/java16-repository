package files.ddl;

import java.io.File;

public class Ex02DirCreator {
	//dirpath -->root
	//dirpath -->root\\image-->mkdirs
	
	private static String dirpath = "root\\images";
	
	public static void main(String[] args) {
		File dir = new File(dirpath);
		if(!dir.exists()) {
			boolean isSuccess = dir.mkdirs();
			System.out.println(">> Directory " + dir.getParent() 
			                                   + "' is created --> " 
			                                   +(isSuccess? "successful" : "fail"));
		}
		System.out.println("\n...**finish**...");
	}

}
