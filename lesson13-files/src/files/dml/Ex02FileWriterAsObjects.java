package files.dml;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;

import bean.Trader;
import model.DataModel;
import utils.FileUtils;

public class Ex02FileWriterAsObjects {
	
	private static final String pathname = "text\\trader\\list.txt";
	
	public static void main(String[] args) {
		File file = FileUtils.createFile(pathname);
		
		List<Trader> traders = DataModel.getTrader();
		
		
		// List<T> ---> List<String>
		// FileUtils.writeLines(file, lines);
		
		FileUtils.write(file, traders);
		
		System.out.println("Finish!!!");
	}
}
