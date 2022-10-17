package view;

import java.util.Scanner;

public class Ex04StringPermutation {
	static String s;
	static boolean[] check;
	static char res[];
	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  s=sc.nextLine();
		  res=new char[s.length()];
		  check=new boolean[s.length()];
		  
		  for(int i=0;i<check.length;i++)
		  {
			  check[i]=true;
		  }
		  permutation(0);
		  
		}
	private static void permutation(int k)
	{
		for(int i=0;i<s.length();i++)
		{
			if(check[i])
			{
				
				res[k]=s.charAt(i);
				check[i]=false;
				
				if(k==s.length()-1)
					print();
				else
					permutation(k+1);
				check[i]=true;
			
			}
		}
	}
	
	private static void print()
	{
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i]);
			
		}
		System.out.println();
	}
	
	
}
