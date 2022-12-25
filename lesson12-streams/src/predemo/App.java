package predemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.function.Predicate;

import model.DataModel2;

public class App {
	public static void main(String[] args) {
		List<Transaction> transactions = DataModel2.getTransactions();
		List<Trader> traders = DataModel2.getTraders();
		
		System.out.println("1. find all transactions 2011 and sort them by value (small to high)");
		List<Transaction> cau1 = find(transactions,  tr -> tr.getYear() == 2011);
		cau1.sort((t1,t2) -> t1.getValue() - t2.getValue());
		println(cau1);
		
		System.out.println("2. find all transactions have value greater than 300 and sort them by trader's city");
		List<Transaction> cau2 = find(transactions, tr -> tr.getValue() > 300);
		cau2.sort((t1,t2) -> t1.getTrader().getCity().compareTo(t2.getTrader().getCity()));
		println(cau2);
		
		System.out.println("3.What are all the unique cities where the traders work?");
		findAllCity(transactions).forEach(System.out::println);
		
		System.out.println("4. Find all traders from Cambridge and sort them by name desc.");
		List<Transaction> cau4 = find(transactions, tr -> "Cambridge".equals(tr.getTrader().getCity()));
		cau4.sort((t1,t2) -> t1.getTrader().getName().compareTo(t2.getTrader().getName()));
		List<String> cau4a = filterName(cau4, tr -> tr.getTrader().getName());		
		println(cau4a);
		
		System.out.println("5. Return a string of all traders’ names sorted alphabetically.");
		List<String> cau5 = filterName(transactions, tr -> tr.getTrader().getName());
		cau5.sort((t1,t2) -> t1.compareTo(t2));
		println(cau5);
		
		System.out.println("6. Are any traders based in Milan?");
		List<Transaction> cau6 = find(transactions, tr -> "Milan".equals(tr.getTrader().getCity()));
		List<String> cau6a = filterName(cau6, tr -> tr.getTrader().getName());		
		println(cau6a);
		
		System.out.println("7. Count the number of traders in Milan");	
		println(cau6a.size());
		
		System.out.println("8. Print all transactions’ values from the traders living in Cambridge.");
		List<Transaction> cau8 = find(transactions, tr -> "Cambridge".equals(tr.getTrader().getCity()));
		cau8.forEach(tr -> System.out.println(tr.getValue()));
		
		System.out.println("9. What’s the highest value of all the transactions?");
		System.out.println(maxTransaction(transactions));
		
		System.out.println("10. Find the transaction with the smallest value.");
		System.out.println(minTransaction(transactions));
	}
	
	private static void println(Object obj) {
		System.out.println(obj);
	}
	
	//1 vs 2 vs 4 vs 6
	private static List<Transaction> find(List<Transaction> elements,Predicate<Transaction> predicate){
		List<Transaction> result = new ArrayList<>();
		for(Transaction tr:elements) {
			if(predicate.test(tr)) {
				result.add(tr);
			}
		}
		return result;
	}
	
	//3
	private static  Set<String> findAllCity(List<Transaction> elements){
		Set<String> result = new HashSet<>();		
		elements.forEach(element -> result.add(element.getTrader().getCity()));		
		return result;
	}
	
	//5
	private static List<String> filterName(List<Transaction> elements,Function<Transaction, String> function){
		Set<String> result = new HashSet<>();	
		for(Transaction tr:elements) {
			String name = function.apply(tr);
			result.add(name);
		}
		List<String> result2 = new ArrayList<>(result);
		return result2;
	}
	
	private static int maxTransaction(List<Transaction> elements) {
		int max = Integer.MIN_VALUE;
		for(Transaction tr : elements) {
			if(tr.getValue()>max) {
				max = tr.getValue();
			}
		}
		return max;
	}
	
	private static int minTransaction(List<Transaction> elements) {
		int min = Integer.MAX_VALUE;
		for(Transaction tr : elements) {
			if(tr.getValue()<min) {
				min = tr.getValue();
			}
		}
		return min;
	}
}
