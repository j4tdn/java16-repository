package inmutable;

import java.util.Arrays;

public class Ex04MusicApp {
	public static void main(String[] args) {
		String[] parth = { "d:/music/somthingyoulike.mp3", 
				"d:/music/foreoverandone.mp3",
				"d:/music/takemetoyourheart.mov" };
		String[] mp3Songs = getSong(parth, ".mov");
		for(String song: mp3Songs) {
			System.out.println(song);
		}
	}

	private static String[] getSong(String[] parths, String ext) {
		String[] songs = new String[parths.length];
		int count = 0;
		for (String parth : parths) {
			if (parth.endsWith(ext)) {
				int start = parth.lastIndexOf("/") + 1;
				int end = parth.lastIndexOf(".");
				songs[count++] = parth.substring(start, end);
			}
		}
		return Arrays.copyOfRange(songs, 0, count);
	}
}
