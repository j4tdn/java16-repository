package view;

import java.util.Scanner;

public class Ex01LinearQuation {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int a = integerFromKeyboard("a");
        int b = integerFromKeyboard("b");
        System.out.println("Result: "+linearQuation(a, b));
    }
    private static int integerFromKeyboard(String prompt){

        int number;
        do{
            System.out.print(prompt+": ");
            String integerAsText = sc.nextLine().trim();
            try{
                number = Integer.parseInt(integerAsText);
                break;
            }catch(NumberFormatException e){
                System.out.println(e.getMessage());
            }
        }while(true);

        return number;
    }

    private static float linearQuation(int a, int b){
        float result;
        do{
            if(a == 0){
                System.out.println("a cannot be zero");
                a = integerFromKeyboard("a");
            } else{
                break;
            }
        }while(true);
        result = -(float)b/a;
        return result;
    }
}
