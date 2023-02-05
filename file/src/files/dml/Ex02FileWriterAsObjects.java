package files.dml;

import java.io.File;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import bean.Trader;
import model.DataModel;
import utils.FileUtils;

public class Ex02FileWriterAsObjects {
	private static final String pathname = "text\\trader\\list.txt";
	public static void main(String[] args) {
		List<Trader> traders = DataModel.getTraders();
		
		List<String> lines = traders.stream()
						.map(trader -> {
							return "["+ trader.getId()+"], "
									  +trader.getName()+" , "
									  +trader.getCity();
						}).collect(Collectors.toList());
		
		File file = FileUtils.createFile(pathname);
		
		FileUtils.write(file,lines);
		
		
	}
}