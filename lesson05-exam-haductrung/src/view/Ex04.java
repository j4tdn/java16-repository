package view;

import java.util.Arrays;

import bin.NbStas;

public class Ex04 {
	public static void main(String[] args) {
		int [] numbers = {3,15,21,0,15,17,21};
        NbStas[] nbstrases= groupBy(numbers);
        for(NbStas nbstras: nbstrases) {
        	if(nbstras.getCount()==1) {
        		System.out.println(nbstras);
        	}
        }
	}
	private static NbStas[] groupBy(int[] numbers) {
		NbStas[] nbstrases= new NbStas[numbers.length];
	int k=0;
		for(int number:numbers) {
			int indexOf= indexOf(nbstrases, number,k);
		if(indexOf==-1) {
			nbstrases[k++]=new NbStas(number,1);
			//count+1;
		}else {
			// 
			nbstrases[indexOf].setCount(nbstrases[indexOf].getCount()+1);
		}
	}
	return Arrays.copyOfRange(nbstrases, 0, k);
	}
	private static int indexOf(NbStas[] nbstrases, int number, int nonNullElements) {
		for(int i=0;i<nonNullElements;i++) {
			if(nbstrases[i].getNumber()== number) {
				
				return i;
			}
		}
		return -1;
	}

}
