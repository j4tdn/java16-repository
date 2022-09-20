package view;

import java.io.File;

import javax.imageio.IIOException;

public class Ex04Throw {

	public static void main(String[] args) {
		System.out.println(isValidPW("duyanh26"));
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	//ArithmeticException
	private static int  divide(int a, int b) {
		if(b == 0) {
			throw new ArithmeticException("b CANNOT BE NULL");
		}
		return a/b;
		
	}
	private static boolean isValidPW(String text) {
		//pw length >= 8
		if(text == null) {
			throw new NullPointerException("PW not null");
		}
		return text.length() >= 8;
	}
	
	private static File createFile(String filename) throws IIOException {
		if(filename == null) {
			throw new NullPointerException();
		}
		if(filename.isEmpty()) {
			throw new IIOException("Filenmae can not be empty");
		}
		return new File(filename);
	}
	
}
