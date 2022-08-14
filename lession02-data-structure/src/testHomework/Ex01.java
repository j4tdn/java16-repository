package testHomework;

public class Ex01 {
	public static void main(String[] args) {
		int k=34;
		if(check(k)==true) {
			System.out.println("la luy thua cua 2");
		}else {
			System.out.println("khong phai");
		}
	}
	private static boolean check(int n) {
		if(n==0||n==1) 
			return true;
		for(int i=2;i<n;i=i*2) {
			if(n%i==0)
				return true;
		}return false;
	}

}
