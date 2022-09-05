package view;

public class Ex01_PowerOf {
    // Check the second argument is power of the first argument
    public static boolean isPowerOf(int base, int exponentiation){
        if(exponentiation != 1 && exponentiation < base){
            int temp = exponentiation;
            exponentiation = base;
            base = temp;
        }
        int power = 1;
        while(power < exponentiation){
           power *= base;
        }
        return power == exponentiation;
    }
    public static void main(String[] args){
//       Example: (8, 2)(true), (2, 8)(true), (6, 2)(false), (20, 4)(false), (64, 4)(true)

        // 8 is power of 2??
        System.out.println(isPowerOf(2, 8));
        // 8 is power of 2?? Reverse
        System.out.println(isPowerOf(8, 2));
        // 6 is power of 2??
        System.out.println(isPowerOf(2, 6));
        // 20 is power of 4??
        System.out.println(isPowerOf(20, 4));
        // 64 is power of 4??
        System.out.println(isPowerOf(4, 64));
        System.out.println(isPowerOf(64, 4));
        // 1 is power of 2??
        System.out.println(isPowerOf(2, 1));
        // 2 is power of 2??
        System.out.println(isPowerOf(2, 2));

    }
}
