package files.ddl;

import java.io.File;

import utils.FileUtils;

public class Ex05FileRename {
	public static void main(String[] args) {

		File source = new File("upload\\1673167731071_113_tg.png");
		
		String fileName = source.getName();
		String newName = FileUtils.rename(fileName);
		File target  =new File(source.getParent(), newName);
	
		source.renameTo(target);
		
		System.out.println("....*** Finished ***....");
	}
}
