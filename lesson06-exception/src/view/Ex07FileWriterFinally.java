package view;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex07FileWriterFinally {
	public static void main(String[] args) {
		File file = createrFile("data.txt");
		writeFile(file);
		System.out.println("Finished ... ");
		
	}
	private static boolean writeFile(File name){
		FileWriter fw = null;
		try {
			fw = new FileWriter(name);
			fw.write("Item 01\n");
			fw.write("Item 02\n");
			fw.write("Item 03\n");
			fw.write("Item 04\n");
			fw.write("Item 05\n");
			
			fw.write(6/0);
			fw.write("Item 0k\n");
			fw.write("item k -1\n");
			fw.write("item k \n");
			fw.write("item 9999\n");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			//finally la block code luon duoc thuc thi
			//du try block co duoc exception hay khong
			close(fw);
		}
		
//		finally {
//			try {
//				fw.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
		
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
		File file = new File(pathname);
		if(file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return file;
	}

}
