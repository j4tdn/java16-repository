package designpatterns.strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import model.DataModel;

/*
 *Find green apples 
 *Find red apples
 *find blue apples and heavier than 150g
 *
 */

// lambda là gì?:
/*
 *  lambda là một cách viêt,một cách code ngắn gọn để tạo ra một thể hện,đối tượng cho kiểu dữu liệu functional interface
 *  thay vì phải tạo một lớp anonymous class, implementation class
 *  
 *  nếu có nhiều hàm trưù tượng thì không dùng được lambda
 *  
 *  phần đóng mở ngoặc: là số lượng tham số truyền vào lambda
 */

/*
 * Predicate: T trả về kiểu boolean
 * Consumer: T trả về kiểu void
 * Callable,supplier:
 * 	   truyền vào () trả về T
 * Function <T,R>
 *  truyền vào T trả về R 
 */
public class AppleDemo {
	public static void main(String[] args) {
		List<Apple> inventory = DataModel.getApples();
		inventory.forEach(apple -> System.out.println(apple));
		
		System.out.println("===========");
		filter(inventory,apple -> "VietNam".equals(apple.getOriginal())).forEach(apple -> System.out.println(apple));
		
	}
	
	private static List<Apple> filter(List<Apple> inventory, Predicate<Apple> predicate){
		List<Apple> result = new ArrayList<>();
		for(Apple apple : inventory) {
			if(predicate.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}
}
