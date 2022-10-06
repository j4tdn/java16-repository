package immutable;

import java.util.Arrays;

public class Ex07SongApp {
	public static void main(String[] args) {
		String[] path = {
				"d:/music/shapeofyou.mp3",
				"d:/dowload/allweknow.mp3",
				"d:/music/allmywave.mov"
		};
		String[] songnames = song(path);
		for (String songname : songnames) {
			System.out.println(songname + "");
			
		}
	}

	private static String[] song(String[] paths) {
		String[] rs = new String[paths.length];
		int count = 0;
		for (String path : paths) {
			if(path.endsWith(".mp3")) {
				int lastSlashPos = path.lastIndexOf("/");
				int lastDotPos = path.lastIndexOf(".");
				
				String songname = path.substring(lastSlashPos + 1, lastDotPos);
				
				rs[count++] = songname;
			}
		}
		return Arrays.copyOfRange(rs, 0, count);
	}
}
