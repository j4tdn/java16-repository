package view;

public class Ex02_GetMissingNumber {
    public static int getMissingNumber(int[] nums, int n){
        int sum = ((n + 1) * (n + 2)) / 2;
        System.out.println(sum);
        for(int i = 0; i < n; i++){
            sum -= nums[i];
        }
        return sum;
    }
    public static void main(String[] args){
        int[] nums = {3, 2, 1, 6, 5};
        System.out.println("Missing number: " + getMissingNumber(nums, nums.length));
        int[] nums_1 = {3, 7, 9, 2, 1, 6, 5, 4, 10};
        System.out.println("Missing number: " + getMissingNumber(nums_1, nums_1.length));
    }
}
