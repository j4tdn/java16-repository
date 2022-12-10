package designpatterns.strategy;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/*
 * Constructor Reference là cách viết ngắn gon để tao ra 1 đối tương/ thể hiên giá tri cho functional interface
 * --> tương tư method reference
 * 
 * method reference (...) -> method
 * Constructor Reference : (...) -> constructor
 * 
 * --> Functional interface nào có hàm trừu tương(strategy method) có dang T method_name(..): có hoăc k có tham số-
 * ---> có thể dùm lamda || constructor reference để tao ra đối tương
 */

public class AppleConstructorReference {
	public static void main(String[] args) {
		//Supplier<Apple> spl01 = () -> new Apple(); empty constructor
		Supplier<Apple> spl01 = Apple::new ; //constructor conference
		Apple apl01  = spl01.get();
		
		
		//Tao đối tương cho biến kiểu interface
		//anonymus class
		Supplier<Apple> spl02 = new Supplier<Apple>() {
			
			@Override
			public Apple get() {
				// TODO Auto-generated method stub
				return null;
			}
		};
		
		test02((Integer i1, Integer i2) -> "i1+i2");
		test02(( i1, i2) -> "i1+i2");
		test03(id -> new Apple(id));
		test03(Apple::new);
			
		
	}
	
	private static void test03(Function<String, Apple> function) {
		Apple apple = function.apply("xxxx");
		System.out.println("test03 ---> " + apple);
		
		Apple apple1 = function.apply("12345");
		System.out.println("test03 ---> " + apple1);
	}
	
	private static void test02(BiFunction<Integer, Integer, String> bf) {
		String s = bf.apply(10, 15);
		System.out.println("s--> " + s);
	}
	
	private static void test01(Supplier<Apple> supplier) {
		Apple apple = supplier.get();
		System.out.println("-------> " + apple);
		
	}

}
