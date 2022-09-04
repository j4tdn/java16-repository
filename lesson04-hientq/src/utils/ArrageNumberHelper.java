package utils;

import java.util.Random;

public class ArrageNumberHelper {
    public static int getRandomInt(int start, int end){
        return start + new Random().nextInt(end - start + 1);
    }

    public static int[] generateRandomArrayInt(int size, int start, int end){
        int[] randomArray = new int[size];
        for(int i = 0; i < randomArray.length; i++){
            randomArray[i] = ArrageNumberHelper.getRandomInt(start, end);
        }

        return randomArray;
    }

    public static void arrangeNumberBy(int[] numbers, int firstNum, int secondNum){
        int[] result = new int[numbers.length];

        int countingNumberDivisibleFirstNum = 0;
        int countingNumberDivisibleSecondNum = 0;
        int countingNumberDivisibleBoth = 0;
        int countingNumberNotDivisible = 0;
        for(int i = 0; i < numbers.length; i++){
            if((numbers[i] % firstNum) == 0 && (numbers[i] % secondNum) != 0){
                countingNumberDivisibleFirstNum++;
            } else if((numbers[i] % secondNum) == 0 && (numbers[i] % firstNum) != 0){
                countingNumberDivisibleSecondNum++;
            } else if((numbers[i] % firstNum) == 0 && (numbers[i] % secondNum) == 0){
                countingNumberDivisibleBoth++;
            } else {
                countingNumberNotDivisible++;
            }
        }
        int indexFirstNum = 0;
        for(int i = 0; i < numbers.length; i++){
            if((numbers[i] % firstNum) == 0 && (numbers[i] % secondNum) != 0){
                result[indexFirstNum] = numbers[i];
                indexFirstNum++;
            }
        }

        int indexSecondNum = numbers.length - 1;
        for(int i = 0; i < numbers.length; i++){
            if((numbers[i] % secondNum) == 0 && (numbers[i] % firstNum) != 0){
                result[indexSecondNum] = numbers[i];
                indexSecondNum--;
            }
        }

        
    }
}
