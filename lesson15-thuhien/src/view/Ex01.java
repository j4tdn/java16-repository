package view;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
public class Ex01 {
	public static void main(String[] args) {
		List<Integer> lists = getList(10);
		lists.forEach(System.out::println);
		List<Integer> notUnique =  lists.stream()
		.filter(a -> 
				{
					int count = 0;
					for(Integer list : lists) {
						if(a == list) {
							count++;
						}
					}
					return count == 1;
				})
		.distinct()
		.collect(Collectors.toList());
		System.out.println();
		notUnique.forEach(System.out::println);

		List<Integer> Unique =  lists.stream()
				.filter(a -> 
						{
							int count = 0;
							for(Integer list : lists) {
								if(a == list) {
									count++;
								}
							}
							return count != 1;
						})
				.distinct()
				.collect(Collectors.toList());
				System.out.println();
				Unique.forEach(System.out::println);

	}
	public static List<Integer> getList(int n){
		List<Integer> list = new ArrayList<>();
		Random rd = new Random();
		for(int i = 0; i < n; i++) {
			list.add(rd.nextInt(20));
		}
		return list;
	}
}

 