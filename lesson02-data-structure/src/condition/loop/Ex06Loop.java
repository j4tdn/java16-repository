package condition.loop;

public class Ex06Loop {
	public static void main(String[] args) {
		//1st --> using for 
		for(int i=0; i<10;i+=2) {
			if(i%4 == 0) {
			System.out.println(i);
		}
	}
		System.out.println("\n");
		//2nd --> using while
		int i= 0 ;
		while(i<10) {
			if(i%4==0) {
				System.out.println(i);
			}
		i+=2;	
		}
		System.out.println("=============");
		//3nd --> viết chương trình nhập 1 số nguyên hợp lệ
		//nếu nhập sai quá 3 lần thì thoát chương trình
		
	}
}