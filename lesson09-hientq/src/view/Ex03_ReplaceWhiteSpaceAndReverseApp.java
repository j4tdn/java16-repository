package view;

import java.util.Scanner;

public class Ex03_ReplaceWhiteSpaceAndReverseApp {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Input a string: ");
        String myString = sc.nextLine().trim();

        // Replace redundant white spaces
        myString = replaceRedundantWhiteSpace(myString);
        // Revert input string
        myString = revert(myString);

        System.out.println("Result: " + myString);
    }

    private static String replaceRedundantWhiteSpace(String inputString){
        validate(inputString);
        return inputString.replaceAll("\\s{2,}", " ");
    }
    private static String revert(String inputString){
        validate(inputString);
        StringBuilder afterString = new StringBuilder();
        String[] words = inputString.split(" ");
        for(String x : words){
            afterString.append(new StringBuilder(x).reverse().toString());
            afterString.append(" ");
        }
        return afterString.toString();
    }
    private static void validate(String inputString){
        if(inputString == null || inputString.equals("")){
            throw new IllegalArgumentException("Cannot be null");
        }
    }
}
