package files;

import java.io.File;
import java.io.IOException;

class FileDircreate {
	public static void main(String[] args) {
		File dir = new File("root");
		if(!dir.exists()) {
			try {
				boolean a = dir.createNewFile();
				System.out.println(a ? "1" : "0");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
