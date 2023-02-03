package files.dml;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;

import bean.Trader;
import files.utils.FileUtils;
import model.DataModel;

public class Ex02FileWriterAsObjects {
	private static final String pathname = "text\\trader\\list.txt";

	public static void main(String[] args) {
		File file = FileUtils.createFile(pathname);
		List<Trader> traders = DataModel.getTraders();
		List<String> lines = traders.stream().map(trader -> {
			return "[" + trader.getId() + "], " + trader.getName() + ", " + trader.getAddress();
		}).collect(Collectors.toList());
//		FileUtils.write(file, lines);
		FileUtils.write(file, traders);
	}
}
