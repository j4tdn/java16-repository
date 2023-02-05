package file;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	public static void main(String[] args) {
		File file = new File("conten.txt");
		if(!file.exists() ) {
			try {
				boolean isSuccess = file.createNewFile();
				System.out.println(isSuccess ? "succes" : "fail");
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		else {
			System.out.println("no");
		}
	}

}
