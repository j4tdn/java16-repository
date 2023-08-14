package file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;

public class Ex01File {

	static List<Integer> list;

	public static void main(String[] args) throws IOException {

		list = new ArrayList<>();

		String url = "D:\\input.txt";
		FileInputStream fileInputStream = new FileInputStream(url);
		Scanner scanner = new Scanner(fileInputStream);

		while (scanner.hasNextLine()) {
			String ip = scanner.nextLine();
			getNumberFromText(ip + " ");
		}
		list.remove(0);
		Collections.sort(list);

		FileOutputStream fileOutputStream = new FileOutputStream("D:\\output.txt");

		for (int i = 0; i < list.size(); i++) {
			byte b[] = (list.get(i).toString() + "\n").getBytes();
			fileOutputStream.write(b);
		}
		fileInputStream.close();
		fileOutputStream.close();
	}

	public static void getNumberFromText(String s) {
		String tmp = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				tmp += s.charAt(i);
			} else {
				if (tmp.length() != 0)
					list.add(Integer.parseInt(tmp));
				tmp = "";
			}
		}
	}

}