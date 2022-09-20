package view;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex05FinallyDemo {
	public static void main(String[] args) {
		File file = new File("data.txt");
		
			if(file.exists()) {
				writeData(file);
			}
		System.out.println("Finished");
		
	}
	private static void writeData(File file) {
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			fw.write("Hi All\n");
			fw.write("I would like take today off\n");
			fw.write("Line1 \n");
			fw.write("Line2 \n");
			fw.write("Line3 \n");
			fw.write("Line4 \n");
			fw.write("Line5 \n");
			fw.write("Line6 \n");
			int value = 22/0;
			fw.write("Line... \n");
			fw.write("Line1000 \n");
			fw.write("Line k  " + value +"\n");
			fw.write("Best Regards \n");
		} catch (IOException | ArithmeticException e) {
			
			e.printStackTrace();
		} finally {
			// save and close file after writing
			try {
				fw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
}

}
