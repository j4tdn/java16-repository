package designpartterns.strategy;

import java.util.function.BiFunction;
import java.util.function.Supplier;

/**
 *  Constructor reference --> là 1 cách viết ngắn gọn
 *  để tạo ra 1 đối tượng/ thể hiện/ giá trị cho functional interface
 *  
 *  --> tương tự method reference
 *  
 *  method reference 		: (....) --> method
 *  constructure referencr 	: (....) --> constructor
 * @author ADMIN
 *
 */

public class AppleConstructorReferenvce {
	public static void main(String[] args) {
		test01(Apple::new);
		
		test02((o1, o2) -> "");
		
		test03(Apple::new);
	}
	
	private static void test01(Supplier<Apple> supp) {
		Apple apple = supp.get();
		System.out.println(apple);
	}
	
	private static void test02(BiFunction<Integer, Integer, String> supp) {
		String s = supp.apply(10, 15);
		System.out.println(s);
	}
	
	private static void test03(quareFunction<String, String, Double, String ,Apple> supp) {
		Apple s = supp.get("id1", "name", 123d, "VietNam");
		System.out.println(s);
	}
	
	
}

interface quareFunction<T1, T2, T3, T4 ,R>{
	abstract R get(T1 t, T2 u, T3 k, T4 r);
}
