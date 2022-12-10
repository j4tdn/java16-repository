package designpatterns.strategy;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/*
 * Constructor reference --> là 1 cách viết ngắn gọn để tạo ra 1 đối tượng/thể hiện/giá trị cho functional interface
 * 
 * --> Tương tự method reference
 * 
 * method reference: (....) --> method
 * constructor referenceL (....) --> constructor
 * 
 *  --> Functional Interface nào có hàm trừu tượng(stategy method) có dạng T method name(...) --> mình có thể dùng lambda hoặc constructor reference để tạo ra đối tượng FI đó
 */
public class AppleConstructorReference {
	public static void main(String[] args) {
		//Supplier<Apple> st1 = () -> new Apple();
		Supplier<Apple> st1 = Apple::new;
	
		test01(st1);


		test02((i1, i2) -> "hello");
		
		test03(null);
	}
	private static void test01(Supplier<Apple> supplier) {
		Apple apple = supplier.get();
		System.out.println("---------------->" + apple);
	}

	public static void test02(BiFunction<Integer, Integer, String> bf) {
		String s = bf.apply(10, 15);
		System.out.println("s --> " + s);
	}

	private static void test03(Function<String, Apple> function) {
		Apple apple = function.apply("1234");
		System.out.println("---------------->" + apple);
	}
}
