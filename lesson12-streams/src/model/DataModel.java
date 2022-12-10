package model;

import java.util.Arrays;
import java.util.List;

import designpatterns.strategy.Apple;

public class DataModel {
	private DataModel() {
		
	}
	
	public static List<Apple> getApples(){
		return Arrays.asList(
				new Apple("A1","green",200,"VietNam"),
				new Apple("A2","red",400,"Lao"),
				new Apple("A3","blue",600,"VietNam"),
				new Apple("A4","gray",200,"Lao"),
				new Apple("B1","Yellow",800,"VietNam"),
				new Apple("B2","red",100,"Brineo")
				);
	}
}