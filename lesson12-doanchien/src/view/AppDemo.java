package view;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

import bean.Trader;
import bean.Transaction;

public class AppDemo {
	public static void main(String[] args) {
		List<Trader> traders = DataModel.getTraders();
		
		List<Transaction> transactions = DataModel.getTransactions();
		
		System.out.println(">>===========<<");
		
		Predicate<Transaction> pt = new Predicate<Transaction>() {
			@Override
			public boolean test(Transaction transaction) {
				return "2011".equals(transaction.getYear());
			}
		};
		// 1. Find all transactions in the year 2011 and sort them by value (small to high).
		findTransactionIn2011(transactions, transaction -> "2011".equals(transaction.getYear()))
			.forEach(transaction -> System.out.println(transaction));
			
		System.out.println(">>============<<");
		
		// 2. Find all transactions have value greater than 300 and sort them by trader’s city 
		findTransactionHaveValueGreaterThan300(transactions, 300)
			.forEach(transaction -> System.out.println(transaction));
		
		System.out.println(">>============<<");
		
		// 3. What are all the unique cities where the traders work? 
		findCities(traders);
		
		System.out.println(">>============<<");
		
		// 4. Find all traders from Cambridge and sort them by name desc. 
		
		findTrader(traders, trader -> "Cambridge".equals(trader.getCity()))
			.forEach(trader -> System.out.println(trader));
		
		// 5. Return a string of all traders’ names sorted alphabetically. 
		
		findTraderName(traders).forEach(transaction -> System.out.println(transaction + " "));
		
		System.out.println(">>============<<");
		
		// 6. Are any traders based in Milan? 
		checkCities(traders);
		
		System.out.println(">>============<<");
		
		// 7. Count the number of traders in Milan. 
		
		countTraderInMilan(traders);
		
		System.out.println(">>============<<");
		
		// 8. Print all transactions’ values from the traders living in Cambridge. 
		
		findTransactionFromTraderInCambridge(transactions);
		System.out.println(">>============<<");
		
		// 9. What’s the highest value of all the transactions? 
		
		findHighestValueTransaction(transactions);
		System.out.println(">>============<<");
		
		// 10. Find the transaction with the smallest value. 

		findSmallestValueTransaction(transactions);
		
		
		System.out.println(">>============<<");
		
		
		
		
		

	}
	
	public static List<Transaction> findTransactionIn2011(List<Transaction> transactions , Predicate<Transaction> predicate){
		List<Transaction> results = new ArrayList<>();
		for (Transaction transaction : transactions) {
			if (transaction.test(transaction)) {
				results.add(transaction);
			}
		}
		return results;
	}
	
	public static List<Transaction> findTransactionHaveValueGreaterThan300(List<Transaction> transactions , int value) {
		List<Transaction> results = new ArrayList<>();
		for (Transaction transaction : transactions) {
			if (transaction.getValue() > value) {
				results.add(transaction);
			}
		}
		return results;
	}
	
	public static Set<String> findCities(List<Trader> traders){
		Set<String> result = new HashSet<>();
		for(Trader trader : traders) {
			result.add(trader.getCity());
		}
		return result;
	}
	
	public static List<Trader> findTrader(List<Trader> traders , Predicate<Trader> predicate) {
		List<Trader> results = new ArrayList<>();
		for (Trader trader : traders) {
			if (trader.test(trader)) {
				results.add(trader);
			}
		}
		return results;
	}
	
	public static List<String> findTraderName(List<Trader> traders ) {
		List<String> results = new ArrayList<>();
		for (Trader trader : traders) {
			results.add(trader.getCity());
		}
		return results;
	}
	
	public static boolean checkCities(List<Trader> traders) {
		for (Trader trader : traders) {
			if (trader.getCity() == "Milan") {
				return true;
			}
		}
		return false;
	}
	
	public static int countTraderInMilan(List<Trader> traders) {
		int count = 0;
		for (Trader trader : traders) {
			if (trader.getCity() == "Milan") {
				count++;
			}
		}
		return count;
	}
	
	public static List<Transaction> findTransactionFromTraderInCambridge(List<Transaction> transactions) {
		List<Transaction> results = new ArrayList<>();
		for (Transaction transaction : transactions) {
			if (transaction.getTrader().getCity() == "Cambridge") {
				results.add(transaction);
			}
		}
		return results;
	}
	
	public static int findHighestValueTransaction(List<Transaction> transactions) {
		int max = Integer.MIN_VALUE;
		for (Transaction transaction: transactions) {
			if (transaction.getValue() > max) {
				max = transaction.getValue();
			}
		}
		return max;
	}
	
	public static Transaction findSmallestValueTransaction(List<Transaction> transactions) {
		int min = Integer.MAX_VALUE;
		Transaction result = new Transaction();
		for (Transaction transaction: transactions) {
			if (transaction.getValue() < min) {
				min = transaction.getValue();
				result = transaction;
			}
		}
		return result;
	}
}
