package file.dml;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

import bean.Trader;
import model.DataModel;
import utils.FileUtils;

public class Ex04StreamOutput {
	private static final String pathname = "text\\trader\\streaming.txt";
	public static void main(String[] args) {
		File file = FileUtils.create(pathname);
		List<Trader> traders = DataModel.getTraders();
		FileUtils.write(file, traders);
		FileUtils.open(file);
	}
	

}
