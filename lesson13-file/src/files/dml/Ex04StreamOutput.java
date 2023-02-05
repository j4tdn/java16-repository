package files.dml;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import utils.FileUtils;

public class Ex04StreamOutput {
	private static final String pathname = "text\\trader\\streaming.txt";
	public static void main(String[] args) {
		File file = new File(pathname);
		if(file.exists()) {
			FileOutputStream fos = null;
			ObjectOutput oos = null;
			try {
				fos = new FileOutputStream(file);
				oos = new ObjectOutputStream(fos);				
			}catch(IOException e) {
				e.printStackTrace();
			} finally{
				FileUtils.close(oos,fos);
			}
		}
		FileUtils.open(file);
		System.out.println("... *** Finished *** ...");
	}
}
