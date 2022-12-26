package live_demo;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.*;

import java.util.Comparator;
import bean.Trader;
import bean.Transaction;
import model.DataModel;

public class Ex01Transaction {
	public static void main(String[] args) {
		List<Trader> traders = DataModel.getTraders();
		List<Transaction> transactions = DataModel.getTransactions();
		System.out.println("1. Find all transactions in the year 2011 and sort them by value ");
		transactions.stream()
		.filter(t -> t.getYear() == 2011)
		.sorted(comparing(Transaction::getValue))
		.forEach(System.out::println);


		System.out.println("\n2. Find all transactions have value greater than 300 and sort them by trader’s city");
		transactions.stream().filter(t -> t.getValue() > 300)
		.sorted((t1, t2) -> (t1.getTrader().getCity().compareTo(t2.getTrader().getCity())))
		.forEach(t -> System.out.println(t));
		
		System.out.println("\n3. What are all the unique cities where the traders work?");
		traders.stream()
		.map(Trader::getCity)
		.distinct()
		.forEach(System.out::println);

		System.out.println("\n4. Find all traders from Cambridge and sort them by name desc");
		traders.stream()
		.filter(t -> "Cambridge".equals(t.getCity()))
		.sorted(Comparator.comparing(Trader::getName))
		.forEach(System.out::println);
		 
		System.out.println("\n5. Return a string of all traders’ names sorted alphabetically");
		String trader = transactions.stream()
				 .map(t -> t.getTrader().getName())
				 .distinct()
				 .sorted()
				 .reduce("", (n1, n2) -> n1 + " " + n2);
		System.out.println(trader);
		
		System.out.println("\n6. Are any traders based in Milan?");
		boolean AreTraderBasedInMiLan = transactions.stream()
				  .anyMatch(t -> "Milan".equals(t.getTrader().getCity()));
		System.out.println(AreTraderBasedInMiLan);
		
		System.out.print("\n7. Count the number of traders in Milan: ");
		long countTraderMilan = transactions.stream()
				.filter(t -> "Milan".equals(t.getTrader().getCity()))
				.count();
		System.out.println(countTraderMilan);
		
		System.out.println("\n8. Print all transactions’ values from the traders living in Cambridge");
		transactions.stream().filter(t -> t.getTrader().getCity().equals("Cambridge"))
		.forEach(System.out::println);
		
		System.out.println("\n9. What’s the highest value of all the transactions? ");
		Integer highestValue = transactions.stream()
				.map(Transaction::getValue)
				.reduce(Integer.MIN_VALUE, Integer::max);
			
			System.out.println("The highest value: " + highestValue);
		
		System.out.println("\n10. Find the transaction with the smallest value. ");
		Integer smallestValue = transactions.stream()
				.map(Transaction::getValue)
				.reduce(Integer.MAX_VALUE, Integer::min);
			System.out.println("The smallest value: " + smallestValue);
	
	}

}
