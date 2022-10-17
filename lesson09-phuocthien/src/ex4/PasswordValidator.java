package ex4;

import java.util.regex.Pattern; 
public class PasswordValidator { 
    private Pattern pattern; 
    private static final String PASSWORD_PATTERN = "((?=.*d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!.#$@_+,?-]).{8,50})"; 
    public PasswordValidator() { 
        pattern = Pattern.compile(PASSWORD_PATTERN); 
    } 
    
    public boolean validate(final String password) { 
        return pattern.matcher(password).matches(); 
    }
    public static void main(String[] args) { 
        PasswordValidator validator = new PasswordValidator(); 
        // true 
        System.out.println(validator.validate("Uxus@220.2014")); 
        System.out.println(validator.validate("Oxus.20_14")); 
        System.out.println(validator.validate("OXUS20@Herat"));  
        System.out.println(validator.validate("Oxus20@2014"));
        // false
        System.out.println(validator.validate("Oxus202014"));  
        System.out.println(validator.validate("Oxus20")); 
        System.out.println(validator.validate("Oxus@20")); 
        System.out.println(validator.validate("Oxus20@"));  
    }
} 


