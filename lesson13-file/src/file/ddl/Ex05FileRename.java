package file.ddl;

import java.io.File;

import utils.FileUtils;

public class Ex05FileRename {
	public static void main(String[] args) {
		File file = new File("upload\\flower.png");
		String filename = file.getName();
		String newname = FileUtils.rename(filename);
		File target = new File(file.getParent(), newname);
		file.renameTo(target);
	}

}
