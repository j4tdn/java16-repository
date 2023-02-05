package view;

public class Ex03 {
	public static void main(String[] args) {
		int input = 52;
		
		System.out.println(input + ((checkHappyNumber(input)) ? " true" : " false"));
	}
	private static int calSquaredNumber(int source)
	{
		int result = 0;
		while(source > 0) {
			result += Math.pow(source%10,2);
			source /= 10;
		}
		return result;
	}
	private static boolean checkHappyNumber(int source)
	{
		int currentNumber = source;
		for(int round = 0 ; round < 100 ; round++)
		{
			if(calSquaredNumber(currentNumber) == 1)
			{
				return true;
			}
			currentNumber = calSquaredNumber(currentNumber);
		}
		return false;
	}
}
