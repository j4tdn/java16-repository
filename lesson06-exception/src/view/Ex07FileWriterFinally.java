package view;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex07FileWriterFinally {
	public static void main(String[] args) {
		File file = createrFile("data.txt");
		
		writeFile(file);
		
		System.out.println("Finished...");
	}
	
	private static boolean writeFile(File file) {
		FileWriter fw = null;
		try {
			//open file
			fw = new FileWriter(file);
			
			//write file
			fw.write("Item 01\n");
			fw.write("Item 02\n");
			fw.write("Item 03\n");
			fw.write("Item 04\n");
			fw.write("Item 05\n");
			//...
			fw.write("Item K - 1\n");
			fw.write(5/0);
			fw.write("Item K\n");
			//...
			
			fw.write("998");
			fw.write("999");
		

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// save and close
			close(fw);
		}	
		
		return true;
	}
	
	private static void close(FileWriter fw) {
		try {
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static File createrFile(String pathname) {
		File file= new File(pathname);
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		return file;
	}
}
