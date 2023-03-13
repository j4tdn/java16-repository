package file.dml;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;

import bean.Trader;
import model.DataModel;
import utils.FileUtils;

public class Ex02FileWritterWithObject {
	private static final String pathname = "text\\trader\\list.txt";
	public static void main(String[] args) {
		List<Trader> traders = DataModel.getTraders();
		
		File file = FileUtils.create(pathname);
		FileUtils.write(file, traders);
	}

}
