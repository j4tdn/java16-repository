package files;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	public static void main(String[] args) {
		File file = new File("content.txt");
	    if(!file.exists()) {
	        try {
				boolean isucces = file.createNewFile();
				System.out.println(isucces ? "succes" : "fail");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	}

}
