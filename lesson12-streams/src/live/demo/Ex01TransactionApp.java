package live.demo;

import static java.util.Comparator.*;

import java.util.Comparator;
import java.util.List;
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
		System.out.println("------- EX01 -------");
		transactions.stream()
					.filter(s -> s.getYear() == 2011)
					.sorted(comparing(Transaction::getValue))
					.forEach(System.out::println);
		System.out.println("--------------------------------------------------------------------------");
		// 2. Find all transactions have value greater than 300 and sort them by trader’s city
		System.out.println("------- EX02 -------");
		transactions.stream()
					.filter(s -> s.getValue() > 300)
					.map(Transaction::getTrader)
					.sorted(comparing(Trader::getCity, reverseOrder()))
					.distinct()
					.forEach(System.out::println);
		System.out.println("-----------------------------------------------------------------------------");
		// 3. What are all the unique cities where the traders work?
		System.out.println("------- EX03 -------");
		traders.stream()
				.map(Trader::getCity)
				.distinct()
				.forEach(System.out::println);
		System.out.println("-----------------------------------------------------------------------------");

		// 4. Find all traders from Cambridge and sort them by name descending.
		System.out.println("------- EX04 -------");
							transactions.stream()
										   .map(Transaction::getTrader)
										   .filter(s -> "Cambridge".equals(s.getCity()))
										   .distinct()
										   .sorted(comparing(Trader::getName))
										   .collect(Collectors.toList())
										   .forEach(System.out::println);
										   
		System.out.println("-----------------------------------------------------------------------------");
		

		// 5. Return a string of all traders’ names sorted alphabetically.
		System.out.println("------- EX05 -------");
		String trader = transactions.stream()
										 .map(s -> s.getTrader().getName())
										 .distinct()
										 .sorted()
										 .reduce("", (n1, n2) -> n1 + " " + n2);
		System.out.println(trader);
		System.out.println("-----------------------------------------------------------------------------");

		// 6. Are any traders based in Milan?
		System.out.println("------- EX06 -------");
		boolean traderMiLan = transactions.stream()
										  .anyMatch(s -> "Milan".equals(s.getTrader().getCity()));
		System.out.println(traderMiLan);
		System.out.println("-----------------------------------------------------------------------------");

		// 7. Count the number of traders in Milan.
		System.out.println("------- EX07 -------");
		long count = transactions.stream()
					.filter(s -> "Milan".equals(s.getTrader().getCity()))
					.count();
		System.out.println(count);
		System.out.println("-----------------------------------------------------------------------------");

		// 8. Print all transactions’ values from the traders living in Cambridge.
		System.out.println("------- EX08 -------");
		transactions.stream()
					.filter(s -> "Cambridge".equals(s.getTrader().getCity()))
					.map(Transaction::getValue)
					.forEach(System.out::println);
		System.out.println("-----------------------------------------------------------------------------");

		// 9. What’s the highest value of all the transactions?
		System.out.println("------- EX09 -------");
		Optional<Integer> highestValue = transactions.stream()
													 .map(Transaction::getValue)
													 .reduce(Integer::max);
		System.out.println(highestValue);
		System.out.println("-----------------------------------------------------------------------------");

		// 10. Find the transaction with the smallest value.
		System.out.println("------- EX10 -------");
		Optional<Integer> smallestValue = transactions.stream()
				 .map(Transaction::getValue)
				 .reduce(Integer::min);
		System.out.println(smallestValue);
	}

}
