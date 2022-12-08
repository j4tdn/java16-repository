package designpattern.strategy;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class AppleConstructorReference {
	/*
	 * Constructor reference -> la mot cach viet ngan gon
	 * de tao ra mot doi tuong/ the hien/ gia tri cho functional interface
	 * 
	 * --> tuong tu method reference
	 * 
	 * 
	 * 
	 * method reference: (....) --> method
	 * constructor reference(...) -> constructor
	 * 
	 */
	public static void main(String[] args) {
		test(() -> {return new Apple();});
		test02((o1,o2) -> " siu " );
		test023(Apple::new);
		
	}
	private static void test02(BiFunction<Integer, Integer, String> bf) {
		String s = bf.apply(10, 15);
		System.out.println(s);
	}
	private static void test(Supplier<Apple> supplier) {
		Apple apple = supplier.get();
		System.out.println(apple);
	}
	private static <T, R> void test023(Function<String, Apple> funcition) {
		Apple apple = funcition.apply("xxx");
		System.out.println("  " + apple);
		
	}

}
