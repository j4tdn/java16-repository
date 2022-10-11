package immutable;

import java.util.Arrays;

public class Ex04MusicApp {
	public static void main(String[] args) {

		String[] paths = {
				"d:/music/somthingyoulike.mp3",
				"d:/music/foreoverandone.mp3",
				"d:/music/takemetoyourheart.mov"
		};
		String[] mp3songs = getsongS(paths);
		for(String song: mp3songs)
		{
			System.out.println(song);
		}
	}
	
	private static String[] getsongS(String[] paths)
	{
		String[] songs = new String[paths.length];
		int j = 0;
		for(String p : paths)
		{
			if(p.endsWith(".mp3"))
			{
				int start = p.lastIndexOf("/") + 1;
				int end = p.lastIndexOf(".");
				songs[j ++] = p.substring(start,end);
				
			}
		}
		return Arrays.copyOfRange(songs, 0, j);
	}
}
