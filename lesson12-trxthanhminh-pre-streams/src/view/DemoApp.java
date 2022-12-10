package view;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import bean.Trader;
import bean.Transaction;

public class DemoApp {
	public static void main(String[] args) {
		List<Trader> traders = Data.getTraders();
		List<Transaction> transactions = Data.getTransactions();
		
		// 1. Find all transactions in the year 2011 and sort them by value.
		transactions.sort((t1, t2) -> t1.getValue() - t2.getValue());
		getYearTransactions(transactions).forEach(t -> System.out.println(t));
		System.out.println("===========");
		
		// 2. Find all transactions have value greater than 300 and sort them by trader’s city
		transactions.sort((t1, t2) -> t1.getTrader().getCity().compareTo(t2.getTrader().getCity()));
		getValueThan300(transactions).forEach(t -> System.out.println(t));
		System.out.println("===========");
		
		// 3.What are all the unique cities where the traders work?
		getCity(traders).forEach(t -> System.out.println(t));
		System.out.println("===========");
		
		// 4. Find all traders from Cambridge and sort them by name desc.
		traders.sort((t1, t2) -> t2.getName().compareTo(t1.getName()));
		getTradersFromCambridge(traders).forEach(t -> System.out.println(t));
		System.out.println("===========");
		
		// 5. Return a string of all traders’ names sorted alphabetically.
		getNameTraders(traders).forEach(t -> System.out.println(t));
		traders.sort((t1, t2) -> t1.getName().compareTo(t2.getName()));
		System.out.println("===========");
		
		// 6. Are any traders based in Milan?
		getTradersFromMilan(traders).forEach(t -> System.out.println(t));
		System.out.println("===========");
		
		// 7. Count the number of traders in Milan.
		System.out.println("The number of traders in Milan: " + getCountTradersFromMilan(traders));
		System.out.println("===========");
		
		// 8. Print all transactions’ values from the traders living in Cambridge.
		getValueOfTradersFromCambridge(transactions).forEach(t -> System.out.println(t));
		System.out.println("===========");
		
		// 9. What’s the highest value of all the transactions?
		System.out.println("The highest value of all the transactions: " + getMaxValue(transactions));
		System.out.println("===========");
		
		// 10. Find the transaction with the smallest value.
		getMinValueOfTransactions(transactions).forEach(t -> System.out.println(t));
		
		
	}
	
	private static List<Transaction> getYearTransactions(List<Transaction> transactions) {
		List<Transaction> result = new ArrayList<>();
		for (Transaction transaction: transactions) {
			if (transaction.getYear() == 2011) {
				result.add(transaction);
			}
		}
		return result;
	}
	
	private static List<Transaction> getValueThan300(List<Transaction> transactions){
		List<Transaction> result = new ArrayList<>();
		for (Transaction transaction: transactions) {
			if (transaction.getValue() > 300) {
				result.add(transaction);
			}
		}
		return result;
	}
	
	private static Set<String> getCity(List<Trader> traders){
		Set<String> result = new HashSet<>();
		for (Trader trader: traders) {
			result.add(trader.getCity());
		}
		return result;
	}
	
	private static List<Trader> getTradersFromCambridge(List<Trader> traders){
		List<Trader> result = new ArrayList<>();
		for (Trader trader: traders) {
			if (trader.getCity() == "Cambridge") {
				result.add(trader);
			}
		}
		return result;
	}
	
	private static Set<String> getNameTraders(List<Trader> traders){
		Set<String> result = new HashSet<>();
		for (Trader trader: traders) {
			result.add(trader.getName());
		}
		return result;
	}
	
	private static List<Trader> getTradersFromMilan(List<Trader> traders){
		List<Trader> result = new ArrayList<>();
		for (Trader trader: traders) {
			if (trader.getCity() == "Milan") {
				result.add(trader);
			}
		}
		return result;
	}
	
	private static int getCountTradersFromMilan(List<Trader> traders){
		int count = 0;
		for (Trader trader: traders) {
			if (trader.getCity() == "Milan") {
				count++;
			}
		}
		return count;
	}
	
	private static List<Transaction> getValueOfTradersFromCambridge(List<Transaction> transactions){
		List<Transaction> result = new ArrayList<>();
		for (Transaction transaction: transactions) {
			if (transaction.getTrader().getCity() == "Cambridge") {
				result.add(transaction);
			}
		}
		return result;
	}
	
	private static int getMaxValue(List<Transaction> transactions) {
		int max = Integer.MIN_VALUE;
		for (Transaction transaction: transactions) {
			if (transaction.getValue() > max) {
				max = transaction.getValue();
			}
		}
		return max;
	}
	
	private static List<Transaction> getMinValueOfTransactions(List<Transaction> transactions){
		int min = Integer.MAX_VALUE;
		List<Transaction> result = new ArrayList<>();
		for (Transaction transaction: transactions) {
			if (transaction.getValue() < min) {
				min = transaction.getValue();
				result.add(transaction);
			}
		}
		return result;
	}
	
}
