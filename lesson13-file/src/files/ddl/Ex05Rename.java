package files.ddl;

import java.io.File;



import utils.FileUtils;

public class Ex05Rename {
	public static void main(String[] args) {
		File Source = new File("upload\\flower.png");
		
		String filename = Source.getName();
		String newName =FileUtils.rename(filename);
		
		File target = new File(Source.getParent(), newName);
		
		Source.renameTo(target);
		
System.out.println("...*** finish ***...");
	}

}
