package predemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import modelA.Model;

public class Demo {
	public static void main(String[] args) {
		List<Transactions> transactions = Model.getTransaction();
		transactions.forEach(transaction -> System.out.println(transaction));

		System.out.println("***1. Find all transactions in the year 2011 and sort them by value (small to hight)***");
		List<Transactions> transactionsIn2011 = filter(transactions, transaction -> transaction.getYear() == 2011);
		transactionsIn2011.sort((t1, t2) -> t1.getValue() - t2.getValue());
		printList(transactionsIn2011);

		System.out.println("***2. Find all transactions have value greater than 300 and sort them by trader’s city***");
		List<Transactions> transactionsGreater300 = filter(transactions, transaction -> transaction.getValue() > 300);
		transactionsGreater300.sort((t1, t2) -> t1.getTrader().getCity().compareTo(t2.getTrader().getCity()));
		printList(transactionsGreater300);

		System.out.println("***3. What are all the unique cities where the traders work?***");
		List<String> transactionsUniCities = getString(transactions, transaction -> transaction.getTrader().getCity());
		printList(transactionsUniCities);

		System.out.println("***4. Find all traders from Cambridge and sort them by name desc.***");
		List<Transactions> transactionsCam = filter(transactions,
				transaction -> "Cambridge".equals(transaction.getTrader().getCity()));
		List<String> reDuplicateName = getString(transactionsCam, transaction -> transaction.getTrader().getName());
		reDuplicateName.sort((t1, t2) -> t1.compareTo(t2));
		printList(reDuplicateName);

		System.out.println("***5. Return a string of all traders’ names sorted alphabetically.***");
		List<String> transactionsAllTraderName = getString(transactions,
				transaction -> transaction.getTrader().getName());
		transactionsAllTraderName.sort((t1, t2) -> t1.compareTo(t2));
		String text = "";
		for (String tr : transactionsAllTraderName) {
			text = text + tr + " ";
		}
		System.out.println("[" + text + "]");

		System.out.println("***6. Are any traders based in Milan?***");
		boolean transactionsMilan = (!filter(transactions,
				transaction -> "Milan".equals(transaction.getTrader().getCity())).isEmpty());
		System.out.println(transactionsMilan);

		System.out.println("***7. Count the number of traders in Milan.***");
		int countMilan = filter(transactions, transaction -> "Milan".equals(transaction.getTrader().getCity())).size();
		System.out.println(countMilan);

		System.out.println("***8. Print all transactions’ values from the traders living in Cambridge.***");
		transactionsCam.forEach(transaction -> System.out.println(transaction.getValue()));

		System.out.println("***9. What’s the highest value of all the transactions?***");
		int maxValue = max(transactions);
		System.out.println(maxValue);

		System.out.println("***10. Find the transaction with the smallest value.***");
		int minValue = min(transactions);
		System.out.println(minValue);

	}

	private static int max(List<Transactions> list) {
		int max = Integer.MIN_VALUE;
		for (Transactions element : list) {
			if (element.getValue() > max) {
				max = element.getValue();
			}
		}
		return max;
	}

	private static int min(List<Transactions> list) {
		int min = Integer.MAX_VALUE;
		for (Transactions element : list) {
			if (element.getValue() < min) {
				min = element.getValue();
			}
		}
		return min;
	}

	private static <E> void printList(List<E> list) {
		for (E element : list) {
			System.out.println(element);
		}
	}

	private static List<Transactions> filter(List<Transactions> transactions, Predicate<Transactions> predicate) {
		List<Transactions> result = new ArrayList<>();
		for (Transactions transaction : transactions) {
			if (predicate.test(transaction)) {
				result.add(transaction);
			}
		}
		return result;
	}

	private static List<String> getString(List<Transactions> transactions, Function<Transactions, String> fu) {
		Set<String> str = new HashSet<String>();
		for (Transactions transaction : transactions) {
			str.add(fu.apply(transaction));
		}
		List<String> list = new ArrayList<>(str);
		return list;
	}
}
