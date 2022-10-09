package immutable;

public class Ex04MusicApp {
	public static void main(String[] args) {
		String[] paths = { "d:/music/somthingyoulike.mp3", "d:/music/foreoverandone.mp3",
				"d:/music/takemetoyourheart.mov" };
		String[] songs = getSongs(paths);
		System.out.println(songs);
	}
	private static String[] getSongs(String[] paths) {
		String[] songs = new String[paths.length];
		int count = 0;
		for (String path : paths) {
			if (path.endsWith(".mp3")) {
				int start = path.lastIndexOf("/") + 1;
				int end = path.lastIndexOf(".");
				songs[count++] = path.substring(start, end);
			}
		}
		return songs;
	}
}
