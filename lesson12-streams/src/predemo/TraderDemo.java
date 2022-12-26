package predemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

import model.DataModel;


public class TraderDemo {
	private static List<Trader> traders = DataModel.getTrader();
	private static List<Transaction> transactions = DataModel.getTransaction();
	
	public static void main(String[] args) {
		
		question1();
		question2();
		question3();
		question4();
		question5();
		question6();
		question7();
		question8();
		question9();
		question10();
	}
	
	private static void question1() {
		List<Transaction> in2011 = filter(transactions, transaction -> transaction.getYear() == 2011);
		in2011.sort(Comparator.comparing(Transaction::getValue));
		
		println("1. Find all transactions in the year 2011 and sort them by value (small to high).");
		println(in2011);
	}
	
	private static void question2() {
		List<Transaction> withValueThan300 = filter(transactions, transaction -> transaction.getValue() > 300);
		Comparator<Transaction> byCity = (t1, t2) -> t1.getTrader().getCity().compareTo(t2.getTrader().getCity());
		withValueThan300.sort(byCity);
		
		println("2. Find all transactions have value greater than 300 and sort them by trader’s city");
		println(withValueThan300);
	}
	
	private static void question3() {
		println("3. What are all the unique cities where the traders work?");
		println(workedCitys(transactions));
	}

	private static void question4() {
		List<Trader> inCambridge = filter(traders, trader -> trader.getCity().equals("Cambridge"));
		inCambridge.sort(Comparator.comparing(Trader::getName));
		
		println("4. Find all traders from Cambridge and sort them by name desc.");
		println(inCambridge);
	}

	private static void question5() {
		println("5. Return a string of all traders’ names sorted alphabetically.");
		println(getAllNames(traders));
	}

	private static void question6() {
		println("6. Are any traders based in Milan?");
		boolean result = !traderIn("Milan", traders).isEmpty();
		
		println(result == Boolean.TRUE ? "Yes" : "No");
	}

	private static void question7() {
		println("7. Count the number of traders in Milan.");
		println(traderIn("Milan", traders).size());
	}
	
	private static void question8() {
		List<Transaction> traderInCambridge = filter(transactions, t -> "Cambridge".equals(t.getTrader().getCity()));
		
		println("8. Print all transactions’ values from the traders living in Cambridge.");
		traderInCambridge.forEach(transaction -> System.out.println(transaction.getValue()));
	}
	
	private static void question9() {
		println("9. What’s the highest value of all the transactions?");
		println(maxValue(transactions));
	}
	
	private static void question10() {
		println("10. Find the transaction with the smallest value.");
		println(minValue(transactions));
	}
	
	private static List<Trader> traderIn(String city, List<Trader> traders) {
		return filter(traders, trader -> city.equals(trader.getCity()));
	}
	
	private static void println(Object obj) {
		System.out.println(obj + "\n");
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
	
	private static Set<String> workedCitys(List<Transaction> transactions) {
		Set<String> result = new HashSet<>();
		
		transactions.forEach(transaction -> result.add(transaction.getTrader().getCity()));
		
		return result;
	}
	
	private static String getAllNames(List<Trader> traders) {
		List<String> namesList = new ArrayList<>();
		StringBuilder result = new StringBuilder();
		
		traders.forEach(trader -> namesList.add(trader.getName()));
		Collections.sort(namesList); 
		
		Set<String> namesSet = new LinkedHashSet<String>(namesList);
		
		namesSet.forEach(name -> result.append(" ").append(name));
		
		return result.toString();
	}
	
	private static int maxValue(List<Transaction> transactions) {
		int max = Integer.MIN_VALUE;
		
		for (Transaction transaction : transactions) {
			int value = transaction.getValue();
			if (max < value) {
				max = value;
			}
		}
		
		return max;
	}
	
	private static int minValue(List<Transaction> transactions) {
		int min = Integer.MAX_VALUE;
		
		for (Transaction transaction : transactions) {
			int value = transaction.getValue();
			if (min > value) {
				min = value;
			}
		}
		
		return min;
	}
	
}
