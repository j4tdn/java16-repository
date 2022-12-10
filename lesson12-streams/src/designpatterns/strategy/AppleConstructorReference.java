package designpatterns.strategy;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/*
 * Constructor reference --> là 1 cách viết ngắn gọn để tạo ra 1 
 * đối tượng/thể hiện/giá trị cho functional interface
 * 
 * --> tương tự method reference
 * 
 * method reference : (...) --> method
 * constructor reference : (...) --> constructor
 * 
 * --> Functional interface nào có cái hàm trừu tượng(strategy method)
 * có dạng T method_name(...) --> mình có thể dùng lamda hoặc
 * constructor reference để tạo ra đối tượng cho FI đó
 */
public class AppleConstructorReference {
	public static void main(String[] args) {
		
		// anonymous class
		Supplier<Apple> sp1 = () -> {return null;};
		test01(sp1);
		
		Supplier<Apple> sp2 = () -> new Apple();
		test01(sp2);
		
		BiFunction<Integer, Integer, String> bf1 = (i1, i2) -> {return "hello";};
		test02(bf1);
		test02((i1, i2) -> "Hi");
		
		test03(id -> new Apple());
		test03(Apple::new);
		
	}
	
	private static void test01(Supplier<Apple> supplier) {
		Apple apple =supplier.get();
		System.out.println("---------> " + apple);
	}
	
	private static void test02(BiFunction<Integer, Integer, String> bf) {
		String s = bf.apply(10, 15);
		System.out.println("s ---> " + s);
	}
	
	private static void test03(Function<String, Apple> function) {
		Apple apple = function.apply("Zedd");
		System.out.println("test03 ----> " + apple);
		
		Apple apple1 = function.apply("akali");
		System.out.println("test03 ----> " + apple1);
	}
}
