package live.demo;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import bean.Trader;
import bean.Transaction;
import model.DataModel;

public class Ex01TransactionApp {
	public static void main(String[] args) {
		List<Trader> traders = DataModel.getTraders();
		List<Transaction> transactions = DataModel.getTransactions();

		// 1. Find all transactions in the year 2011 and sort them by value (small to
		// high).
		System.out.println("====1====");
		transactions.stream().filter(year -> year.getYear() == 2011).sorted(Comparator.comparing(Transaction::getValue)).forEach(System.out::println);

		// 2. Find all transactions have value greater than 300 and sort them by
		// trader’s city
		System.out.println("===2===");
		transactions.stream().filter(value -> value.getValue() < 300).map(Transaction::getTrader).sorted(Comparator.comparing(Trader::getCity)).forEach(System.out::println);
		// 3. What are all the unique cities where the traders work?
		
		
		// 4. Find all traders from Cambridge and sort them by name desc.
		traders.stream().filter(o -> o.getCity().equals("Cambridge")).forEach(System.out::println);
		// 5. Return a string of all traders’ names sorted alphabetically.
		
		// 6. Are any traders based in Milan?
		System.out.println("====6====");
		traders.stream().filter(o -> o.getCity().equals("Milan")).forEach(o -> System.out.println(o));
		// 7. Count the number of traders in Milan.
		System.out.println("====7====");
		long count = transactions.stream().filter(o -> o.getTrader().getCity().equals("Milan")).count();
		System.out.println(count);
		// 8. Print all transactions’ values from the traders living in Cambridge.
		System.out.println("====8====");
		transactions.stream().filter(o -> o.getTrader().getCity().equals("Cambridge")).map(o -> o.getValue())
		.forEach(o -> System.out.println(o));
		// 9. What’s the highest value of all the transactions?
		System.out.println("====9====");
		Integer max = transactions.stream().map(Transaction::getValue).reduce(Integer.MIN_VALUE, Integer::max);
		System.out.println("max --> " + max);
		// 10. Find the transaction with the smallest value.
		Integer min = transactions.stream().map(Transaction::getValue).reduce(Integer.MAX_VALUE, Integer::min);
		System.out.println("min --> " + min);

	}
}
