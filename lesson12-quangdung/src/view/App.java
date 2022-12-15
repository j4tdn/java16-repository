package view;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

import bean.Trader;
import bean.Transaction;
import model.DataModel;

public class App {
	public static void main(String[] args) {
		List<Trader> traders = DataModel.getTraders();
		List<Transaction> transactions = DataModel.getTransactions();

		transactions.forEach(transaction -> System.out.println(transaction));

		System.out.println("**1. Find all transactions in the year 2011 and sort them by value (small to hight)**");
		List<Transaction> transactionsIn2011 = filter(transactions, transaction -> transaction.getYear() == 2011);
		transactionsIn2011.sort((t1, t2) -> t1.getValue() - t2.getValue());
		printList(transactionsIn2011);

		System.out.println("**2. Find all transactions have value greater than 300 and sort them by trader’s city**");
		List<Transaction> transactionsGreater300 = filter(transactions, transaction -> transaction.getValue() > 300);
		transactionsGreater300.sort((t1, t2) -> t1.getTrader().getCity().compareTo(t2.getTrader().getCity()));
		printList(transactionsGreater300);

		System.out.println("**3. What are all the unique cities where the traders work?**");
		List<String> transactionsUniCities = getString(transactions, transaction -> transaction.getTrader().getCity());
		printList(transactionsUniCities);

		System.out.println("**4. Find all traders from Cambridge and sort them by name desc.**");
		List<Transaction> transactionsCam = filter(transactions,
				transaction -> "Cambridge".equals(transaction.getTrader().getCity()));
		List<String> reDuplicateName = getString(transactionsCam, transaction -> transaction.getTrader().getName());
		reDuplicateName.sort((t1, t2) -> t1.compareTo(t2));
		printList(reDuplicateName);

		System.out.println("**5. Return a string of all traders’ names sorted alphabetically.**");
		List<String> transactionsAllTraderName = getString(transactions,
				transaction -> transaction.getTrader().getName());
		transactionsAllTraderName.sort((t1, t2) -> t1.compareTo(t2));
		printList(transactionsAllTraderName);

	}

	private static <E> void printList(List<E> list) {
		for (E element : list) {
			System.out.println(element);
		}
	}

	private static List<Transaction> filter(List<Transaction> transactions, Predicate<Transaction> predicate) {
		List<Transaction> result = new ArrayList<>();
		for (Transaction transaction : transactions) {
			if (predicate.test(transaction)) {
				result.add(transaction);
			}
		}
		return result; 
	}

	private static List<String> getString(List<Transaction> transactions, Function<Transaction, String> bf) {
		Set<String> str = new HashSet<String>();
		for (Transaction transaction : transactions) {
			str.add(bf.apply(transaction));
		}
		List<String> list = new ArrayList<>(str);
		return list;
	}

}
