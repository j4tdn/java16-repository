package designpatterns.strategy;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;


/*
 * constructor reference là 1 cách viết ngắn gọn để tạo ra 1 thể hện,đối tượng hay 1 giá trị cho functional interface
 * -->tương tự method reference 
 * 
 * method reference : truyền vào tham số (...) --> method
 * constructor reference: (....) --> constructor
 * 
 * --> là functional nào có gamg trừu tượng (stategy method) có  dạng(...)
 * có dạng T method_name(...) --> mình có thể dùng lambda hoặc constructor reference để tạo ra đối tượng cho FI đó
 */

public class AppleConstructorReference {
	public static void main(String[] args) {
		test02((i1,i2) -> "hello");
		test03((String i1) -> {return new Apple(i1);});
	}
	
	private static void test03(Function<String, Apple> function) {
		Apple apple = function.apply("123456");
		System.out.println("test03: "+apple);
	}
	
	
	private static void test02(BiFunction<Integer, Integer, String> bf) {
		String s = bf.apply(10, 15);
		System.out.println(s);
	}
	
	private static void test01(Supplier<Apple> supplier) {
		Apple apple = supplier.get();
		System.out.println("--->"+ apple);
	}
}
