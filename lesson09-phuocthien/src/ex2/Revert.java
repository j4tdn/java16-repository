package ex2;

public class Revert {
	public String reverseWordInMyString(String str)
    {
        String[] words = str.split(" ");
        String reversedString = "";
        for (int i = 0; i < words.length; i++)
        {
            String word = words[i];
            String reverseWord = "";
            for (int j = word.length()-1; j >= 0; j--)
            {
                reverseWord = reverseWord + word.charAt(j);
            }
            reversedString = reversedString + reverseWord + " ";
        }
        
        return reversedString;
    }
	public String removeblan(String str)
    {
        String[] words = str.split(" ");
        String reversedString = "";
        for (int i = 0; i < words.length; i++)
        {
            String word = words[i];
            String reverseWord = "";
            for (int j = word.length()-1; j >= 0; j--)
            {
                reverseWord = reverseWord + word.charAt(j);
            }
            reversedString = reversedString + reverseWord + " ";
        }
        
        
        return reversedString;
    }
	public static void main(String[] args) {
		
		Revert obj = new Revert();
		String a = "   Welcome to JAVA10 class    ";
        a = obj.reverseWordInMyString(a);
        a = a.trim().replaceAll("\\s+", " ");
        System.out.println("--"+ a +"---");
	}

}
