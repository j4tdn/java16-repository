package view;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Ex01 {
	
	static List<Integer> list;
	
	public static void main(String[] args) throws IOException {
		
		list = new ArrayList<>();
		
        String url = "D:\\JAVA WEB\\JAVA 16\\java16-test\\java16-tphat-test\\java\\java16-tphat-java\\input.txt";
        FileInputStream fileInputStream = new FileInputStream(url);
        Scanner scanner = new Scanner(fileInputStream);
        
        while(scanner.hasNextLine())
        {
           String s=scanner.nextLine();
           getNumber(s+" ");
        }
        list.remove(0);
        Collections.sort(list);
        
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\\\JAVA WEB\\\\JAVA 16\\\\java16-test\\\\java16-tphat-test\\\\java\\\\java16-tphat-java\\\\output.txt");
        
        for(int i=0;i<list.size();i++) {
        	byte b[] = (list.get(i).toString()+"\n").getBytes();
        	fileOutputStream.write(b);
        }
        fileInputStream.close();
        fileOutputStream.close();
	}
	
	public static void getNumber(String s) {
		String tmp="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				tmp+=s.charAt(i);
			}
			else {
				if(tmp.length()!=0)
					list.add(Integer.parseInt(tmp));
				tmp="";
			}
		}
	}

}
