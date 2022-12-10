package view;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

import bean.Trader;
import bean.Transaction;
import model.DataModel;

public class TraderExecutingTransactions {
	public static void main(String[] args) {
		List<Transaction> transactions = DataModel.getTransactions();
		List<Trader> traders = DataModel.getTraders();
		System.out.println("Default DataModel");
		transactions.forEach(System.out::println);
		System.out.println();
		traders.forEach(System.out::println);
		System.out.println();
		
		System.out.println("1. Find all transactions in the year 2011 and sort them by value (small to high)");
		List<Transaction> transIn2011 = filter(transactions, t -> t.getYear() == 2011);
		transIn2011.sort((c1, c2) -> c1.getValue() - c2.getValue());
		transIn2011.forEach(System.out::println);
		System.out.println();
		
		System.out.println("2. Find all transactions have value greater than 300 and sort them by trader’s city");
		List<Transaction> transValGreThan300 = filter(transactions, t -> t.getValue()> 300);
		transValGreThan300.sort((c1, c2) -> c1.getTrader().getCity().compareTo(c2.getTrader().getCity()));
		transValGreThan300.forEach(System.out::println);
		System.out.println();
		
		System.out.println("3. What are all the unique cities where the traders work?");
		Set<String> allCitis = getEFromTranWithPre(transactions, t -> t.getTrader().getCity(), t -> true);
		allCitis.forEach(System.out::println);
		System.out.println();

		System.out.println("4. Find all traders from Cambridge and sort them by name desc");
		List<Trader> tradersFromCambridge = filter(traders,trader -> "Cambridge".equals(trader.getCity()));
		tradersFromCambridge.sort((c1, c2) -> c2.getName().compareTo(c1.getName()));
		tradersFromCambridge.forEach(System.out::println);
		System.out.println();

		System.out.println("5. Return a string of all traders’ names sorted alphabetically.");
		Set<String> allNamesBeforeSorting = getEFromTranWithPre(transactions, t -> t.getTrader().getName(),t -> true);
		List<String> allNames = new ArrayList<>();
		allNames.addAll(allNamesBeforeSorting);
		allNames.sort((c1, c2) -> c1.compareTo(c2));
		allNames.forEach(TraderExecutingTransactions::convertToString);
		System.out.println();
		System.out.println();

		System.out.println("6. Are any traders based in Milan?");
		List<Trader> tradersFromMilan = filter(traders, trader -> "Milan".equals(trader.getCity()));
		if (tradersFromMilan.size() > 0) {
			System.out.println("yes, they're: ");
			tradersFromMilan.forEach(System.out::println);
		} else {
			System.out.println("there's no one at all");
		}
		System.out.println();
		
		System.out.println("7. Count the number of traders in Milan.");
		System.out.println("number of traders in Milan: " + tradersFromMilan.size());
		System.out.println();
		
		System.out.println("8. Print all transactions’ values from the traders living in Cambridge.");
		List<Transaction> transInCam = filter(transactions,transaction -> "Cambridge".equals(transaction.getTrader().getCity()));
		transInCam.forEach(TraderExecutingTransactions::printValFroTrans);
		System.out.println();
		
		System.out.println("9. What’s the highest value of all the transactions?");
		int maxOfVal = getMinMaxValOfE(transactions, (c1, c2) -> c1.getValue() > c2.getValue());
		System.out.println("highest value: " + maxOfVal);
		System.out.println();
		
		System.out.println("10. Find the transaction with the smallest value.");
		int minOfVal = getMinMaxValOfE(transactions, (c1, c2) -> c1.getValue() < c2.getValue());
		System.out.println("smallest value: " + minOfVal);

	}
	
	public static <E> List<E> filter(List<E> input, Predicate<E> pre) {
		List<E> result = new ArrayList<>();
		for (E e: input) {
			if (pre.test(e)) {
				result.add(e);
			}
		}
		return result;
	}
	
	public static <E> Set<E> getEFromTranWithPre(List<Transaction> transactions, Function<Transaction, E> func, Predicate<E> pre) {
		Set<E> result = new HashSet<>();
		for (Transaction transaction: transactions) {
			if (pre.test(func.apply(transaction)))
			result.add(func.apply(transaction));
		}
		return result;
	}
	
	public static int getMinMaxValOfE(List<Transaction> transactions, BiPredicate<Transaction, Transaction> biPre) {
		Transaction result = transactions.get(0);
		 for (Transaction transaction: transactions) {
			 if (biPre.test(transaction, result)) {
				result = transaction;
			 }
		 }
		return result.getValue();
	}
	
	public static void convertToString(String string) {
		System.out.print(string);
	}
	
	public static void printValFroTrans(Transaction transaction) {
		System.out.println("Transaction of " + transaction.getTrader().getName() + " in " + transaction.getTrader().getCity() + " with value = " + transaction.getValue());
	}
}




