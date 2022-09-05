package ex01;

public class isPower {

	public static void main(String[] args) {
		System.out.println(isPowerOf(3,9));
	}
	private static boolean isPowerOf(int a, int b)
	{
		if(a < b)
		{
			for(int i = 0;i <= b;i++)
			{
				if(Math.pow(a,i) == b)
				{
					return true;
				}
					
			}
		}
		else if(b > a)
		{
			for(int i = 0;i <= a;i++)
			{
				if(Math.pow(b,i) == a)
				{
					return true;
				}
					
			}
		}
		else
		{
			return true;
		}
		return false;
	}
}
