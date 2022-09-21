package view;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex07FileWritterFinally {
	public static void main(String[] args) {
		File file = createFile("data.txt");
		System.out.println("Finished");
		writeFile(file);
	
	}
	private static boolean writeFile(File file) {
		FileWriter fw = null;
		try {
			//open file
			fw = new FileWriter(file);
			fw.write("Item01\n");
			fw.write("Item02\n");
			fw.write("Item03\n");
			fw.write("Item04\n");
			fw.write("Item05\n");
			//....
			fw.write(5/0);
			fw.write("Item k - 1 \n");
			fw.write("Item k\n");
			//....
			fw.write("Item999\n");
			fw.write("Item1000\n");
			//save and close
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
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
	
	private static File createFile(String pathName) {
		File file = new File(pathName);
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return file;
	}

}
