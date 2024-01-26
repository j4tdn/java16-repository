package view;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		String[] paths = { "D:/music/somethingyoulike.mp3", "D:/music/idontknow.mp3", "D:/music/seeyouagain.mov" };
		String[] songs = getSongs(paths,".mov");
	for(String s :songs) {
		System.out.println(s);
	}
		
	}

	private static String[] getSongs(String[] paths, String ext) {
		String[] songs = new String[paths.length];
		
		int count = 0;
		
		for (String path : paths) {
			if(path.endsWith(ext)) {
				int start = path.lastIndexOf("/") + 1;
				int end = path.lastIndexOf(".");
				songs[count++] = path.substring(start, end);
			}
		}
		return Arrays.copyOfRange(songs, 0, count);
	}
}
