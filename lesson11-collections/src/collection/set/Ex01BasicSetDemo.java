package collection.set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import bean.Employee;

import static utils.CollectionUtils.*;

public class Ex01BasicSetDemo {
	public static void main(String[] args) {
		Set<String> text = new HashSet<>();
		text.add("a");
		text.add("b");
		text.add("c");
		text.add(new String("b"));
		System.out.println(text.size());
		printf("set", text);
		
		
	}
	
}
