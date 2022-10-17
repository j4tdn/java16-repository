package ex02;

public class GetLargestNumber {
	public static void main(String[] args) {
		
		String text = "01a2b3456cde478";
		
		checkNumber(text);
	}
	
    private static void checkNumber(String text) {
        String regex = "[^\\d]+";

        int[] isNumber = new int[text.length()];

        String[] str = text.split(regex);
        for (int i = 0; i < str.length; i++) {
            isNumber[i] = Integer.parseInt(str[i]);
        }
        System.out.println(findMax(isNumber));

    }
	
    private static int findMax(int[] number) {
        int max = number[0];
        for (int i = 0; i < number.length; i++) {
            if (number[i] > max) {
                max = number[i];
            }
        }
        return max;
    }
}
