package view;

/**
 * 
 * @param Least    Common Multiple = Bội chung nhỏ nhất
 * @param Greatest Common
 * @return
 */
public class Ex03LCM {
	public static void main(String[] args) {
		// validation
		int[] elements = { 2, 3, 4, 5 };
		System.out.println(getLeastCommonMultiple(elements));
	}

	public static int lcm(int a, int b) {
		return (a * b) / gcd(a, b);
	}

	public static int gcd(int a, int b) {
		while (a != b) {
			if (a > b){
				a = a - b;
			} else {
				b = b - a;
			}
		}
		return a;
	}
	private static int getLeastCommonMultiple(int elements[]) {
		if(elements.length == 0) {
			throw new IllegalArgumentException("At least 1 elements");
		}
		if(elements.length == 1) {
			return elements[0];
		}
		int temp = lcm(elements[0], elements[1] );
        for(int i=2;i <elements.length;i++){
            temp = lcm(temp, elements[i]);    
        }
        return temp;
	}
}
