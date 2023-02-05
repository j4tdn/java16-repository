package file.dml;
//ghi file

import java.io.File;

//viết file dùng serialization

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

import bean.Trader;
import model.DataModel;
import utils.FileUtils;

public class Ex04StreamOutput {
	private static final String pathname ="text\\trader\\Streaming.tst";
	public static void main(String[] args) {
		File file = new File(pathname);
		List<Trader> traders =DataModel.getTraders();
		
		if(file.exists()) {
			//để ghi file
			FileOutputStream fos = null;
			ObjectOutputStream oos = null;
			try {
				fos = new FileOutputStream(file);
			    oos = new ObjectOutputStream(fos);
			    
			    //yêu cầu object ghi phải là 1 serialization data
			    //implement T từ Serializable
			    //serialversionUID
			    oos.writeObject(traders);
			}  catch (IOException e) {

				e.printStackTrace();
			}finally {
				FileUtils.close(oos,fos);
			}
			
		}
		FileUtils.open(file);
		//c2
		FileUtils.writeObject(file, DataModel.getTraders());
		System.out.println("---finish---");
		
	}

}
