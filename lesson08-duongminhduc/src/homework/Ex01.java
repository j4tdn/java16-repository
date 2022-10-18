package homework;

public class Ex01 {
	public static void main(String[] args) {

		String s = "Dương Minh Đức";
		printChar(s);
		System.out.println("==========================");
		printWord(s);
		System.out.println("==========================");
		reverseChar(s);
		System.out.println("==========================");
		reverseWord(s);
		
	}
	private static void printChar(String s)
	{
		for(int i = 0;i<s.length();i++)
		{
			System.out.println(s.charAt(i));
		}
	}
	private static void printWord(String s)
	{
		String[] words = s.split("\\s");
		for(String w : words)
		{
			System.out.println(w);
		}
	}
	private static void reverseChar(String s)
	{
		String revs = "";
		for(int i = s.length() -1;i >= 0;i--)
		{
			revs += s.charAt(i);
		}
		System.out.println("Reverse Char: " + revs);
	}
	private static void reverseWord(String s)
	{
		String[] words = s.split("\\s");
		for(int i = words.length - 1; i >=0;i--)
		{
			System.out.print("Reverse Word" + words[i] + " ");
		}
	}
}
