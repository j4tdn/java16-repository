package file.ddl;

import java.io.File;
import java.io.IOException;

public class Ex01FileCreator {
	private static String pathname = "content.txt";
	
		// pathname: file name --> content.txt
		// pathname: path to file name --> data/content.txt
	public static void main(String[] args) {	
		File file = new File(pathname);
		if(!file.exists()) {
			try {
				boolean isSuccess = file.createNewFile();
				System.out.println(">> File " + file.getName()
				+ "is created --> " 
				+ (isSuccess ? "success" : "fail"));;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}// compile exception
		}
		else {
			System.out.println(">> File '" + file.getName() 
			+ "get ready");
		}
		System.out.println("...Finished...");
	}
}
