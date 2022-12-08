package view;

import static java.util.Comparator.comparing;
import static java.util.Comparator.reverseOrder;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import bean.Trader;
import bean.Transaction;
import model.DataModel;

public class AppTraders {
	public static void main(String[] args) {
		List<Transaction> transactions = DataModel.getTransactions();
		// 1. Find all transactions in the year 2011 and sort them by value (small to high).
		System.out.println("---------- Ex01 ----------");
		transactions.stream()
					.filter(s -> s.getYear() == 2011)
					.sorted(comparing(Transaction::getValue))
					.collect(Collectors.toList())
					.forEach(System.out::println);
		System.out.println("-------------------------------------------------------------------------------");
		// 2. Find all transactions have value greater than 300 and sort them by trader’s city
		System.out.println("---------- Ex02 ----------");
		transactions.stream()
					.filter(s -> s.getValue() > 300)
					.map(Transaction::getTrader)
					.sorted(comparing(Trader::getCity))
					.collect(Collectors.toList())
					.forEach(System.out::println);
		System.out.println("-------------------------------------------------------------------------------");
		// 3. What are all the unique cities where the traders work? 
		System.out.println("---------- Ex03 ----------");
		transactions.stream()
			   .map(s -> s.getTrader().getCity())
			   .distinct()
			   .forEach(System.out::println);
		System.out.println("-------------------------------------------------------------------------------");
		// 4. Find all traders from Cambridge and sort them by name descending.
		System.out.println("---------- Ex04 ----------");
					transactions.stream()
				    .filter(s -> "Cambridge".equals(s.getTrader().getCity()))
					.map(Transaction::getTrader)
					.distinct()
					.sorted(comparing(Trader::getName, reverseOrder()))
					.forEach(System.out::println);
		System.out.println("-------------------------------------------------------------------------------");
		// 5. Return a string of all traders’ names sorted alphabetically.
		System.out.println("---------- Ex05 ----------");
		String traderName =	transactions.stream()
										.map(s -> s.getTrader().getName())
										.sorted()
										.distinct()
										.reduce("", (s1, s2) -> s1 + " " + s2);
		System.out.println(traderName);
		System.out.println("-------------------------------------------------------------------------------");		
		// 6. Are any traders based in MiLan?
		System.out.println("---------- Ex06 -----------");
		if (isMiLan(transactions)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		System.out.println("-------------------------------------------------------------------------------");
		// 7. Count the number of traders in MiLan. 
		System.out.println("---------- Ex07 ------------");
		long count = transactions.stream()
					.filter(s -> "MiLan".equals(s.getTrader().getCity()))
					.count();
		System.out.println(count);
		System.out.println("-------------------------------------------------------------------------------");		
		// 8. Print all transactions’ values from the traders living in Cambridge.
		System.out.println("---------- Ex08 ------------");
		transactions.stream()
					.filter(s -> "Cambridge".equals(s.getTrader().getCity()))
					.map(Transaction::getValue)
					.collect(Collectors.toList())
					.forEach(System.out::println);
		System.out.println("-------------------------------------------------------------------------------");
		// 9. What’s the highest value of all the transactions?
		System.out.println("---------- Ex09 ------------");
		Optional<Double> highestValue = transactions.stream()
													.map(Transaction::getValue)
													.reduce(Double::max);
		System.out.println(highestValue);
		System.out.println("-------------------------------------------------------------------------------");
		// 10. Find the transaction with the smallest value. 
		System.out.println("---------- Ex10 ------------");
		Optional<Double> smallestValue = transactions.stream()
				.map(Transaction::getValue)
				.reduce(Double::min);
		System.out.println(smallestValue);
		System.out.println("-------------------------------------------------------------------------------");
	}
	
	private static boolean isMiLan(List<Transaction> transactions) {
		if (transactions.stream().anyMatch(s -> "MiLan".equals(s.getTrader().getCity()))) {
			return true;
		} else {
			return false;
		}
	}

}
