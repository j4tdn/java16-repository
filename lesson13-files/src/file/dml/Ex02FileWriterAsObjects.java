package file.dml;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;

import bean.Trader;
import model.DataModel;
import utils.FileUtils;

public class Ex02FileWriterAsObjects {
	private static final String pathname = "text\\list.txt";
	public static void main(String[] args) {
		List<Trader> traders = DataModel.getTraders();
		File file = FileUtils.createFile(pathname);
		
//		List<String> lines = traders.stream()
//				.map(trader -> {
//					return "[" + trader.getId() + "], "
//							+ trader.getName() + ", "
//							+ trader.getAddress();
//				}).collect(Collectors.toList());

//		FileUtils.writeLines(file, lines);
		
		FileUtils.write(file, traders);
		
		System.out.println("*** Finish ***");
		
	}
	

}
