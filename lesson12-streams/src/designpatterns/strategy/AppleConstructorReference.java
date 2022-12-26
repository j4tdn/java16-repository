package designpatterns.strategy;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Constructor Reference --> là một cách viết ngắn gọn
 * để tạo ra 1 đối tượng/thể hiện/ giá trị cho functional interface
 * 
 * --> Tương tự method reference
 * 
 * method reference : (...) --> method
 * constructor reference: (...) --> constructor
 *
 *có dạng T method_name(...) --> mình có thể dùng lambda 
 *hoặc constructor reference để tạo ra đối tượng cho FI
 */

public class AppleConstructorReference {
	public static void main(String[] args) {
		Supplier<Apple> sp1 = () -> new Apple();
		Supplier<Apple> sp2 = Apple::new;
		test01(sp1);
		test02((i1, i2) -> "Nhung");
		
		// test03(id -> new Apple(id));
		test03(Apple::new);
	}
	
	private static void test03(Function<String, Apple> function) {
		Apple apple = function.apply("123ABC");
		System.out.println("test03 ---> " + apple);
	}
	
	private static void test02(BiFunction<Integer, Integer, String> bf) {
		String s = bf.apply(10, 15);
		System.out.println();
	}
	
	private static void test01(Supplier<Apple> supplier) {
		Apple apple = supplier.get();
		System.out.println("------------->" + apple);
	}
}
