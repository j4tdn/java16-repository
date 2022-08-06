package datastructure;

public class Ex13SwapSolution {

	public static void main(String[] args) {
		bean.Number ra = new bean.Number(22);
		bean.Number rb = new bean.Number(66);
		
		swap(ra, rb);
		System.out.println(ra+" "+rb);
	}
	private static void swap(bean.Number a, bean.Number b)
	{
		int c  = a.number;
		a.number = b.number;
		b.number = c;
	}
}
