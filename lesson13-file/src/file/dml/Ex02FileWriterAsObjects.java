package file.dml;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;

import bean.Trader;
import model.DataModel;
import utils.FileUtils;


//ghi 1 danh sách các đối tượng thay vì 1 String

public class Ex02FileWriterAsObjects {
	private static final String pathname ="text\\trader\\list.txt";
	
	public static void main(String[] args) {
		List<Trader> traders = DataModel.getTraders();
		
		//Từng Trader convert--> String
		
		List<String> lines = traders.stream().map(trade -> {
			return "[" + trade.getId() + "], "
					   + trade.getName() 
					   + trade.getAdress() ;
		}).collect(Collectors.toList());
		
		File file = FileUtils.createFile(pathname);
		
		//List<T> --> List<String>
		FileUtils.writeLines(file, lines);//tạo file
		
		//c2
		
		FileUtils.write(file, traders);
		
		System.out.println("---finish---");
	}
	
}
