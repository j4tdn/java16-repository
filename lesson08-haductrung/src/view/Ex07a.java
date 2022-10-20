package view;

public class Ex07a {
	public static void main(String[] args) {
		String s="aaabaabbbaaaaa";
		CheckMax(s);
		CheckMin(s);
		
}
	private static void CheckMax(String s) {
		int index=0;
		int max=Integer.MIN_VALUE;
		int a=0;
		do {
			int count=0;
			for(int i=index;i<s.length();i++) {
				if(s.charAt(index)==s.charAt(i)) {//index=begin of max String
					count++;
				}else {
					break;
				}
			}
			if(count>max) {
				max=count;
				a=index;
			}
			index=index+count;
			
		}while(index<s.length());
		System.out.println(a + " String max: "+s.substring(a, a+max));
		
	}
	private static void CheckMin(String s) {
		int index=0;
		int min=Integer.MAX_VALUE;
		int a=0;
		while(index<s.length()) {
			int count=0;
			for(int i=index; i<s.length();i++) {
				if(s.charAt(index)==s.charAt(i)) {
					count++;
				}else {
					break;
				}
			}
			if(count<min) {
				min=count;
				a=index;
				
			}
			index=index+count;
		}
		System.out.println(a + " String min: " +s.substring(a, a+ min));
	}
}
