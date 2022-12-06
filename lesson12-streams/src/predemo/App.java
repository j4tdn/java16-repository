package predemo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

import model.DataModel2;

public class App {
	public static void main(String[] args) {
		List<Transaction> ci = DataModel2.getTransaction();
		
		//Find(ci,trader -> "Milan".equals(trader.getCity())).forEach(apple -> System.out.println(apple));
	}
	
	private static  Set<Trader> Find(List<Trader> elements,Predicate<Trader> pre){
		Set<Trader> result = new HashSet<>();
		for(Trader  t: elements) {
			if(pre.test(t)) {
				result.add(t);
			};
		}
		return result;
	}
}
