package datastructure;

import bean.CustomeInteger;

public class ExHomeWork {
	public static void main(String[] args) {
		CustomeInteger nA = new CustomeInteger(22);
		CustomeInteger nB=new CustomeInteger(66);
		swap(nA, nB);
		System.out.println(nA);
		System.out.println(nB);
		
	}
	private static void swap(CustomeInteger a,CustomeInteger b) {
		int temp= a.value;
		a.value=b.value;
		b.value=temp;
	}
}
