package condition.loop;

import java.util.Scanner;

public class Ex06Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        for(int i = 0; i < 10; i += 2){
//            if(i % 4 == 0){
//                System.out.print(i + " ");
//            }
//        }
//
//        int i = 0;
//        while(i < 10){
//            if(i % 4 == 0){
//                System.out.print(i + " ");
//            }
//            i += 2;
//        }

        // Viet chuong trinh nhap vao 1 so nguyen hop le
        // Neu nhap sai qua 3 lan thi thoat chuong trinh
        String numberAsText = "";
        do {
            System.out.println("Enter valid number: ");
            numberAsText = sc.nextLine();
        } while (!numberAsText.matches("\\d+"));
        int number = Integer.parseInt(numberAsText);
        System.out.println("number = " + number);
        System.out.println("Finish");
    }
}
