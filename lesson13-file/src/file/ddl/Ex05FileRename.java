package file.ddl;

import java.io.File;

import utils.FileUtils;

public class Ex05FileRename {
	public static void main(String[] args) {
		File source = new File("upload\\computer.png");
		
		String filename = source.getName(); // computer.png
		String newName  = FileUtils.rename(filename); // ...
		
		File target = new File(source.getParent() , newName); // upload\newName
		
		source.renameTo(target);
		
		System.out.println("... *** Finished *** ... ");
		
	}
}
