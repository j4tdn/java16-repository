package b2;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean result = isPowerOf(a, b);
        System.out.println(result);
        sc.close();
    }
    public static boolean isPowerOf(int a, int b) {
        if (a == 1 || b == 1) {
            
            return true;
        }
        int power = 1;
        while (power < a) {
            power *= b;
        }
        return power == a || power / b == a;
    }
}
