package condition.loop;

import java.util.Random;

public class Ex03SwitchCase {
    public static void main(String[] args){
        int month = 1 + new Random().nextInt(12);
        System.out.println("Thang "+month);
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Thang co 31 ngay!");
                break;
            case 2:
                System.out.println("Thang co 28 ngay!");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Thang co 30 ngay!");
                break;
        }
    }
}
