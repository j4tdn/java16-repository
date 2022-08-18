package condition.loop;

import java.util.Random;

public class Ex02IfElseElseIf {
public static void main(String[] args) {
	Random rd =new Random();
	
	int secondRand = 1+rd.nextInt(10);
	System.out.println(secondRand);
	if(secondRand<5) {
		System.out.println("yeu");
	}
	else 
		if(secondRand<8) {
	System.out.println("tb");
	}
		else 
		System.out.println("gioi");
}}


