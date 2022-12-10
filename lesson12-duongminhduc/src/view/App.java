package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

import bean.Trader;
import bean.Transaction;

public class App {

	public static void main(String[] args) {

		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");

		List<Trader> traders = new ArrayList<>();
		traders.add(raoul);
		traders.add(mario);
		traders.add(alan);
		traders.add(brian);

		List<Transaction> transactions = Arrays.asList(new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000), new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710), new Transaction(mario, 2012, 700), new Transaction(alan, 2012, 950)

		);

		System.out.println("=========All transactions in the year 2011 and sort them by value small to high=========");
		System.out.println();
		transactions.stream().filter(o -> o.getYear() == 2011).sorted((o1, o2) -> o1.getValue() - o2.getValue())
				.forEach(System.out::println);

		System.out.println();
		System.out.println(
				"=========All transactions have value greater than 300 and sort them by trader's city=========");
		System.out.println();
		transactions.stream().filter(o -> o.getValue() > 300)
				.sorted((o1, o2) -> o1.getTrader().getCity().compareTo(o2.getTrader().getCity()))
				.forEach(System.out::println);

		System.out.println();
		System.out.println("=========All the unique cities where the traders work=========");
		getCityUnique(transactions).forEach(System.out::println);

		System.out.println();
		System.out.println("==========All traders from Cambridge and sort them by name desc========");
		traders.stream().filter(o -> "Cambridge".equals(o.getCity()))
				.sorted((o1, o2) -> o2.getName().compareTo(o1.getName())).forEach(System.out::println);

		System.out.println();
		System.out.println("==========Return a string of all traders’ names sorted alphabetically.========");
		getName(traders).stream().sorted().forEach(System.out::print);

		System.out.println();
		System.out.println("==========Are any traders based in Milan?========");
		if (traders.stream().filter(o -> "Milan".equals(o.getCity())).count() > 0) {
			System.out.println("yes, they're: ");
			traders.stream().filter(o -> "Milan".equals(o.getCity())).forEach(System.out::println);
		} else {
			System.out.println("there's no one at all");
		}

		System.out.println();
		System.out.println("==========Count the number of traders in Milan========");
		System.out.println(traders.stream().filter(o -> "Milan".equals(o.getCity())).count());

		System.out.println();
		System.out.println("==========Print all transactions’ values from the traders living in Cambridge.========");
		transactions.stream().filter(o -> "Cambridge".equals(o.getTrader().getCity())).forEach(App::printValue);

		System.out.println();
		System.out.println("========== What’s the highest value of all the transactions?========");
		System.out.println(transactions.stream().max((o1,o2) -> o1.getValue() - o2.getValue()).get());
	}

	public static Set<String> getCityUnique(List<Transaction> transactions) {
		Set<String> result = new HashSet<>();
		for (Transaction transaction : transactions) {
			result.add(transaction.getTrader().getCity());
		}
		return result;
	}

	public static Set<String> getName(List<Trader> traders) {
		Set<String> result = new HashSet<>();
		for (Trader trader : traders) {
			result.add(trader.getName());
		}
		return result;
	}

	public static void printValue(Transaction transaction) {
		System.out.println("Transaction of " + transaction.getTrader().getName() + " in "
				+ transaction.getTrader().getCity() + " with value = " + transaction.getValue());
	}
	
}
