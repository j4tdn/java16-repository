package view;

public class Ex06 {
	public static void main(String[] args) {
		isPrime();
	}
	public static void isPrime() {
		int n = 3;
		int num=1, count = 0, i;
		while(count<n) {
			num+=1;
			for(i=2; i<=num; i++) {
				if(num%i==0) {
					break;
				}
			}
			if(i==num) {
				count+=1;
			}
		}
		System.out.println("Số nguyên tố thứ 200 là: " + num);
	}
}
