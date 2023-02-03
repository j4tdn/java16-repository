package files.ddl;

import java.nio.file.Path;

import files.utils.FileUtils;

public class Ex03FileUpload {
	// source : path\\file -> root\\image\\euro-women.png
	// target : upload => after : upload\\euro-women.png
	// upload(source, target)
	

	
	public static void main(String[] args) {
		// virtual : JFileChooser --> root\\image\\euro-women.png
		@SuppressWarnings("unused")
		Path newPath = FileUtils.copy("root\\image\\euro-woman.png", "upload");
	}
}
