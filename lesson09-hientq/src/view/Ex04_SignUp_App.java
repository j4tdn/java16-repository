package view;

import bean.AccountRegister;
import utils.AccountRegisterHelper;

import java.util.Scanner;

public class Ex04_SignUp_App {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        AccountRegister acc1 = new AccountRegister();
        System.out.print("Enter your username: ");
        acc1.setUsername(sc.nextLine().trim());
        do{
            String password;
            System.out.print("Enter your password: ");
            try{
                password = sc.nextLine();
                AccountRegisterHelper.isValidLength(password);
                AccountRegisterHelper.isContainsNumberDigit(password);
                AccountRegisterHelper.isContainsUpperCase(password);
                AccountRegisterHelper.isContainsSpecialCharacter(password);
                acc1.setPassword(password);
                break;
            }catch (Exception e){
                System.out.println(e.getMessage());
            }


        }while(true);
        System.out.println("Your username: " + acc1.getUsername());
        System.out.println("Your password: " + acc1.getPassword());

    }
}
