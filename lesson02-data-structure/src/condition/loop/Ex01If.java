package condition.loop;

public class Ex01If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number =7;
		if(isEven(number)) {
			System.out.println( number + " is even number..");
		}
		System.out.println(" finish ...");

	}
   private static boolean isEven( int number) {
	   if ( number %2==0)
		   return true;
	   else
		   return false;
   }
}
