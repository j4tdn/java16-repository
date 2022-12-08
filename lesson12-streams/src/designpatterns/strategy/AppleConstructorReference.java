package designpatterns.strategy;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Constructor reference --> la mot cach viet ngan gon
 * de tao ra 1 doi tuong the hien gia tri cho functional interface
 * 
 * --> Tuong tu method reference
 * 
 * method reference (...) --> method
 * constructor reference(...) --> constructor
 * @author chien
 *
 */
public class AppleConstructorReference {
	public static void main(String[] args) {
		Supplier<Apple> sp1 = new Supplier<Apple>() {

			@Override
			public Apple get() {
				// TODO Auto-generated method stub
				return null;
			}
			
		};
		
		test01(sp1);
		
		
		test02((Integer i1 , Integer i2) ->{
			return "hello";
		});
		
		test02((i1 ,i2) -> "hello");
		
		
	}
	
	private static void test01(Supplier<Apple> supplier) {
		Apple apple = supplier.get();
		System.out.println("------>" + apple);
	}
	
	private static void test02(BiFunction<Integer, Integer, String> bf) {
		String s= bf.apply(10, 15);
		System.out.println("s -->" + s);
	}
	
	private static void test03(Function<String, Apple> function) {
		Apple apple = function.apply("123456");
		System.out.println("test 03 --> " + apple);
	}
}
