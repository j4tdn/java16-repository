package ex01;

public class Ex01IsPower {
	public static void main(String[] args) {
		System.out.println(isPowerOf(2,4));
		System.out.println(isPowerOf(4,2));
		System.out.println(isPowerOf(8,2));
		System.out.println(isPowerOf(2,8));
		System.out.println(isPowerOf(6,2));
		System.out.println(isPowerOf(20,4));
		System.out.println(isPowerOf(64,4));
	}
	
	public static boolean isPowerOf(int a, int b) {
		int x,y;
		if(a<b){
			x=a;y=b;
		}
		else{
			x=b;y=a;
		}
		if(y<= 0)
			return false;
		double n = Math.log(y) / Math.log(x);
		return Math.ceil(n) == Math.floor(n);
	}

}
