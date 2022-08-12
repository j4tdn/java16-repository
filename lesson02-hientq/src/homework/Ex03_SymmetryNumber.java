package homework;

import java.util.Scanner;

public class Ex03_SymmetryNumber {
    private static int reverseNum(int n){
        int reverse = 0;
        while(n != 0){
            reverse = reverse * 10 + (n % 10);
            n /= 10;
        }
        return reverse;
    }
    private static boolean isSymmetricalNumber(int n){
        int reverse = reverseNum(n);
        return reverse == n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println(n + " is symmetrical number? " + isSymmetricalNumber(n));
    }
}
