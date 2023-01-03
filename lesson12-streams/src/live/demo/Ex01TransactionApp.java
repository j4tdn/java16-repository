package live.demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.function.Predicate;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

import bean.Trader;
import bean.Transaction;
import model.DataModel;

public class Ex01TransactionApp {
	public static void main(String[] args) {

		List<Trader> traders = DataModel.getTraders();
		List<Transaction> transactions = DataModel.getTransactions();

		// 1. Find all transactions in the year 2011 and sort them by value (small to high).
		transactions.sort((t1, t2) -> t1.getValue());
		filter(transactions, t -> t.getYear() == 2011).forEach(System.out::println);

		System.out.println("============");
		// 2. Find all transactions have value greater than 300 and sort them by trader’s city 
		traders.sort((t1, t2) -> t1.getCity().compareTo(t2.getCity()));
		filter(transactions, t -> t.getValue() > 300).forEach(System.out::println);

		System.out.println("============");
		// 3. What are all the unique cities where the traders work?
		traders.stream().map(Trader::getCity).distinct().forEach(System.out::println);

		System.out.println("============");
		// 4.Find all traders from Cambridge and sort them by name desc. 
		 traders.sort((t1, t2) -> t2.getName().compareTo(t1.getName()));
         traders.stream().filter(t -> t.getCity() == "Cambridge").forEach(System.out::println);

         System.out.println("============");
		// 5. Return a string of all traders’ names sorted alphabetically. 
         traders.sort((t1, t2) -> t1.getName().compareTo(t2.getName()));
		traders.stream().map(t -> t.getName()).distinct().forEach(System.out::println);
         
		System.out.println("============");
		// 6. Are any traders based in Milan? 
		boolean isAnyTradersInMilan = traders.stream().anyMatch(t -> "Milan".equals(t.getCity()));
		System.out.println("Are any traders based in Milan? -> " + isAnyTradersInMilan);
		
		System.out.println("============");
		// 7. Count the number of traders in Milan. 
		long count = traders.stream().filter(t -> "Milan".equals(t.getCity())).count();
		System.out.println("The number of traders in Milan -> " + count);
		
		System.out.println("============");
		// 8. Print all transactions’ values from the traders living in Cambridge.
		transactions.stream().filter(t -> "Cambridge".equals(t.getTrader().getCity())).map(t -> t.getValue()).forEach(System.out::println);
		
		System.out.println("============");
		// 9. What’s the highest value of all the transactions? 
		Integer maxValue = transactions.stream().map(t -> t.getValue()).reduce(Integer.MIN_VALUE, (t1,t2) -> t1 > t2 ? t1 : t2);
		System.out.println("The highest value of all the transactions -> " + maxValue);
		
		System.out.println("============");
		// 10. Find the transaction with the smallest value
		transactions.sort((t1, t2) -> t1.getValue()-t2.getValue());
	    transactions.stream().limit(1).forEach(System.out::println);
	}

	private static <T> List<T> filter(List<T> transactions, Predicate<T> predicate) {
		List<T> result = new ArrayList<>();
		for (T t : transactions) {
			if (predicate.test(t)) {
				result.add(t);
			}
		}
		return result;
	}

}
