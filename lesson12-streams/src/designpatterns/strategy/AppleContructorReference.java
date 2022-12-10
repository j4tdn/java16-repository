package designpatterns.strategy;

import java.util.function.BiFunction;
import java.util.function.Supplier;

/*
 * Contructor reference --> là một cách viết ngắn gọn
 * để tạo ra 1 đối tượng/ thể hiện/ giá trị cho functional interface
 * 
 * --> tương tự method reference
 * 
 * method reference   : (....) -> method
 * contructor reference: (....) -> constructor
 * 
 * 
 * --> Functional Interface nào có hàm trừu tượng (Strategy methodA)
 * có dạng T method_name(...) --> mình có thể dùng lambda hoặc 
 * contructor reference để tạo ra đối tượng cho FI đó
 * 
 * 
 * 
 * lambda: 
 * */

public class AppleContructorReference {

	public static void main(String[] args) {
	
		// anonymos class
//		Supplier<Apple> sp1 = new Supplier<Apple>() {
//
//			@Override
//			public Apple get() {
//	
//				return new Apple();
//			}
//		};
		
		//lambda
//		Supplier<Apple> sp1 = () -> {
//			return new Apple();
//		};
		
		//Supplier<Apple> sp2 = Apple::new;
		/Supplier<Apple> sp2 = () -> new Apple();
		
//       test01(() ->  new Apple());		
		
		test01(sp2);
		
		
//		test02((Integer i1, Integer i2) -> {
//			return "hello";
//		});
		
		test02(( i1, i2) -> "hello");
	}
	
	// supplier  = sp1
	private static void test01(Supplier<Apple> supplier)
	{
		 Apple apple = supplier.get();
		 
		 System.out.println("--------> " + apple);
		 
	}
	public static void test02(BiFunction<Integer, Integer, String> bf)
	{
		String s = bf.apply(10,  15);
		System.out.println("S--> " + s);
	}
}
