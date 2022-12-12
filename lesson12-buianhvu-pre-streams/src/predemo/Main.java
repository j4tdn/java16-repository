package predemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
	public static void main(String[] args) {
		Trader raoul = new Trader("raoul", "cambridge");
		Trader brian = new Trader("brian", "cambridge");
		Trader mario = new Trader("mario", "milan");
		Trader alan = new Trader("alan", "cambridge");

		List<Trader> traders = new ArrayList<>();
		traders.add(raoul);
		traders.add(brian);
		traders.add(mario);
		traders.add(alan);

		List<Transaction> transactions = Arrays.asList(new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000), new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710), new Transaction(mario, 2012, 700), new Transaction(alan, 2012, 950));

		transactions.sort(Comparator.comparing(Transaction::getValue));
		System.out.println("1. Find all transactions in the year 2011 and sort them by value (small to high).\n");
		filter(transactions, t -> t.getYear() == 2011).forEach(t -> System.out.println(t));

		System.out.println("\n2. Find all transactions have value greater than 300 and sort them by trader’s city\n ");
		transactions
				.sort((Transaction t1, Transaction t2) -> t1.getTrader().getCity().compareTo(t2.getTrader().getCity()));
		filter(transactions, t -> t.getValue() >= 300).forEach(t -> System.out.println(t));

		System.out.println("\n3. What are all the unique cities where the traders work ?\n");
		Set<String> uniqueCity = City(transactions, t -> t.getTrader().getCity(), t -> true);
		System.out.println(uniqueCity);

		System.out.println("\n4. Find all traders from Cambridge and sort them by name desc.\n");
		traders.sort((t1, t2) -> t2.getCity().compareTo(t1.getCity()));
		List<Trader> CamTraders = filter(traders, t -> t.getCity().equals("cambridge"));
		System.out.println(CamTraders);

		System.out.println("\n5. Return a string of all traders’ names sorted alphabetically.\n");
		traders.sort((Comparator.comparing(Trader::getName)));
		traders.forEach(t -> System.out.println(t.getName()));

		System.out.println("\n6. Are any traders based in Milan? \n");
		List<Trader> MiTraders = filter(traders, t -> t.getCity().equals("milan"));
		System.out.println(MiTraders);

		System.out.println("\n7. Count the number of traders in Milan.\n");
		System.out.println("Number of Traders: " + MiTraders.size());
		System.out.println();

		System.out.println("\n8. Print all transactions’ values from the traders living in Cambridge.\n");
		filter(transactions, t -> t.getTrader().getCity().equals("cambridge"))
				.forEach(i -> System.out.println(i.getValue()));

	}

	private static <T> List<T> filter(List<T> l, Predicate<T> p) {
		List<T> result = new ArrayList<>();
		for (T t : l) {
			if (p.test(t)) {
				result.add(t);
			}
		}
		return result;
	}

	public static <E> Set<E> City(List<Transaction> transactions, Function<Transaction, E> f, Predicate<E> p) {
		Set<E> result = new HashSet<>();
		for (Transaction transaction : transactions) {
			if (p.test(f.apply(transaction)))
				result.add(f.apply(transaction));
		}
		return result;
	}

}