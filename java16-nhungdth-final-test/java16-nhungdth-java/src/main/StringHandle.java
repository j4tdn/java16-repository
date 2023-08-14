package main;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
import java.util.List;

import java.util.Collections;

public class StringHandle {
	
	static List<Integer> list;
	
	public static void main(String[] args) throws IOException {
		
		list = new ArrayList<>();
		
        String url = "D:\\KBIIT JAVA16\\Java16 Final test\\java16-repository\\java16-nhungdth-final-test\\java16-nhungdth-java\\src\\input.txt";
        FileInputStream fileInputStream = new FileInputStream(url);
        Scanner scanner = new Scanner(fileInputStream);
        
        while(scanner.hasNextLine())
        {
           String s=scanner.nextLine();
           getNumberFromText(s+" ");
        }
        list.remove(0);
        Collections.sort(list);
        
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\KBIIT JAVA16\\Java16 Final test\\java16-repository\\java16-nhungdth-final-test\\java16-nhungdth-java\\src\\output.txt");
        
        for(int i=0;i<list.size();i++) {
        	byte b[] = (list.get(i).toString()+"\n").getBytes();
        	fileOutputStream.write(b);
        }
        fileInputStream.close();
        fileOutputStream.close();
	}
	
	public static void getNumberFromText(String s) {
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
