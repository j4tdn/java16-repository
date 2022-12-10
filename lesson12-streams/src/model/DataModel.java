package model;

import java.util.Arrays;
import java.util.List;

import designpatterns.strategy.*;
public class DataModel {
	public DataModel() {
		// TODO Auto-generated constructor stub
	}
	public static List<Apple> getApples(){
		return Arrays.asList(new Apple("A1","green",200,"VietNam"),
				new Apple("A2","red",400,"Lao"),
				new Apple("A3","blue",600,"VietNam"),
				new Apple("A4","green",200,"VietNam"),
				new Apple("A5","red",800,"ThaiLan"),
				new Apple("A6","yellow",100,"VietNam"),
				new Apple("A7","green",700,"VietNam"),
				new Apple("A8","yellow",800,"VietNam")
				);
	}
	

}
