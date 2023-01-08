package live.demo;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import bean.Trader;
import bean.Transaction;
import model.DataModel;

public class Ex01TransactionApp {
	public static void main(String[] args) {		
		List<Trader> traders = DataModel.getTraders();
		List<Transaction> transactions = DataModel.getTransactions();
		
		System.out.println("1. Find all transactions in the year 2011 and sort them by a(small to high).  ");
		transactions.stream()
		.filter(t -> t.getYear() == 2011)
		.sorted((t1, t2) -> t1.getValue() - t2.getValue())
		.forEach(System.out::println);
		
		System.out.println("\n2. Find all transactions have value greater than 300 and sort them by trader’s city  ");
		transactions.stream()
		.filter(t -> t.getValue() > 300)
		.sorted((t1, t2) -> t1.getTrader().getCity().compareTo(t2.getTrader().getCity()))
		.forEach(System.out::println);
		
		System.out.println("\n3. What are all the unique cities where the traders work? ");
		traders.stream()
		.map(t -> t.getCity())
		.distinct()
		.forEach(System.out::println);
		
		System.out.println("\n4. Find all traders from Cambridge and sort them by name desc. ");
		traders.stream()
		.filter(t -> "Cambridge".equals(t.getCity()))
		.sorted((t1, t2) -> t2.getName().compareTo(t1.getName()))
		.forEach(System.out::println);
		
		System.out.println("\n5. Return a string of all traders’ names sorted alphabetically. ");
		traders.stream()
		.map(t -> t.getName())
		.distinct()
		.sorted()
		.forEach(System.out::println);
		
		System.out.println("\n6. Are any traders based in Milan? ");
		boolean areAnyTradersInMiLan = traders.stream()
		.anyMatch(t -> "Milan".equals(t.getCity()));
		System.out.println(areAnyTradersInMiLan);
		
		System.out.println("\n7. Count the number of traders in Milan. ");
		int numberOfTradersInMilan = traders.stream()
		.filter(t ->  "Milan".equals(t.getCity()))
		.collect(Collectors.toList()).size();
		System.out.println(numberOfTradersInMilan);
		
		System.out.println("\n8. Print all transactions’ values from the traders living in Cambridge. ");
		transactions.stream()
		.filter(t -> "Cambridge".equals(t.getTrader().getCity()))
		.collect(Collectors.toList())
		.forEach(System.out::println);
		
		System.out.println("\n9. What’s the highest value of all the transactions? ");
		Transaction transactionHighestValue = transactions.stream()
		.reduce(transactions.get(0), (t1, t2) -> {
			return (t2.getValue() > t1.getValue())? t2 : t1;
		});
		System.out.println(transactionHighestValue);
		
		System.out.println("\n10. Find the transaction with the smallest value. ");
		Transaction transactionSmallestValue = transactions.stream()
		.reduce(transactions.get(0), (t1, t2)->{
			return (t2.getValue() < t1.getValue()) ? t2 : t1;
		});
		System.out.println(transactionSmallestValue);
	}
}
