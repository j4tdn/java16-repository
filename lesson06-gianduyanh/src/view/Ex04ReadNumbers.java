package view;


import java.util.HashMap;
import java.util.Scanner;

public class Ex04ReadNumbers {
	private static Scanner ip = new Scanner(System.in);
    static HashMap<Integer, String> numbers = new HashMap<Integer, String>();
    static HashMap<Integer, String> numberFormat = new HashMap<Integer, String>();

    public static void main(String[] args) {
        numbers.put(1,"một");
        numbers.put(2,"hai");
        numbers.put(3,"ba");
        numbers.put(4,"bốn");
        numbers.put(5,"năm");
        numbers.put(6,"sáu");
        numbers.put(7,"bảy");
        numbers.put(8,"tám");
        numbers.put(9,"chín");
        
        numberFormat.put(1000,"nghìn");
        numberFormat.put(100,"trăm");
        numberFormat.put(10, "mười");
        

       try {
    	   System.out.println("Enter number : ");
    	   int num = ip.nextInt();
           System.out.println(num);
           readNumber(num);
	} catch (Exception e) {
		System.out.println("Hay nhap so vd:123 , 453 ... ");
	}
        

    }
    
    private static void readNumber(int num) {
    	String rs = "";
        String numAstext = String.valueOf(num);
        while (num>0) {
            int tmp = (int) (num / Math.pow(10, String.valueOf(num).length()-1));
            rs+=numbers.get(tmp)+" ";
            if(Math.pow(10, String.valueOf(num).length()-1)>=100){
                System.out.println(Math.pow(10, String.valueOf(num).length()-1));
                rs+=numberFormat.get((int)Math.pow(10, String.valueOf(num).length()-1))+" ";
       
            }
            else if(Math.pow(10, String.valueOf(num).length()-1)>=10){
                System.out.println(Math.pow(10, String.valueOf(num).length()-1));
                rs+=numberFormat.get((int)Math.pow(10, String.valueOf(num).length()-1))+" ";
            }
            num = (int) (num % Math.pow(10, String.valueOf(num).length()-1));
        }

        System.out.println(rs);
    }
}
