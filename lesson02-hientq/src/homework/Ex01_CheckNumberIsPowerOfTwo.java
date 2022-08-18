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
    private static boolean isPowerOf(int a, int b){
        if(b <= 0){
            return false;
        }
        double n = Math.log(b) / Math.log(a);
        return Math.ceil(n) == Math.round(n);
    }
    public static void main(String[] args){
//        for(int i = 0; i <= 30; i++){
//            if(isPowerOfTwo(i)){
//                System.out.println(i + " is power of 2");
//            }
//        }
        int[] numbers = {1, 2, 3, 4, 8};
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i] + " is power of 2? " + isPowerOf(2, numbers[i]));
        }
    }
}
