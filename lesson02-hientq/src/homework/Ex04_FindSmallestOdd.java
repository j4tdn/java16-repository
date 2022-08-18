package homework;
import java.util.Scanner;
public class Ex04_FindSmallestOdd {

    private static int findSmallestOdd(int[] oddNums){
        int min = oddNums[0];
        for(int i = 1; i < oddNums.length; i++){
            if(oddNums[i] < min){
                min = oddNums[i];
            }
        }
        return min;
    }
    private static int countOddNum(int[] nums){
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 != 0) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums;
        int[] oddNums;
        System.out.print("Enter amount of number? ");
        int amount = Integer.parseInt(sc.nextLine());
        nums = new int[amount];

        for(int i = 0; i < nums.length; i++){
            System.out.print("Enter number: ");
            nums[i] = Integer.parseInt(sc.nextLine());
        }
        oddNums = new int[countOddNum(nums)];

        // Push only odd nums into listOfOddNums
        int indexOfOddNums = 0; // Index for list
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 != 0){
                oddNums[indexOfOddNums] = nums[i];
                indexOfOddNums++;
            }
        }
        System.out.println("==================================");
        for (int x : oddNums){
            System.out.println(x);
        }

        System.out.println("The smallest odd number is " + findSmallestOdd(oddNums));

    }
}
