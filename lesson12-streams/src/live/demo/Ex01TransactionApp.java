package live.demo;

import java.util.Comparator;
import java.util.List;

import bean.Trader;
import bean.Transaction;
import model.DataModel;

public class Ex01TransactionApp {
	public static void main(String[] args) {
		List<Trader> traders = DataModel.getTraders();
		List<Transaction> transactions = DataModel.getTransactions();
//		1. Find all transactions in the year 2011 and sort them by value (small to high).
		transactions.stream().filter(trans -> trans.getYear() == 2011)
				.sorted(Comparator.comparing(Transaction::getValue)).forEach(System.out::println);
//		2. Find all transactions have value greater than 300 and sort them by trader’s city
		System.out.println("==============");
		transactions.stream().filter(trans -> trans.getValue() > 300)
				.sorted(Comparator.comparing(trans -> trans.getTrader().getCity())).forEach(System.out::println);
//		3. What are all the unique cities where the traders work?
		System.out.println("==============");
		traders.stream().map(Trader::getCity).distinct().forEach(System.out::println);
//		4. Find all traders from Cambridge and sort them by name desc.
		System.out.println("==============");
		traders.stream().filter(trader -> "Cambridge".equals(trader.getCity()))
				.sorted(Comparator.comparing(Trader::getName)).forEach(System.out::println);
//		5. Return a string of all traders’ names sorted alphabetically.
		System.out.println("==============");
		traders.stream().map(Trader::getName).distinct().sorted().forEach(System.out::println);
//		6. Are any traders based in Milan?
		System.out.println("==============");
		System.out.println("Any in Milan: " + traders.stream().anyMatch(trader -> "Milan".equals(trader.getCity())));
//		7. Count the number of traders in Milan.
		System.out.println("==============");
		System.out.println("Number of Milan traders: "
				+ traders.stream().filter(trader -> "Milan".equals(trader.getCity())).count());
//		8. Print all transactions’ values from the traders living in Cambridge.
		System.out.println("==============");
		transactions.stream().filter(trans -> "Cambridge".equals(trans.getTrader().getCity()))
				.map(Transaction::getValue).forEach(System.out::println);
//		9. What’s the highest value of all the transactions?
		System.out.println("==============");
		System.out.println("Highest value transaction: "
				+ transactions.stream().map(Transaction::getValue).reduce(Integer.MIN_VALUE, Integer::max));
//		10. Find the transaction with the smallest value.
		System.out.println("==============");
		System.out.println("Transaction with smallest value: "
				+ transactions.stream().sorted(Comparator.comparing(Transaction::getValue)).findFirst().get());
	}
}
