package test;

public class HappyNumbers {
	public static void main(String[] args) {
		 int num = 82;  
	        if(isHappyNumber(num) == true) {
	        	System.out.println("is happy number");
	        }
	        else
	        	System.out.println("not is happy number");
	          
	        
	}
	 public static int check(int num){  
	        int temp = 0, sum = 0;  	         
	        while(num > 0){  
	            temp = num % 10;  
	            sum = sum + (temp * temp);  
	            num = num / 10;  
	        }  
	        return sum;  
	    }  
	 public static boolean isHappyNumber(int num) {
		 
		 while(num != 1 && num != 4){  
	            num = check(num);  
	        }  
	          
	        //Happy number always ends with 1  
	        if(num == 1)  
	            return true;   
	        //Unhappy number ends in a cycle of repeating numbers which contains 4  
	        else if(num == 4)  
	            return false;
	        
	        return false;
	 }	 
}
