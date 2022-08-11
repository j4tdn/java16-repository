package view;

public class Ex06PrimeNumber {
public static void main(String[] args) {
	int temp = 0;
	for(int i=2;i<100;i++) {
		for(int j=1;j<Math.sqrt(100);j++) {
			if(i%j==0) System.out.println(i);
		}	
	}	
}
}
