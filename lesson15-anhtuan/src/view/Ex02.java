package view;

public class Ex02 {
	public static void main(String[] args) {
		String str = " aaaaccdcec";
		int[] arr = new int[str.length()];
		char minChar = str.charAt(0), maxChar = str.charAt(0);
		int  min, max;
		char[] string = str.toCharArray();
		
		for(int i =0; i < string.length; i++) {
			arr[i] = 1;
			for(int j = i + 1; j< string.length; j++) {
				 if(string[i] == string[j] && string[i] != ' ' && string[i] != '0') {  
	                    arr[i]++;
	                    string[j]='0';
			}}
		}
		min = max = arr[0];
		for(int i = 0; i< arr.length; i++) {
			
			if(max <= arr[i]) {  
                max = arr[i];  
                maxChar = string[i];  
            }  
		}
		System.out.println("xuat hien nhieu nhat la ki tu: " + maxChar);
	}
	

}
