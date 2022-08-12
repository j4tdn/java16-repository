package homework;
import java.util.Scanner;
public class Ex04_FindGreatestOdd {

    private static int findGreatestOdd(int[] oddNums){
        int max = oddNums[0];
        for(int x : oddNums){
            if(x > max) max = x;
        }
        return max;
    }
    private static int countOddNum(int[] nums){
        int count = 0;
        for(int x : nums){
            if(x % 2 != 0) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums;
        int[] oddNums;
        System.out.println("Enter amount of nums: ");
        int amount = Integer.parseInt(sc.nextLine());
        nums = new int[amount];
        for(int i = 0; i < nums.length; i++){
            System.out.print("Enter number: ");
            nums[i] = Integer.parseInt(sc.nextLine());
        }

        oddNums = new int[countOddNum(nums)];
        int indexOfOddNums = 0;
        for(int x : nums){
            if(x % 2 != 0){
                oddNums[indexOfOddNums] = x;
                indexOfOddNums++;
            }
        }

        System.out.println("The greatest odd number is " + findGreatestOdd(oddNums));

    }
}
