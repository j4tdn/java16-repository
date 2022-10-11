package immutable;

public class Ex04MusicApp {
	public static void main(String[] args) {
		String[] path = {
				"d:/music/somthingyoulike.mp3",
				"d:/music/foreoverandone.mp3",
				"d:/music/takemetoyourheart.mov"	
		};
		System.out.println(getSongs(path));
	}
	private static String[] getSongs(String[] path) {
		String[] result = new String[path.length];
		int count = 0;
		for(String paths: path) {
			if(paths.endsWith(".mp3")) {
				int start = paths.lastIndexOf("/") + 1;
				int end = paths.lastIndexOf("/");
				result[count ++] = paths.substring(start, end);
			}
		}
		return result;
	}

}
