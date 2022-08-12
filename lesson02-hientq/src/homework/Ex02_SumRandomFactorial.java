package homework;

import java.util.Random;

public class Ex02_SumRandomFactorial {

    private static long convertToFactorial(int n){
        if(n == 0){
            return 1;
        }
        return n * convertToFactorial(n - 1);
    }
    public static void main(String[] args) {
        long sum = 0;
        int amount = 4;
        String outputString = "";
        for(int i = 1; i <= amount; i++){
            int n = generateRandomInt(4, 18);
            sum += convertToFactorial(n);
            if(!(i == amount)){
                outputString += n+"! + ";
                continue;
            }
            outputString += n+"!";
        }
        System.out.println(outputString + " = " +sum);
    }

    private static int generateRandomInt(int start, int finish){
        return new Random().nextInt(finish + 1 - start) + start;
    }
}
