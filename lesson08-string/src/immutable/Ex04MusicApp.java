package immutable;

import java.util.Arrays;

public class Ex04MusicApp {
	public static void main(String[] args) {
		String[] paths= {
				"d:/music/somthingyoulike.mp3",
				"d:/music/foreoverandone.mp3",
				"d:/music/takemetoyourheart.mov"
		};
		String[] mp3Songs = getSongs(paths, ".mp3");
		for(String song: mp3Songs) {
			System.out.println(song);
		}
	}
	//9 đầu; 4 cuối
	private static String[] getSongs(String[] paths, String ext) {
		String[] songs = new String[paths.length];
		int count=0;
		
		for(String path : paths) {
			if(path.endsWith(ext)) {//nếu path kết thúc bằng".mp3"
				int start = path.lastIndexOf("/")+1;//lấy ký tự "/" cuối cùng
				int end = path.lastIndexOf(".");//+1 để lấy ký tự sau của "/"
				songs[count++] = path.substring(start, end);
			}
		}
		return  Arrays.copyOfRange(songs, 0, count);//từ 0 tới count
		
	}

}
