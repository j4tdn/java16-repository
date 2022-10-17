
public class Ex03 {
	private static int getLevelOfNumber(int n) {
		int count = 0;
		for (int i=1; i<=Math.sqrt(n); i++) {
			if (n % i == 0) {
				if (i == Math.sqrt(n)) {
					count ++;
				}
				else {
					count += 2;
				}
			}
		}
		return count;
	}
	public static class number {
		int num;
		int level;
		public number(int num) {
			this.num = num;
			this.level = getLevelOfNumber(num);
		}
		public int getLevel() {
			return level;
		}
	}
	private static void sort(number[] arr) {
		for (int i=0; i<arr.length-1; i++) {
			for (int j=i+1; j<arr.length; j++) {
				if (arr[i].level > arr[j].level) {
					number temp = arr[i];
					arr[i] = arr[j];
					arr[j] =temp;
				}
			}
		}
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i].num + "   " ); 
		}
	}
	public static void main(String[] args) {
		number[] arr = new number[] {
				new number(8), new number(5), new number(9), new number(20)
		};
		sort(arr);
	}
}
