package immutable;

import java.util.Arrays;

public class Ex04MusicApp {
	public static void main(String[] args) {
		String[] paths = { "d:/music/somethingyoulike.mp3", "d:/music/foreoverandone.mp3",
				"d:/music/takemetoyourheart.mov" };
//		for (int i = 0; i < paths.length; i++) {
//			if (paths[i].endsWith(".mp3")) {
//				System.out.println((i + 1) + ". " + paths[i].substring(9).replaceAll(".mp3", ""));
//			}
//		}
		String[] songs = getSongs(paths, "mov");
		for (String song:songs) {
			System.out.println(song);
		}
	}

	private static String[] getSongs(String[] paths, String ext) {
		String[] songs = new String[paths.length];
		int count = 0;
		for (String path : paths) {
			if (path.endsWith(ext)) {
				int start = path.lastIndexOf("/") + 1;
				int end = path.lastIndexOf(".");
				songs[count++] = path.substring(start, end);
			}
		}
		return Arrays.copyOfRange(songs, 0, count);
	}
}
