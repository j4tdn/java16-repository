package designpatterns.strategy;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/*
 * Constructor Reference: cách viết ngắn gọn
 * để tạo ra 1 đối tượng /thể hiện/ giá trị cho 1 function interface
 * 
 * --> tương tự method reference
 * 
 * 
 * --> Function interface nào có hàm trừu tượng(strategy method)
 * có dạng T method_name(...)--> mình có thể dùng lamda hoặc constructor reference 
 * để tạo ra đối tượng cho FI đó
 */

public class AppleConstructorReference {
	public static void main(String[] args) {
		Supplier<Apple> sp1 = () -> {
			return null;
		};
		test01(sp1);
		
		BiFunction<Integer, Integer, String> bf = new BiFunction<Integer, Integer, String>() {
			
			@Override
			public String apply(Integer t, Integer u) {
				return null;
			}
		};
		BiFunction<Integer, Integer, String> bf1 = (Integer t, Integer u) ->{
			return "";
		};
		test02(bf1);
		
		
		//test03(id -> new Apple(id));

		 test03(Apple::new);
	}
	public static void test03(Function<String, Apple> function) {
		Apple apple= function.apply("123");
		System.out.println("test03--> " + apple);
	}
	public static void test02(BiFunction<Integer, Integer, String> bf) {
		String s = bf.apply(10, 15);
		System.out.println("s--> " +s);
	}
	private static void test01(Supplier<Apple> supplier) {
		Apple apple = supplier.get();
		System.out.println("------->" + apple);
	}

}
