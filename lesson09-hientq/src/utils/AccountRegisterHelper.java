package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountRegisterHelper {
    public static boolean isValidLength(String password){
        if(password.length() < 8){
            throw new IllegalArgumentException("At least 8 characters");
        }
        return true;
    }

    public static boolean isContainsNumberDigit(String password){
        boolean result = false;
        for(int i = 0; i < password.length(); i++){
            if(password.charAt(i) >= 48 && password.charAt(i) <= 57){
                result = true;
                break;
            }
        }
        if(!result){
            throw new IllegalArgumentException("At least contain 1 digit character");
        }
        return true;
    }

    public static boolean isContainsUpperCase(String password){
        boolean result = false;
        for(int i = 0; i < password.length(); i++){
            if(password.charAt(i) >= 65 && password.charAt(i) <= 90){
                result = true;
                break;
            }
        }
        if(!result){
            throw new IllegalArgumentException("At least contain 1 uppercase character");
        }
        return true;
    }

    public static boolean isContainsSpecialCharacter(String password){
        boolean result;
        Pattern p = Pattern.compile("[^A-Za-z0-9]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(password);
        result = m.find();

        if(!result){
            throw new IllegalArgumentException("At least contain 1 special character");
        }
        return result;
    }
}
