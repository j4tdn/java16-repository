package condition.loop;

import java.util.Random;

public class Ex02IfElseElseIf {

	public static void main(String[] args) {
		Random rand = new Random();
        int point = rand.nextInt(10)+1;
        
        System.out.println(point);
        
        if (point < 5 && point >= 0) {
        	System.out.println("hoc luc yeu");
        	
        }else if( point < 8){
        	System.out.println("trung binh");
        	
        }else if(point <= 10){
        	System.out.println("gioi");
        	
        }else {
        	System.out.println("diem khong hop le");
        }

	}

}
