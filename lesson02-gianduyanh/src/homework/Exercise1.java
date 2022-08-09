package homework;



public class Exercise1 {
	public static void main(String[] args) {
		int a = 8;
		if(exPonential(a)== true) {
			System.out.println(a + " la luy thua cua 2");
		}
		else {
			System.out.println(a + " khong phai la luy thua cua 2");
		}
		
	}
	 private static boolean exPonential(int number) {
		 for(int i = 0 ; i < number; i ++) {
			if(Math.pow(2, i) == number) {
				return true;
			}
			
		 }
		 return false;
		 
		 
		
		 
		 
		 
	 }
	

}
