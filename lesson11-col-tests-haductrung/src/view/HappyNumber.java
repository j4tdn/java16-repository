package view;

public class HappyNumber {
	public static void main(String[] args) {
		int num= 28;
        int result = num;  
          
        while(result != 1 && result != 4){  
            result = CheckNumber(result);  
        }  
          
        if(result == 1)  
            System.out.println(num + " is a happy number");  
        else if(result == 4)  
            System.out.println(num + " is not a happy number");     
    }
	public static int CheckNumber(int num){  
        int a = 0, number = 0;  
          
        while(num > 0){  
            a = num%10;  
            number = number + (a*a);  
            num = num/10;  
        }  
        return number;  
    }  
	

}
