package working.finding_matching;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class Ex01BasicDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,1,4,5,8,10,4,12};
		System.out.println(Arrays.stream(arr).anyMatch(o->o%10==0));
		
		Arrays.stream(arr)
			.filter(o->o%4==0)
			.findFirst()
			.ifPresent(o -> System.out.println(o));;
		
		Arrays.stream(arr)
			.filter(o->o%5==0)
			.findAny()
			.ifPresent(o -> System.out.println(o));
		
		System.out.println(Arrays.stream(arr).anyMatch(o -> o < 100));
		
	}

}
