package live.demo;

import java.util.Comparator;
import java.util.List;

import model.DataModel;
import predemo.Trader;
import predemo.Transaction;

public class Ex01TransactionApp {
	public static void main(String[] args) {
		List<Trader> traders = DataModel.getTrader();
		List<Transaction> transactions = DataModel.getTransaction();
		
		// 1. Find all transactions in the year 2011 and sort them by value (small to high).
		transactions.stream()
			.filter(t -> t.getYear() == 2011)
			.sorted(Comparator.comparing(Transaction::getYear))
			.forEach(System.out::print);
		
		System.out.println("==============================");
		// 2. Find all transactions have value greater than 300 and sort them by trader’s city
		transactions.stream()
			.filter(t -> t.getValue() > 300)
			.sorted(Comparator.comparing(t -> t.getTrader().getCity()))
			.forEach(System.out::print);
		
		System.out.println("==============================");
		// 3. What are all the unique cities where the traders work?
		
		traders.stream()
			.map(Trader::getCity)
			.distinct()
			.forEach(System.out::println);
		System.out.println("==============================");
		
		// 4. Find all traders from Cambridge and sort them by name desc.
		traders.stream()
				.filter(t -> "Cambridge".equals(t.getCity()))
				.sorted(Comparator.comparing(Trader::getName))
				.forEach(System.out::println);
		
		// 5. Return a string of all traders’ names sorted alphabetically.
		StringBuilder resultQuestion5 = new StringBuilder();
		traders.stream()
				.map(Trader::getName)
				.forEach(t -> resultQuestion5.append(t));
		
		System.out.println(resultQuestion5);
		System.out.println("==============================");
		
		// 6. Are any traders based in Milan?
		boolean baseInMilan = 
				traders.stream()
				.map(t -> t.getCity())
				.anyMatch(t -> "Milan".equals(t));
		System.out.println("baseInMilan: " + (baseInMilan ? "Yes" : "No"));
		System.out.println("==============================");
		
		// 7. Count the number of traders in Milan.
		long amountTradersInMilan = traders.stream()
				.map(t -> t.getCity())
				.filter(t -> "Milan".equals(t))
				.count();
		System.out.println("Count the number of traders in Milan: " + amountTradersInMilan);
		System.out.println("==============================");
		
		//8. Print all transactions’ values from the traders living in Cambridge.
		transactions.stream()
		.filter(t -> "Cambridge".equals(t.getTrader().getCity()))
		.map(Transaction::getValue)
		.forEach(System.out::println);
		System.out.println("==============================");
		
		// 9. What’s the highest value of all the transactions?
		Integer max = transactions.stream()
			.map(Transaction::getValue)
			.reduce(Integer.MIN_VALUE, Integer::max);
		
		System.out.println("The highest value: " + max);
		System.out.println("==============================");
		
		// 10. Find the transaction with the smallest value.
		Integer min = transactions.stream()
			.map(Transaction::getValue)
			.reduce(Integer.MAX_VALUE, Integer::min);
		System.out.println("The smallest value: " + min);
		System.out.println("==============================");
	}
}
