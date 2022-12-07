package designpatterns.strategy;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/*
 * Constructor reference --> là một cách viết ngắn gọn để tạo ra
 * 1 đối tượng/thể hiện/giá trị cho 1 functional interface
 * 
 * --> Tương tự method reference
 * 
 * method reference     : (....) --> method
 * constructor reference: (....) --> constructor 
 * 
 * --> Functional Interface nào có hàm trừu tượng(strategy method)
 * có dạng T method name(...) --> mình có thể 
 */
public class AppleConstructorReference {
	public static void main(String[] args) {

		Supplier<Apple> sp1 = () -> {
			return null;
		};
		
		test01(sp1);
		
		// anonymous class
		Supplier<Apple> sp2 = () -> new Apple();  // empty constructor
		test01(sp2);
		System.out.println("=======");
		
		
		BiFunction<Integer, Integer, String> sp3 = new BiFunction<Integer, Integer, String>() {
			@Override
			public String apply(Integer t, Integer u) {
				return null;
			}
		};		
		test02((i1, i2) -> "Java16");
		//test03(id -> new Apple(id));
		test03(Apple::new);
	}
	
	public static void test03(Function<String, Apple> function)  {
		Apple apple = function.apply("123");
		System.out.println("test03 --> " + apple);	
	}

	private static void test02(BiFunction<Integer, Integer, String> bf) {
		String s = bf.apply(10, 15);
		System.out.println("s --> " + s);
	}

	private static void test01(Supplier<Apple> supplier) {
		Apple apple = supplier.get();
		System.out.println("--------->" + apple);
	}
}
