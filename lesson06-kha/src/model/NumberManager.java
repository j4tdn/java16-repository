package model;

import java.util.HashMap;

public class NumberManager {
	private static NumberManager Instance = null;
	
	HashMap<Integer, String> numbers = null;
	HashMap<Integer, String> numbersPattern = null;
	
	private NumberManager() {
		numbers = new HashMap<Integer, String>();
		numbers.put(0, "Không");
		numbers.put(1, "Một");
		numbers.put(2, "Hai");
		numbers.put(3, "Ba");
		numbers.put(4, "Bốn");
		numbers.put(5, "Năm");
		numbers.put(6, "Sáu");
		numbers.put(7, "Bảy");
		numbers.put(8, "Tám");
		numbers.put(9, "Chín");
		numbers.put(10, "Mười");
		
		
		numbersPattern = new HashMap<Integer, String>();
		numbersPattern.put(100, "Trăm");
		numbersPattern.put(1000, "Nghìn");
		numbersPattern.put(1000000, "Triệu");
		numbersPattern.put(1000000000, "Tỷ");
		numbersPattern.put(10, "Mươi");
		
	}
	
	public static NumberManager GetInstance() {
		if(Instance == null) 
			Instance = new NumberManager();
		return Instance;
	}
	
	public HashMap<Integer, String> getAllnumbers(){
		return numbers;
	}
	
	public HashMap<Integer, String> getAllNumbersPattern(){
		return numbersPattern;
	}
}
