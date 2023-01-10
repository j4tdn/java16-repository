package files.dml;

import java.io.File;
import java.util.List;

import bean.Trader;
import util.FileUtils;

public class Ex05FileStreamingInput {
	private static final String pathname="text\\trader\\streaming.txt";
	
	public static void main(String[] args) {
		File file = new File(pathname);
		
		List<Trader> traders = FileUtils.readObjects(file);
		
		traders.forEach(System.out::println);
	}
}
