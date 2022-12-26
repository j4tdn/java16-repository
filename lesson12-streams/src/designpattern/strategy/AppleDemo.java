package designpattern.strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import model.DataModel;

/**
 * 
 * find green apples
 * find red apples
 * find blue apples and havier than 150gr
 * find apples from vietnam
 *
 */
public class AppleDemo {
	public static void main(String[] args) {
		List<Apple> apples = DataModel.getApples();
		apples.forEach(o -> System.out.println(o));
		System.out.println("=======================");
		//findApple(apples, o -> o.getColor() == "green");
		findApple(apples, o -> ("green".equals(o.getColor()) && (o.getId().equals("A1")))).forEach(o -> System.out.println(o));
		
		//apples.stream().filter(o -> o.getColor().contains("green")).forEach(o -> System.out.println(o));
	}
	
	
	public static List<Apple> findApple(List<Apple> apples, Predicate<Apple> predicate){
		List<Apple> list = new ArrayList<>();
		for (Apple apple : apples) {
			if(predicate.test(apple)) {
				list.add(apple);
			}
		}
		return list;
	}

}
