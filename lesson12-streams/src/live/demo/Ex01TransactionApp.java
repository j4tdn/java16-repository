package live.demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

import model.DataModel;
import predemo.Trader;
import predemo.Transaction;

public class Ex01TransactionApp {
	public static void main(String[] args) {
		List<Trader> traders = DataModel.getTraders();
		List<Transaction> transactions = DataModel.getTransactions();
				System.out.println(">>=============<<");
		
		//ex01
		
		transactions.stream().filter(o -> o.getYear()==2011).forEach( o -> System.out.println(0));
		
		//ex02
		
		transactions.stream().filter(o -> o.getValue() > 300)
		.forEach(o -> System.out.println(o));
		// ex 03
		
		traders.stream().filter(distinctByKey( o -> o.getCity())).forEach(o -> System.out.println(o));

		
	}
	public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor) {
        Set<Object> set = new HashSet<>();
        return t -> set.add(keyExtractor.apply(t)) == true;
    }
	
}