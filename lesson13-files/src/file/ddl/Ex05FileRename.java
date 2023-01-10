package file.ddl;

import java.io.File;

import util.FileUtils;

public class Ex05FileRename {
	public static void main(String[] args) {
		File source = new File ("upload\\123.png");
		
		String filename = source.getName();
		String newName = FileUtils.rename(filename);
		
		File target = new File(source.getParent(), newName);
		
		source.renameTo(target);

	}
}
