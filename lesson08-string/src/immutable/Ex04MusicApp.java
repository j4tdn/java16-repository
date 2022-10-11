package immutable;

import java.util.Arrays;

public class Ex04MusicApp {
	public static void main(String[] args) {
		String[] path = { "d:/music/somthingyoulike.mp3", "d:/music/foreoverandone.mp3",
				"d:/music/takemetoyourheart.mov" };
		String[] result = getSongs(path);
		for (String s : result)
			System.out.println(s);
	}

	// --> somethingyoulike, foreverandone
	private static String[] getSongs(String[] paths) {
		String[] result = new String[3];
		int i = 0;
		for (String s : paths) {
			if (s.contains(".mp3")) {
				s = s.substring(s.lastIndexOf("/") + 1);
				s = s.substring(0, s.lastIndexOf("."));
				result[i] = s;
				i++;
			}
		}
		return Arrays.copyOfRange(result, 0, i);
	}
}
