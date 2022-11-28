package view;

public class Ex03LCM {
	public static void main(String[] args) {
		//validation
			int[] elements= {1,3,4,5};
			System.out.println("LCM: "+getLeastCommonMultipe(elements));
	}
	
	private static int getLeastCommonMultipe(int[] elements) {
		if(elements.length==0) {
			throw new IllegalArgumentException("At least 1 element");
		}
		if(elements.length==1) {
			return elements[0];
		}
		int result =lcm(elements[0],elements[1]);
		for(int i=2;i<elements.length;i++) {
			result=lcm(result,elements[i]);
		}
		return result;
	}
	
	private static int lcm(int a,int b) {
		return (a*b)/gcd(a,b);
	}
	
	private static int gcd(int a,int b) {
		while(a!=b) {
			if(a>b) {
				a-=b;
			}
			else {
				b-=a;
			}
		}
		return a;
	}
}
