package premodel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

import bean.Trade;
import bean.Transaction;
import model.DataModel;

public class TradeApp {

	public static void main(String[] args) {
		List<Transaction> transactions = DataModel.getTransactions();
		
		System.out.println("1. Find all transaction in the year 2011 and sort them by value (small to high).");
        // 1. Find all transaction in the year 2011 and sort them by value (small to high).
		
		List<Transaction> tmp = filter(transactions, o -> 2011==o.getYear());
		tmp = transactions;
		tmp.sort(Comparator.comparing(Transaction::getPrice));
		tmp.forEach(System.out::println);
		System.out.println();
		
        System.out.println("2. Find all transaction have value greater than 300 and sort them by trader's city.");
        // 2. Find all transaction have value greater than 300 and sort them by trader's city.
        tmp = transactions;
        tmp = filter(transactions, o -> o.getPrice() > 300);
		tmp.sort((o1, o2) -> o1.getTraders().getCity().compareTo(o2.getTraders().getCity()));
		tmp.forEach(System.out::println);
		System.out.println();
        
        System.out.println("3. What are all the unique cities where the trader work ?");
        // 3. What are all the unique cities where the trader work ?
        tmp = transactions;
        tmp = filter(transactions, distinctByKey(o -> o.getTraders().getCity()));
        tmp.forEach(o->System.out.println(o.getTraders().getCity()));
		System.out.println();
		
        System.out.println("4. Find all traders from Cambridge and sort them by name (desc).");
        // 4. Find all traders from Cambridge and sort them by name (desc).
        tmp = transactions;
        tmp = filter(transactions, o -> "Cambridge".equals(o.getTraders().getCity()));
        tmp.sort((o1, o2) -> o2.getTraders().getName().compareTo(o1.getTraders().getName()));
		tmp.forEach(System.out::println);
		System.out.println();
        System.out.println("5. Return a string of all trader's names sorted alphabetically.");
        // 5. Return a string of all trader's names sorted alphabetically.
        tmp = transactions;
        tmp = filter(transactions, distinctByKey(o->o.getTraders().getName()));
        List<String> names = map(tmp, o->o.getTraders().getName());
        names.sort((o1,o2)-> o1.compareTo(o2));
        names.forEach(System.out::println);
        
        
        System.out.println("6. Are any traders based in Milan ?");
        // 6. Are any traders based in Milan ?
        tmp = transactions;
        tmp = filter(transactions, o-> "Milan".equals(o.getTraders().getCity()));
        System.out.println(tmp.size() > 0 ? "YES":"NO");
        
        System.out.println("7. Count the number of traders in Milan.");
        // 7. Count the number of traders in Milan.
        tmp = transactions;
        tmp = filter(transactions, o-> "Milan".equals(o.getTraders().getCity()));
        System.out.println(tmp.size());
        
        System.out.println("8. Print all transaction's values from the traders living in Cambridge.");
        // 8. Print all transaction's values from the traders living in Cambridge.
        tmp = transactions;
        tmp = filter(transactions, o-> "Cambridge".equals(o.getTraders().getCity()));
        List<Integer> values = map(tmp, o->o.getPrice());
        values.forEach(System.out::println);
        
        System.out.println("9. What's the highest value of all the transaction ?");
        // 9. What's the highest value of all the transaction ?
        tmp = transactions;
        values = map(tmp, o->o.getPrice());
        values.sort((o1, o2) -> o2 - o1);
        System.out.println(values.get(0));
        
        
        System.out.println("10. Find the transaction with the smallest value.");
        // 10. Find the transaction with the smallest value.
        tmp = transactions;
        
        tmp.sort((o1, o2) -> o1.getPrice() - o2.getPrice());
        System.out.println(tmp.get(0));
        System.out.println("==============");

	}

	public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor) {
        Set<Object> set = new HashSet<>();
        return t -> set.add(keyExtractor.apply(t)) == true;
    }
	
	public static List<Transaction> filter(List<Transaction> list, Predicate<Transaction> pre){
		List<Transaction> rs = new ArrayList<Transaction>();
		for (Transaction transaction : list) {
			if(pre.test(transaction))
				rs.add(transaction);
		}
		return rs;
	}
	
	public static <K> List<K> map(List<Transaction> list, Function<Transaction, K> func){
		List<K> rs = new ArrayList<K>();
		for (Transaction transaction : list) {
			rs.add(func.apply(transaction));
		}
		return rs;
	}
	
	
}
