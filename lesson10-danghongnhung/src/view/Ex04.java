package view;

import java.util.Arrays;
import java.util.Comparator;

public class Ex04 {
	private static final int ASC = 1;
	private static final int DESC = -1;
	public static void main(String[] args) {
		String[] strings = { "-2", "-6", "10", null, "4", "8", null, "Special", "a", "c", "b", "xx" };
		System.out.println("Ascending array: ");
		sorting(strings, ASC);
		System.out.println("\n================================");
		System.out.println("Descending array: ");
		sorting(strings, DESC);
		
		
	}

	public static boolean isNumber(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)<'0' || s.charAt(i)>'9')
			{
				if(i==0 && s.charAt(i)=='-')
				{
					
				}
				else
					return false;
			}
				
		}
		return true;
	}
	
	public static int valueOfString(String s)
	{
		int res=0;
		for(int i=0;i<s.length();i++)
		{
			res+=(int) s.charAt(i);
		}
		return res;
	}

	public static void sorting(String[] strings, int type) {

		Arrays.sort(strings, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				//null
				if(s1==null)
				{
					if(s2!=null)
						return 1 * type;
				}
				else if(!isNumber(s1))
				{
					if(s1.compareTo("Special")==0)
						return -1 * type;
					
					if(s2==null)
						return -1 * type;
					else if(!isNumber(s2))
					{
						if(s2.compareTo("Special")==0)
							return 1 * type;
						else
							return valueOfString(s1)>valueOfString(s2)? (1 * type) : (-1 * type);
					}
					else
						return 1 * type;
				}
				else
				{
					if(s2==null)
						return -1 * type;
					else if(!isNumber(s2))
					{
						if(s2.compareTo("Special")==0)
							return 1 * type;
						else
							return -1 * type;
					}
					else
						return Integer.parseInt(s1)>Integer.parseInt(s2)? (1 * type) : (-1 * type);
				}
				return 0;
			}
		});
		
		for(int i=0;i<strings.length;i++)
			System.out.print(strings[i] + " ");
	}
}
