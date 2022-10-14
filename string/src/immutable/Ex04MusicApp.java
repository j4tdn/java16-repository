package immutable;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex04MusicApp {
	public static void main(String[] args) {
		String[] path = {"d:/music/somthingyoulike.mp3", "d:/music/foreoverandone.mp3", "d:/music/takemetoyourheart.mov", "d:/music/nothinglikeyou.mp3"};
		String ext = ".mp3";
		//System.out.println(Arrays.toString(getSongs(path)));
		IntStream.range(0, path.length).forEach(o->{
			System.out.print(path[o].endsWith(ext)? path[o].substring(path[o].lastIndexOf("/")+1, path[o].lastIndexOf(".")) + "\n" : "");
		});
	}
	private static String[] getSongs(String[] paths) {
		String[] rs = new String[paths.length];
		int count = 0;
		for (int i = 0; i < paths.length; i++) {
			if(paths[i].endsWith(".mp3")){
				rs[count++] = paths[i].substring(paths[i].lastIndexOf("/")+1, paths[i].lastIndexOf("."));
			}
		}
		return Arrays.copyOfRange(rs, 0, count);
	}
}
