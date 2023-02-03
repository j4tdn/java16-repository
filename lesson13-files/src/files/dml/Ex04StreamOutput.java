package files.dml;

import java.io.File;
import java.util.List;

import bean.Trader;
import files.utils.FileUtils;
import model.DataModel;

public class Ex04StreamOutput {
	private static final String pathname = "text\\trader\\streaming.txt";

	/* 
	 * Serialisation -> 1 cơ chế convert file, object into a byte stream
	=> for security purpose
	=> every written object has to be serialized data
	=> implement T from Serializable => serialversionUID
	 */
	public static void main(String[] args) {
		File file = FileUtils.createFile(pathname);
		List<Trader> traders = DataModel.getTraders();
		FileUtils.writeObject(file, traders);
		FileUtils.open(file);
	}
}
