package view;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

import bean.Trader;
import bean.Transaction;
import model.DataModelTransaction;

public class Application {
	public static void main(String[] args) {
		List<Trader> traders = DataModelTransaction.getTrades();
		List<Transaction> transactions = DataModelTransaction.getTransaction();
		transactions.forEach(transaction -> System.out.println(transaction));
		System.out.println("============================================");

		System.out.println("1. Find all transactions in the year 2011 and sort them by value ");
		List<Transaction> tran1 = filter(transactions, t -> t.getYear() == 2011);
		tran1.sort(Comparator.comparing(Transaction::getValue));
		tran1.forEach(transaction -> System.out.println(transaction));


		System.out.println("\n2. Find all transactions have value greater than 300 and sort them by trader’s city");
		List<Transaction> tran2 = filter(transactions, t -> t.getValue() > 300);
		tran2.sort((o1, o2) -> o1.getTrader().getCity().compareTo(o2.getTrader().getCity()));
		tran2.forEach(transaction -> System.out.println(transaction));
		

		System.out.println("\n3. What are all the unique cities where the traders work?");
		map(transactions, t -> t.getTrader().getCity()).forEach(transaction -> System.out.println(transaction));
		
		System.out.println("\n4. Find all traders from Cambridge and sort them by name desc");
		List<Transaction> trader4 = filter(transactions, t -> t.getTrader().getCity().equals("Cambridge"));
		trader4.sort((o1, o2) -> o2.getTrader().getName().compareTo(o1.getTrader().getName()));
		trader4.forEach(transaction -> System.out.println(transaction));
		
		System.out.println("\n5. Return a string of all traders’ names sorted alphabetically");
		print(sortName(transactions));
		
		System.out.println("\n6. Are any traders based in Milan?");
		Predicate<Trader> traderInMilan = (t -> t.getCity().equals("Milan"));
		List<Trader> tran6 = filter(traders, traderInMilan);
		if(tran6.size() > 0 )
			System.out.println("Yes");
		else
			System.out.println("No");

		System.out.print("\n7. Count the number of traders in Milan: ");
		System.out.println(tran6.size());
		
		System.out.println("\n8. Print all transactions’ values from the traders living in Cambridge");
		List<Transaction> tran8 = filter(transactions, t-> t.getTrader().getCity().equals("Cambridge"));
		map(tran8, t -> t.getValue()).forEach(t -> System.out.println(t));

		System.out.println("\n9. What’s the highest value of all the transactions? ");
		transactions.sort(Comparator.comparing(Transaction::getValue));
		System.out.println(transactions.get(transactions.size() - 1));
		
		
		System.out.println("\n10. Find the transaction with the smallest value. ");
		System.out.println(transactions.get(0));
	}

	
	private static <T> List<T> filter(List<T> elements, Predicate<T> predicate) {
		List<T> result = new ArrayList<>();
		for (T element : elements) {
			if (predicate.test(element)) {
				result.add(element);
			}
		}
		return result;
	}
	
	
	private static <T, R> Set<R> map(List<T> elements,Function<T, R> function){
		Set<R> result = new HashSet<>();
		for(T t: elements) {
			result.add(function.apply(t));
		}
		return result;
	}
	
	private static String sortName(List<Transaction> transactions) {
		List<String> names = new ArrayList<>();
		transactions.forEach(t -> names.add(t.getTrader().getName()));
		names.sort(null);
		
		Set<String> namesSet = new LinkedHashSet<String>(names);
		StringBuilder result = new StringBuilder();
		namesSet.forEach(t -> result.append(" ").append(t));
		return result.toString();
	}
	

	private static void print(Object obj) {
		System.out.println(obj);
	}
	
	
}