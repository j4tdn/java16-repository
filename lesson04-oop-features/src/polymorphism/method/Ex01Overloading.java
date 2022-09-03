package polymorphism.method;

public class Ex01Overloading {

	public static void main(String[] args) {

		// Tìm tổng 2 số, 3 số, n số nguyên
		System.out.println(sum(4, 6));
		System.out.println(sum(1,2,3));
		System.out.println(sum(1,2,3,4,5,6));
	}

	// Hàm không phụ thuộc vào đối tượng vì nó phụ thuộc vào tham số ==> dùng static
	private static int sum(int a, int b)
	{
        return a + b;
        
	}
	private static int sum(int a, int b, int c)
	{
        return sum(a,b) + c;
        
	}
	private static int sum(int... number)
	{
		int sum=0;
		for(int numbers: number)
		{
			sum+= numbers;
		}
		return sum;
	}
	
}
