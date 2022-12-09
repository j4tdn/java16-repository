package designpattern.strategy;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Constructor reference --> là một cách viết ngắn gọn
 * để tạo ra 1 đối tượng/thể hiện/giá trị cho functional interface
 * 
 * --> Tương tự method reference
 * 
 * method reference     : (....) --> method
 * constructor reference: (....) --> constructor
 * 
 * --> Functional Interface nào có hàm trừu tượng(strategy method)
 * có dạng T method_name(...) --> mình có thể dùng lambda hoặc
 * constructor reference để tạo ra đối tượng cho FI đó
 *
 */

public class AppleConstructureReference {
	public static void main(String[] args) {
		Supplier<Apple> sp1 = () ->{
			return null;
		};
		test01(sp1);
		Supplier<Apple> sp2 = Apple::new;
		test01(sp2);
		test02((Integer i1, Integer i2) -> {return "hello";});
		test02((i1,i2)-> "hello");
		
		test03(null);
		
	}
	private static void test01(Supplier<Apple> supplier) {
		Apple apple = supplier.get();
		System.out.println(apple);
	}
	private static void test02(BiFunction<Integer, Integer, String> bf) {
		String s = bf.apply(10, 5);
		System.out.println(s);
	}
	public static void test03(Function<String, Apple> function) {
		Apple apple = function.apply("123456");
		System.out.println(apple);
		Apple apple1 = function.apply("36521");
		System.out.println(apple1);
				
	}

}
