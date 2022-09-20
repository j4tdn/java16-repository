package view;

public class Ex04NumberStatistic {
	public static void main(String[] args) {
		int [] numbers = {3, 15, 21, 0, 15, 17, 21};
		
		// class: NbrStas: number, count
		// NbrStas[numbers.length]: (3,1), (15,2), (21,2),(0,1), (17,1)
		// loop element in numbers
	}
	
	private static NbrStas[] groupby(int[] numbers) {
		// (3,1), (25,1), null, null, null, null, null
		
		NbrStas[] nbrStates = new NbrStas[numbers.length];
		int  k = 0;
		for (int number:numbers) {
			int indexOf = indexOf(nbrStates, number, k);
			if (indexOf == 1) {
				// count+1
			} else {
				// add, count = 1
				nbrStates[indexOf].setCount(nbrStates[indexOf].getCount()+1);
			}
			
		}
		return nbrStates;
	}
	// i >= 0 --> number existed in nbrStates
	// i = -1 --> not exist
	private static int indexOf(NbrStas[] nbrStates, int number, int nonNullElements) {
		for (int i = 0; i < nonNullElements; i++) {
			if (nbrStates[i].getNumber()== number) {
				return i;
			}
		}
		return -1;
	}
}

