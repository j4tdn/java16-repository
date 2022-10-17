package immutable;

import java.util.Arrays;

public class Ex04MusicApp {
	public static void main(String[] args) {
		String[] paths = {
				"d:/music/somthingyoulike.mp3",
		        "d:/music/foreoverandone.mp3",
		        "d:/music/takemetoyourheart.mov"
		};
		for (String s : getSongs(paths)) {
			System.out.println(s);
		}
		
	}
	private static String[] getSongs(String[] paths) {
		
		String[] paths1 = new String[paths.length];
		int i=0;
		for (String path : paths) {
			if (path.endsWith(".mp3")) {
				paths1[i] = path.substring(path.lastIndexOf("/")+1, path.lastIndexOf("."));
				i=i+1;
			}
		}	
		return Arrays.copyOfRange(paths1, 0, i);
	}
}
