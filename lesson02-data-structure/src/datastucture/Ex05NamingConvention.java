package datastucture;

public class Ex05NamingConvention {
	public static void main(String[] args) {
		//Ten class: Camel case --> Chu cai dau tien viet hoa
		//Ten bien: Camel case --> Chu cai dau tien la viet thuong
		//Ten ham: Camel case --> Chu cai dau tien la viet thuong
		//					  --> Chu cai dau tien la dong tu
		int length = 10;
		int salesPrice = 100;
		
		int a = 5;
		int b = 10;
		int result = sum(a, b);
		System.out.println("result: "+result);
	}
	private static int sum(int a, int b) {
		// ham ma kieu tra ve khac void --> minh phai dung return
		return a + b;
	}
}
