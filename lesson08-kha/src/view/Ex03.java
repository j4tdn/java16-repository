package view;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.text.Normalizer;
import java.util.regex.Pattern;

import utils.VNCharacterUtils;

public class Ex03 {
	public static void main(String[] args) {
		String s1 = "Em có yêu anh không anh để anh biết còn chờ";
		System.out.println(new VNCharacterUtils().removeAccent(s1));
		
	}
	
}
