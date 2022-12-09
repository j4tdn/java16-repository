package designpatterns.strategy;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class AppleConstructorReference {

	public static void main(String[] args) {
		// anonymous class
		Supplier<Apple> sp1 = () -> {
			return null;
		};
		test01(sp1);
		
		// anonymous class
		// Supplier<Apple> sp2 = () -> new Apple(); // empty constructor
		Supplier<Apple> sp2 = Apple::new;
		test01(sp2);
		
		test02((Integer i1, Integer i2) -> {
			return "hello";
		});
		
		test02((i1, i2) -> "hello");
		
		// test03(id -> new Apple(id));
		test03(Apple::new);
		test04(10,11,(i3, i4) -> "hello"+i3+i4);
	}
	
	public static void test03(Function<String, Apple> function) {
		Apple apple = function.apply("123456");
		System.out.println("test03 ---> " + apple);
		
		Apple apple1 = function.apply("258228");
		System.out.println("test03 --> " + apple1);
	}
	
	// supplier = sp2
	private static void test01(Supplier<Apple> supplier) {
		Apple apple = supplier.get();
		System.out.println("--------> " + apple);
	}
	
	public static void test02(BiFunction<Integer, Integer, String> bf) {
		String s = bf.apply(10,15);
		System.out.println("s --> " + s);
	}
	public static void test04(int i1,int i2,BiFunction<Integer, Integer, String> bf) {
		String s = bf.apply(i1,i2);
		System.out.println("s --> " + s);
	}
	

}
