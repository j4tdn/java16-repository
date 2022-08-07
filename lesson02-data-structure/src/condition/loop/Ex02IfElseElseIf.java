package condition.loop;

import java.util.Random;

public class Ex02IfElseElseIf {
    public static void main(String[] args) {
        // Random diem ngau nhien tu [1 -> 10]
        int randomMark = 1 + new Random().nextInt(10 - 1 + 1);
        System.out.println("randomMark: " + randomMark);
        // Neu diem < 5 ==> Yeu
        // Neu diem >= 5 and < 8 ==> Trung binh
        // Neu diem >= 8 ==> Gioi
        if(randomMark < 5){
            System.out.println("Hoc luc: Yeu");
        } else if(randomMark < 8){
            System.out.println("Hoc luc: Trung binh");
        } else if(randomMark <= 10){
            System.out.println("Hoc luc: Gioi");
        }

    }
}
