
public class Ex01 {
	public static void main(String[] args) {
		int[] numbers = getNumber();
		
		// Cac phan tu chi xuat hien mot lan
		
		for (int i = 0; i < numbers.length ; i++) {{
				System.out.print(numbers[i]);
			}
			
		}
		
		
	}
	
	private static int[] getNumber() {
		int [] numbers = {1,2,3,4,5,6,5,5,3,1};
		return numbers;
	}
	
	private static int countElement(int[] numbers) {
		int count = 0;
		for (int i = 0; i < numbers.length ; i++) {
			if(numbers[i] == 1) {
				count++;
			}
		}
		return count;
	}
}
