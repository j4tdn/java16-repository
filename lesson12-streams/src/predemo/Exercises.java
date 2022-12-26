package predemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import designpatterns.strategy.Apple;
import model.DataModel;

public class Exercises {
//	public static void main(String[] args) {
		/*
		 * 	List<Trader> traders = DataModel.getTraders();
		List<Transaction> transactions = DataModel.getTransactions();

		// 1. Find all transactions in the year 2011 and sort them by value.
		Collections.sort(transactions);
		;
		getTransactionsIn2011(transactions).forEach(t -> System.out.println(t));
		System.out.println("===========");

		// Find all transactions have value greater than 300 and sort them by trader’s city
		Collections.sort(transactions, new Comparator<Transaction>() {
			public int compare(Transaction t1, Transaction t2) {
				if (t1.getTrader().getCity() == t2.getTrader().getCity()) {
					return 0;
				}
				return 1;		
			};
		});
		;
		getValueGreaterThan300(transactions).forEach(t -> System.out.println(t));
		System.out.println("===========");

		// What are all the unique cities where the traders work?
		getCity(traders).forEach(t -> System.out.print(t + " "));
		;
		System.out.println("\n===========");

		// Find all traders from Cambridge and sort them by name desc
		Collections.sort(traders, new Comparator<Trader>() {
			public int compare(Trader t1, Trader t2) {
				if (t1.getName().compareTo(t2.getName()) > 0)
					return 1;
				else if (t1.getName().compareTo(t2.getName()) == 0)
					return 0;
				else
					return -1;
			};
		});
		getTrader(traders).forEach(t -> System.out.println(t));
		;
		System.out.println("===========");

		// Return a string of all traders’ names sorted alphabetically.
		Collections.sort(traders);
		getTraderName(traders).forEach(t -> System.out.print(t + " "));
		System.out.println("\n===========");
		
		// Are any traders based in Milan?

		System.out.println("Are any traders based in Milan? --> " + checkTraderCity(traders));
		System.out.println("===========");
		
		// Count the number of traders in Milan
		System.out.println("Number of traders in Milan: " + countTrader(traders));
		System.out.println("===========");
		
		// Print all transactions’ values from the traders living in Cambridge
		getTraderTransaction(transactions).forEach(t -> System.out.println(t));
		System.out.println("===========");

		// What’s the highest value of all the transactions?
		System.out.println("The highest value is: " + getMaxValue(transactions));
		System.out.println("===========");
		
		// Find the transaction with the smallest value
		System.out.println("The transaction with the smallest value is: " + getSmallestValue(transactions));
		
		}
	
	private static Transaction getSmallestValue(List<Transaction> transactions) {
		int min = Integer.MAX_VALUE;
		Transaction t = new Transaction();
		for (Transaction transaction: transactions) {
			if (transaction.getValue() < min) {
				min = transaction.getValue();
				t = transaction;
			}
		}
		return t;
	}
	
	private static int getMaxValue(List<Transaction> transactions) {
		int max = Integer.MIN_VALUE;
		for (Transaction t: transactions) {
			if (t.getValue() > max) {
				max = t.getValue();
			}
		}
		return max;
	}
	
	private static List<Transaction> getTraderTransaction(List<Transaction> transactions) {
		List<Transaction> results = new ArrayList<>();
		for (Transaction t : transactions) {
			if (t.getTrader().getCity() == "Cambridge") {
				results.add(t);
			}
		}
		return results;
	}

	private static int countTrader(List<Trader> traders) {
		int count = 0;
		for (Trader trader : traders) {
			if (trader.getCity() == "Milan") {
				count++;
			}
		}
		return count;
	}

	private static boolean checkTraderCity(List<Trader> traders) {
		for (Trader trader : traders) {
			if (trader.getCity() == "Milan") {
				return true;
			}
		}
		return false;
	}

	private static List<String> getTraderName(List<Trader> traders) {
		List<String> results = new ArrayList<>();
		for (Trader trader : traders) {
			results.add(trader.getName());
		}
		return results;
	}

	private static List<Trader> getTrader(List<Trader> traders) {
		List<Trader> results = new ArrayList<>();
		for (Trader trader : traders) {
			if (trader.getCity() == "Cambridge") {
				results.add(trader);
			}
		}
		return results;
	}

	private static Set<String> getCity(List<Trader> traders) {
		Set<String> results = new HashSet<>();
		for (Trader trader : traders) {
			results.add(trader.getCity());
		}
		return results;
	}

	private static List<Transaction> getValueGreaterThan300(List<Transaction> transactions) {
		List<Transaction> results = new ArrayList<>();
		for (Transaction t : transactions) {
			if (t.getValue() > 300) {
				results.add(t);
			}
		}
		return results;
	}

	private static List<Transaction> getTransactionsIn2011(List<Transaction> transactions) {
		List<Transaction> results = new ArrayList<>();
		for (Transaction t : transactions) {
			if (t.getYear() == 2011) {
				results.add(t);
			}
		}
		return results;
	}

		 */
	
	
}
