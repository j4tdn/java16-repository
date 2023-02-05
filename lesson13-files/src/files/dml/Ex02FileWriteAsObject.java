package files.dml;

import java.io.File;
import java.util.List;

import bean.Trader;
import model.DataModel;
import utils.FileUtils;

public class Ex02FileWriteAsObject {
	private static final String pathname = "text\\trader\\list.txt";

	public static void main(String[] args) {
		File file = FileUtils.createFile(pathname);

		List<Trader> traders = DataModel.getTraders();

		// List<T> --> List<String>
		// FileUtils,wirteLines(file, lines);

		FileUtils.write(file, traders);

		System.out.println("\n... *** Finshed *** ...");
	}
}
