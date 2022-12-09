package designpatterns.strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import model.DataModel;

public class AppleDemo {
	public static void main(String[] args) {
		
		List<Apple> inventory = DataModel.getApples();
		inventory.forEach(apple -> System.out.println(apple));
		System.out.println("==========");
		//filter(inventory, ap -> "gr".equals(ap.get))
		filter(inventory, appl -> "green".equals(appl.getColor())).forEach(appl -> System.out.println(appl));
	}
	private static List<Apple> filter(List<Apple> inventory,Predicate<Apple> predicate){
		List<Apple> rs = new ArrayList<>();
		for (Apple ap : inventory) {
			if(predicate.test(ap)) {
				rs.add(ap);
			}
		}
		return rs;
		
	}

}
