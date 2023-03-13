package exercises;
import java.util.HashSet;
import java.util.Set;

public class happynumber {
    public static boolean isHappyNumber(int n) {
        Set<Integer> set = new HashSet<>();
        while (n != 1) {
            int sum = 0;
            while (n != 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            if (set.contains(sum)) {
                return false;
            }
            set.add(sum);
            n = sum;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 6;
        if (isHappyNumber(n)) {
            System.out.println(n + " is a happy number");
        } else {
            System.out.println(n + " is not a happy number");
        }
    }
}