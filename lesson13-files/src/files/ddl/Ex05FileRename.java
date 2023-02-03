package files.ddl;

import java.io.File;

public class Ex05FileRename {
	public static void main(String[] args) {
		File source = new File("upload\\123.png");
		String newName = "euro-woman.png";
		File target = new File(source.getParent(), newName);
		source.renameTo(target);
	}
}
