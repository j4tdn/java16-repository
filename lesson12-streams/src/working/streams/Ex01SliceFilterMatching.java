package working.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex01SliceFilterMatching {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 1, 2, 2, 3, 4);
		
	    // 1. select unique elements --> 1 2 3 4
		numbers.stream() //Stream<integer>
		.distinct()//Stream<integer>-->hashcode và equals như set, list
		.forEach(number -> System.out.println(numbers +", "));
		
		//2 select elements which appear one time in list-->3,4
		//map<number,count>
		//1 2
		//2 2
		//3 1
		//4 1
		Map<Integer, List<Integer>> map = numbers.stream()
		.collect(Collectors.groupingBy(number ->number));
		//groupingBy: gộp nhóm: những phần tử cùng giá trị sẽ về 1 nhóm
		
		map.entrySet()//Entry<Interge, List<Interge>>
		.stream()
		.filter(Entry -> Entry.getValue().size()==1)
		.forEach(e->System.out.println(e.getKey()));
		
		//
		numbers.stream()
		.collect(Collectors.groupingBy(number ->number,Collectors.counting()))
		.entrySet()
		.stream()
		.filter(e->e.getValue()==1)
		.forEach(e->System.out.println(e.getKey()));
		
	}
}
