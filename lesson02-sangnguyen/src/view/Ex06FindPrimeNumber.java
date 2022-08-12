package view;


public class Ex06FindPrimeNumber {
	public static void main(String[] args) {
		int i = 0;
		int  j = 0;
		while(true)
		{
			i++;
			if(checknumber(i))
			{
				j ++;
			}
			if(j == 200)
			{
				System.out.println("200th prime number: " + i);
				break;
			}
		}

	}
	private static boolean checknumber(int n)
	{
		if(n < 2){
	        return false;
	    }
	    int count = 0;
	    for(int i = 2; i <= Math.sqrt(n); i++){
	        if(n % i == 0){
	            count++;
	        }
	    }
	    if(count == 0)
	    {
	    	return true;
	    }
	    else
	    {
	    	return false;
	    }
	}
}

