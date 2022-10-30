package views;

public class Ex06 {
	
	public static void main(String[] args) {
		System.out.println(theNumberInPlace(10000));
	}
	
	public static char theNumberInPlace(int k)
	{
		String s="";
		int num=1;
		while(s.length()<k)
		{
			s+=Integer.toString(num);
			num++;
		}
		return s.charAt(k);
	}
}
