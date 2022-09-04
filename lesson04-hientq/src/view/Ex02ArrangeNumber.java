package view;

import utils.ArrageNumberHelper;

public class Ex02ArrangeNumber {
    public static void main(String[] args) {
        int[] numbers = {12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18};
        numbers = ArrageNumberHelper.arrangeNumberBy(numbers, 7, 5);
        for(int i : numbers){
            System.out.print(i + " ");
        }
    }
}
