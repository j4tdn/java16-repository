package files.dml;

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
		File file = FileUtils.createFile(pathname);
		List<Trader> traders = DataModel.getTrader();
		
		FileUtils.writeObject(file, traders);
		FileUtils.open(file);
		
		System.out.println("Finish!!!");
		
	}
}
