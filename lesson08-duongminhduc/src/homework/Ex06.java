package homework;

public class Ex06 {
	public static void main(String[] args) {

		String n = "1";
		int i = 1;
		while(n.length() < 100)
		{
			i ++;
			n += Integer.toString(i);
			
			
		}
		System.out.println(n);
		System.out.println("============================");
		System.out.println(n.charAt(99));
		
	}
}
