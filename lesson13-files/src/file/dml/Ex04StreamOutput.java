package file.dml;

import java.io.File;
import model.DataModel;
import utils.FileUtils;

public class Ex04StreamOutput {
	private static final String pathname = "text\\trader\\streaming.txt";
	public static void main(String[] args) {
		File file = FileUtils.createFile(pathname);
		
		FileUtils.writeObject(file, DataModel.getTraders());
		
		FileUtils.open(file);
		System.out.println("*** Finish ***");
	}

}
