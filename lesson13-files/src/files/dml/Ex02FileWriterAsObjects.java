package files.dml;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;

import bean.Trader;
import model.DataModel;
import util.FileUtils;

public class Ex02FileWriterAsObjects {
	
	
private static final String pathname = "text\\trader\\list.txt";
	
	public static void main(String[] args) {
		File file = FileUtils.createFile(pathname);
		List<Trader> traders = DataModel.getTraders();
		
		
		// List<T> --> List<String>
		// FileUtils.writeLine(file, lines);
		FileUtils.write(file, traders);
		
		System.out.println("...Finish...");
	}
}
