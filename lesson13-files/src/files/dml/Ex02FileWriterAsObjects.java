package files.dml;

import java.io.File;
import java.util.List;

import bean.Trader;
import model.DataModel;
import utils.FileUtils;

public class Ex02FileWriterAsObjects {

	private static final String pathname = "text\\trader\\list.txt";
	public static void main(String[] args) {
		File file = FileUtils.createFile(pathname);
		List<Trader> traders = DataModel.getTraders();
		
		FileUtils.write(file, traders);
		FileUtils.open(file);
		System.out.println("<<<<.... Finish.....>>>");
		
	}
}
