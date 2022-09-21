package view;

import java.util.Arrays;
import java.util.List;

import bean.NbrStas;

public class Ex04NumberStatistic {
	public static void main(String[] args) {
		int [] number = {3,15,21,0,15,17,21};
		
		
	}
	private static NbrStas[] groupby(int [] numbers) {
		NbrStas[] nbrStases = new NbrStas[numbers.length];
		int k = 0;
		for(int number: numbers) {
			if(isExist(nbrStases, number)) {
				//count +1
			}
			else {
				//add, count = 1
				nbrStases[k] = new NbrStas(number, 1);
			}
		}
		return nbrStases;
	}
	private static boolean isExist(NbrStas[] nbrStases, int number) {
		for(int i = 0; i < nbrStases.length; i++) {
			if(nbrStases[i].getNumber() == number) {
				return true;
			}
		}
		return false;
	}

}
