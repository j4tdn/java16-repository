package condition.loop;

import java.util.Scanner;

public class Ex08ValidateNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int leftTurn = 3;
        String numberInString = "";
        do{
            System.out.println("Enter a valid number: ");
            numberInString = sc.nextLine();
            if(!numberInString.matches("\\d+")){
                leftTurn--;
                if(leftTurn == 0) return;
                continue;
            }
            break;


        }while(true);

        int numberInt = Integer.parseInt(numberInString);
        System.out.println("Your number is " + numberInt);

    }
}
