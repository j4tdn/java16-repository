package predemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

import bean.Trade;
import bean.Transaction;

public class TradeApp {

	public static void main(String[] args) {
		List<Trade> trade = getTrades();
		List<String> trade1 = new ArrayList<>();
		List<Integer> trade2 = new ArrayList<>();
		List<Transaction> transactions = getTransaction();
		// ex1 : Find all transactions in the year 2011 and sort them by value (small to
		// high).
		System.out.println(" ========== ex01 ===========");
		transactions.stream().filter(o -> o.getYear() == 2011).sorted((o1, o2) -> o1.getPrice() - o2.getPrice())
				.forEach(o -> System.out.println(o));

		System.out.println(" ========== ex02 ===========");
		// ex02 : Find all transactions have value greater than 300 and sort them by
		// trader’s city
		transactions.stream().filter(o -> o.getPrice() > 300)
				.sorted((o1, o2) -> (o1.getTraders().getCity().compareTo(o2.getTraders().getCity())))
				.forEach(o -> System.out.println(o));

		System.out.println(" ========== ex03 ===========");
		// ex03 : listTrade.add(new Trade("Mario", "Milan"));
		//trade.stream().map( o -> distinctByKey(o.getCity())).forEach(o -> System.out.println(o));
		trade.stream().filter(distinctByKey( o -> o.getCity())).forEach(o -> System.out.println(o));

		System.out.println(" ========== ex04 ===========");
//		// ex04 : Find all traders from Cambridge and sort them by name desc.

		trade.stream().filter(o -> o.getCity().equals("Cambridge"))
				.sorted((o1, o2) -> o2.getName().compareTo(o1.getName())).forEach(o -> System.out.println(o));

//		// ex05 : Return a string of all traders’ names sorted alphabetically.

		System.out.println(" ========== ex06 ===========");
		trade.stream()
		.filter(distinctByKey(o -> o.getName()))
		.sorted((o1,o2) -> o1.getName().compareTo(o2.getName()))
		.forEach(o -> System.out.println(o));
		System.out.println(" ========== ex06 ===========");
//		
//
//		// ex06 Are any traders based in Milan?
//
		trade.stream().filter(o -> o.getCity().equals("Milan")).forEach(o -> System.out.println(o));
//		// ex07 Count the number of traders in Milan.
		System.out.println(" ========== ex07 ===========");
		Integer a  = (int) trade.stream().filter(o -> o.getCity().equals("Milan")).count();
		System.out.println("count of milan : " +a);
		
        System.out.println(" ========== ex08 ===========");
//		// ex08
//
		transactions.stream().filter(o -> o.getTraders().getCity().equals("Cambridge"))
				.forEach(o -> System.out.println(o));
//
		// ex09
		System.out.println(" ========== ex09 ===========");
		trade2 = transactions.stream().map(o -> o.getPrice()).sorted((o1,o2) -> (o1 - o2)).toList();
		System.out.println("the highest value of all the transactions: " + trade2.get(trade2.size() -1));
		
		System.out.println(" ========== ex010 ===========");
		System.out.println("transaction with the smallest value: " + trade2.get(0));

	}

	public static List<Trade> getTrades() {

		List<Trade> listTrade = new ArrayList<>();

		listTrade.add(new Trade("Raoul", "Cambridge"));
		listTrade.add(new Trade("Mario", "Milan"));
		listTrade.add(new Trade("Alan", "Cambridge"));
		listTrade.add(new Trade("Brian", "Cambridge"));
		listTrade.add(new Trade("Raoul", "Cambridge"));
		listTrade.add(new Trade("Mario2", "Milan"));
		listTrade.add(new Trade("DA", "VietNam"));

		return listTrade;

	}

	public static List<Transaction> getTransaction() {

		List<Transaction> listTransaction = new ArrayList<>();
		listTransaction.add(new Transaction(new Trade("BDASDASDASD", "Cambridge"), 2011, 1000232));
		listTransaction.add(new Transaction(new Trade("Raoul", "Cambridge"), 2011, 1000));
		listTransaction.add(new Transaction(new Trade("Raou2", "VietNam"), 2011, 8000));
		listTransaction.add(new Transaction(new Trade("Raou3", "Macau"), 700, 145000));
		listTransaction.add(new Transaction(new Trade("Raou5", "Thai"), 2011, 5351000));
		listTransaction.add(new Transaction(new Trade("Raou6", "Milan"), 900, 11000));

		return listTransaction;

	}
	public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor) {
        Set<Object> set = new HashSet<>();
        return t -> set.add(keyExtractor.apply(t)) == true;
    }

}
