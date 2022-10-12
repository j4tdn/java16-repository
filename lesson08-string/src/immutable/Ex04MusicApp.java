package immutable;


import java.util.Arrays;

public class Ex04MusicApp {
	public static void main(String[] args) {
		String[] paths = {
			"d:/music/somthingyoulike.mp3",
			"d:/music/foreoverandone.mp3",
			"d:/music/takemetoyourheart.mov"
		};
		String[] mp3Songs = getSongs(paths, ".mov");
		for (String song: mp3Songs) {
			System.out.println(song);
		}
	}
	
	// --> somthingyoulike, foreoverandone
	private static String[] getSongs(String[] paths, String ext) {
		String[] songs = new String[paths.length];
		int count = 0;
		for (String path: paths) {
			if (path.endsWith(ext)) {
				int start = path.lastIndexOf("/") + 1;
				int end = path.lastIndexOf(".");
				songs[count++] = path.substring(start, end);
			}
		}
		return Arrays.copyOfRange(songs, 0, count);
	}
}