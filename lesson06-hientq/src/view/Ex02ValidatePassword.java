package view;

import java.util.Scanner;

public class Ex02ValidatePassword {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String password;

        do{
            try{
                System.out.print("Your password: ");
                password = sc.nextLine();
                isValidPassword(password);
                break;
            }catch (Exception e){
                e.printStackTrace();
            }
        }while(true);
        System.out.println("Create account successfully");
    }

    private static void validate(Object object, String message){
        if(object == null){
            throw new IllegalArgumentException(message);
        }
    }

    private static boolean isContainLowerCase(String password){
        boolean isContainLowerCase = false;
        for(int i = 0; i < password.length(); i++){
            if(password.charAt(i) >= 97 && password.charAt(i) <= 127){
                isContainLowerCase = true;
                break;
            }
        }
        return  isContainLowerCase;
    }

    private static boolean isContainUpperCase(String password){
        boolean isContainUpperCase = false;
        for(int i = 0; i < password.length(); i++){
            if(password.charAt(i) >= 65 && password.charAt(i) <= 90){
                isContainUpperCase = true;
                break;
            }
        }
        return  isContainUpperCase;
    }

    private static boolean isContainSpecialCharacter(String password){
        boolean isContainSpecialCharacter = false;
        for(int i = 0; i < password.length(); i++){
            if((password.charAt(i) >= 33 && password.charAt(i) <= 47) ||
                    (password.charAt(i) >= 58 && password.charAt(i) <= 64) ||
                    (password.charAt(i) >= 91 && password.charAt(i) <= 96) ||
                    (password.charAt(i) >= 123 && password.charAt(i) <= 126)){
                isContainSpecialCharacter = true;
                break;
            }
        }
        return isContainSpecialCharacter;
    }


    private static boolean isContainNumber(String password){
        boolean isContainNumber = false;
        for(int i = 0; i < password.length(); i++){
            if(password.charAt(i) >= 48 && password.charAt(i) <= 57){
                isContainNumber = true;
                break;
            }
        }
        return isContainNumber;
    }
    private static boolean isValidPassword(String password){
        validate(password, "Password cannot be null");
        boolean isContainLowerCase = true;
        if(password.length() < 8){
            throw new IllegalArgumentException("At least 8 characters");
        }

        if(password.length() > 256){
            throw new IllegalArgumentException("At most 256 characters");
        }

        if(!isContainLowerCase(password)){
            throw new IllegalArgumentException("At least 1 lowercase alphabetic character");
        }

        if(!isContainUpperCase(password)){
            throw new IllegalArgumentException("At least 1 uppercase alphabetic character");
        }

        if(!isContainNumber(password)){
            throw new IllegalArgumentException("At least 1 number");
        }

        if(!isContainSpecialCharacter(password)){
            throw new IllegalArgumentException("At least 1 special character");
        }


        return true;
    }
}
