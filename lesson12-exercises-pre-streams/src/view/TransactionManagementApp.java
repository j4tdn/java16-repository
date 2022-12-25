package view;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import bean.Trader;
import bean.Transaction;
import model.TransactionModel;

public class TransactionManagementApp {
	public static void main(String[] args) {
		List<Transaction> transactions = TransactionModel.getTransaction();
//		1. Find all transactions in the year 2011 and sort them by value (small to high).
		List<Transaction> result1 = transactions.stream().filter(trans -> trans.getYear() == 2011)
				.sorted(Comparator.comparing(Transaction::getValue)).collect(Collectors.toList());
		result1.forEach(System.out::println);
		System.out.println("====");
//		2. Find all transactions have value greater than 300 and sort them by trader’s city 
		List<Transaction> result2 = transactions.stream().filter(trans -> trans.getValue() > 300)
				.sorted(Comparator.comparing(trans -> trans.getTrader().getCity())).collect(Collectors.toList());
		result2.forEach(System.out::println);
		System.out.println("====");
//		3. What are all the unique cities where the traders work?
		String result3_1 = transactions.stream().map(trans -> trans.getTrader().getCity()).distinct()
				.collect(Collectors.joining(", "));
		System.out.println(result3_1);

		Set<String> result3_2 = transactions.stream().map(trans -> trans.getTrader().getCity())
				.collect(Collectors.toSet());
		result3_2.forEach(System.out::print);
		System.out.println("====");
//		4. Find all traders from Cambridge and sort them by name desc.
		List<Trader> result4 = transactions.stream().map(Transaction::getTrader)
				.sorted(Comparator.comparing(Trader::getName)).collect(Collectors.toList());
		result4.forEach(System.out::println);
		System.out.println("====");
//		5. Return a string of all traders’ names sorted alphabetically.
		String result5 = transactions.stream().map(Transaction::getTrader).map(Trader::getName).distinct().sorted()
				.collect(Collectors.joining(", "));
		System.out.println(result5);
		System.out.println("====");
//		6. Are any traders based in Milan?
		System.out.println("Any traders based in Milan? " + transactions.stream().map(Transaction::getTrader)
				.anyMatch(trader -> "Milan".equals(trader.getCity())));
		System.out.println("====");
//		7. Count the number of traders in Milan.
		System.out.println("Number of trader in Milan: "
				+ transactions.stream().filter(trans -> "Milan".equals(trans.getTrader().getCity())).count());
		System.out.println("====");
//		8. Print all transactions’ values from the traders living in Cambridge.
		List<Integer> result8 = transactions.stream().filter(trans -> "Cambridge".equals(trans.getTrader().getCity()))
				.map(Transaction::getValue).collect(Collectors.toList());
		result8.forEach(System.out::println);
		System.out.println("====");
//		9. What’s the highest value of all the transactions?
		// get() unwrap Optional<Integer>
		// May result an exception
		Integer result9_1 = transactions.stream().map(Transaction::getValue).sorted(Comparator.reverseOrder())
				.findFirst().get();
		// orElse will return if max can't be calculted
		// Safer => not result an exception
		Integer result9_2 = transactions.stream().map(Transaction::getValue).max(Comparator.comparing(Integer::valueOf))
				.orElse(null);
		// We can convert to IntStream but can't set null in orElse
		Integer result9_3 = transactions.stream().map(Transaction::getValue).mapToInt(Integer::valueOf).max()
				.orElse(Integer.MIN_VALUE);

		System.out.println(result9_1);
		System.out.println(result9_2);
		System.out.println(result9_3);
		System.out.println("====");
//		10. Find the transaction with the smallest value.
		Transaction result10_1 = transactions.stream().sorted(Comparator.comparing(Transaction::getValue)).findFirst()
				.get();
		// orElse is better, same result with get() but return a default value when
		// cannot find min
		Transaction result10_2 = transactions.stream().min(Comparator.comparing(Transaction::getValue)).orElse(null);
		Transaction result10_3 = transactions.stream().min(Comparator.comparing(Transaction::getValue)).get();
		// ifPresent: executes the given block if a value is present
		transactions.stream().min(Comparator.comparing(Transaction::getValue)).ifPresent(System.out::println);

		System.out.println(result10_1);
		System.out.println(result10_2);
		System.out.println(result10_3);
	}
}
