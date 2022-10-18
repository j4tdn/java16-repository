package view;

public class Ex07 {
	public static void main(String[] args) {
		correctSubsequence("aaabaaabbaaaaa");
	}
	public static void correctSubsequence(String s)
	{
		int min=s.length();
		int max=0;
		int count=1;
		
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)==s.charAt(i+1))
			{
				count++;
			}
			else
			{
				if(count<min)
					min=count;
				if(count>max)
					max=count;
				
				count=1;
			}		
		}
		if(count<min)
			min=count;
		if(count>max)
			max=count;
		System.out.println("Maximum length of the correct subsequence: "+max);
		System.out.println("Minimum length of the correct subsequence: "+min);
	}
}
