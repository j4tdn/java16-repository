package live.demo;

import java.util.Comparator;
import java.util.List;

import model.Trader;
import model.Transaction;
import model.DataModel;

public class App {
	public static void main(String[] args) {
		
		List<Trader> trader = DemoLive.getTraders();
		
		List<Transaction> transaction = DemoLive.getTransactions();
		
		// 1. Find all transactions in the year 2011 and sort them by value.
		System.out.println("1. All transactions in the year 2011 and sort them by value: ");
		transaction.stream()
			.filter(t -> t.getYear() == 2011)
			.sorted((t1, t2) -> t1.getValue() - t2.getValue())
			.forEach(System.out::println);
		
		
		// 2. Find all transactions have value greater than 300 and sort them by trader’s city
		
		System.out.println("2. All transactions have value greater than 300 and sort them by trader’s city: ");
		transaction.stream()
			.filter(t -> t.getValue() > 300)
			.sorted((t1, t2) -> t1.getTrader().getCity().compareTo(t2.getTrader().getCity()))
			.forEach(System.out::println);
		
		// 3. What are all the unique cities where the traders work?
		System.out.println("3. All the unique cities where the traders work: ");
		trader.stream()
			.map(Trader::getCity)
			.forEach(System.out::println);
		
		// 4. Find all traders from Cambridge and sort them by name desc.
		System.out.println("4. All traders from Cambridge and sort them by name desc: ");
		trader.stream()
			.filter(t -> t.getCity() == "Cambridge")
			.sorted((t1, t2) -> t2.getName().compareTo(t1.getName()))
			.forEach(System.out::println);
		
		// 5. Return a string of all traders’ names sorted alphabetically.
		System.out.println("5. All traders’ names sorted alphabetically: ");
		trader.stream()
			.sorted((t1, t2) -> t1.getName().compareTo(t2.getName()))
			.forEach(System.out::println);
		
		// 6. Are any traders based in Milan?
		System.out.println("6. Traders based in Milan: ");
		trader.stream()
			.filter(t -> t.getCity() == "Milan")
			.forEach(System.out::println);
		
		// 7. Count the number of traders in Milan.
		System.out.println("7. Amount of traders in Milan: ");
		long result = trader.stream()
			.filter(t -> t.getCity() == "Milan")
			.count();
		System.out.println(result);
		
		// 8. Print all transactions’ values from the traders living in Cambridge.
		System.out.println("8. All transactions’ values from the traders living in Cambridge: ");
		transaction.stream()
			.filter(t -> t.getTrader().getCity() == "Cambridge")
			.map(Transaction::getValue)
			.forEach(System.out::println);
		
		// 9. What’s the highest value of all the transactions?
		System.out.println("9. The highest value of all the transactions: ");
		Integer max = transaction.stream()
			.map(Transaction::getValue)
			.reduce(Integer.MIN_VALUE, Integer::max);
		System.out.println(max);
		
		// 10. Find the transaction with the smallest value.
		System.out.println("10. The transaction with the smallest value: ");
		transaction.stream()
			.sorted((t1,t2) -> t1.getValue() - t2.getValue())
			.limit(1)
			.forEach(System.out::println);
	}
}
