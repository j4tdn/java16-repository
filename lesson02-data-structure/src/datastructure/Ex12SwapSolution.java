package datastructure;

import bean.CustomInteger;

public class Ex12SwapSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomInteger nA = new CustomInteger(22);
		CustomInteger nB = new CustomInteger(66);
		Swap(nA,nB);
		System.out.println(  "  nA" + nA);
		System.out.println( " nB" + nB);
		}
		public static void Swap( CustomInteger fist,CustomInteger second) {
			int tmp = fist.pvalue;
			fist.pvalue= second.pvalue;
			second.pvalue= tmp;
			 
		}
		
		

	

}
