import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

import model.DataModel;

public class Ex05 {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		
		// tim sinh vien co DTB>8
		students.stream().filter(s ->s.getPoint()>8).forEach(s -> System.out.println(s));
		
		// tim sinh vien nu
		students.stream().filter(s -> s.getSexual()=="NU").forEach(s -> System.out.println(s));
	}
	
	public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor) {
        Set<Object> set = new HashSet<>();
        return t -> set.add(keyExtractor.apply(t)) == true;
    }
}
