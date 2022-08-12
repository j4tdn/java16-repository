package homework;

public class Ex01_CheckNumberIsPowerOfTwo {
    /**
     * Solution:
     *  Keep dividing the number by two, i.e, do n = n/2 iteratively.
     *  In any iteration, if n%2 becomes non-zero and n is not 1 then n is not a power of 2.
     *  If n becomes 1 then it is a power of 2.
     * @param n
     * @return
     */
    private static boolean isPowerOfTwo(int n){
        if(n == 0) return false;
        while(n != 1){
            if(n % 2 != 0){
                return false;
            }
            n /= 2;
        }
        return true;

    }
    public static void main(String[] args){
//        for(int i = 0; i <= 30; i++){
//            if(isPowerOfTwo(i)){
//                System.out.println(i + " is power of 2");
//            }
//        }
        System.out.println("14 is power of 2? " + isPowerOfTwo(14));
        System.out.println("12 is power of 2? " + isPowerOfTwo(12));
        System.out.println("4 is power of 2? " + isPowerOfTwo(4));
        System.out.println("6 is power of 2? " + isPowerOfTwo(6));
        System.out.println("512 is power of 2? " + isPowerOfTwo(512));
        System.out.println("30 is power of 2? " + isPowerOfTwo(30));
        System.out.println("32 is power of 2? " + isPowerOfTwo(32));
    }
}
