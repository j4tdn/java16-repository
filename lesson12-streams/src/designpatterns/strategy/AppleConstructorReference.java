package designpatterns.strategy;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Constructor referencce --> là một cách viết ngắn gọn để tạo ra 1 đối tượng/
 * thể hiện/ giá trị cho functional interface --> Tương tự method reference
 * 
 * method referencce : (...) --> method constructor reference : (...) -->
 * constructor
 * 
 * --> Functional Interface nào có hàm trừu tượng (stratery method) có dạng T
 * method_name(...) --> mình có thể dùng lamda hoặc constructor reference để tạo
 * đối tượng cho FI đó
 *
 */
public class AppleConstructorReference {
	public static void main(String[] args) {
		Supplier<Apple> sp1 = () -> {
			return null;
		};
		Test01(sp1);

		BiFunction<Integer, Integer, String> sq2 = (a1, a2) -> "phat";

		test02(sq2);

		// test03(id -> new Apple(id));
		test03(Apple::new);

	}

	public static void test03(Function<String, Apple> function) {
		Apple apple = function.apply("1234abc");
		System.out.println("test03 --> " + apple);
	}

	public static void test02(BiFunction<Integer, Integer, String> bf) {
		String s = bf.apply(10, 15);
		System.out.println("s --> " + s);
	}

	private static void Test01(Supplier<Apple> supplier) {
		Apple apple = supplier.get();
		System.out.println("------------->");
	}
}
