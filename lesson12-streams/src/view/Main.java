package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import bean.Trader;
import bean.Transaction;




public class Main {
	public static void main(String[] args) {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");
		List<Trader> traders = new ArrayList<>();
		traders.add(brian);
		traders.add(raoul);
		traders.add(alan);
		traders.add(mario);
		
		List<Transaction> transactions = Arrays.asList(
				new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000),
				new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710),
				new Transaction(mario, 2012, 700),
				new Transaction(alan, 2012, 950));
		transactions.sort(Comparator.comparing(Transaction::getValue));
		System.out.println("câu 1");
		filter(transactions, t -> t.getYear() == 2012 ).forEach(t -> System.out.println(t));
		transactions.sort((Transaction t1, Transaction t2) -> t1.getTrader().getCity().compareTo(t2.getTrader().getCity()));
		System.out.println("câu 2");
		filter(transactions, t -> t.getValue() > 300).forEach(t -> System.out.println(t));
		System.out.println("cau 3");
		traders.forEach(t -> System.out.println(t.getCity()));
		System.out.println("câu 4");
		traders.sort((t1, t2) -> t2.getCity().compareTo(t1.getCity()));
		filter(traders, t -> t.getCity().equals("Cambridge")).forEach(t -> System.out.println(t));
		System.out.println("câu 5");
		traders.sort((Comparator.comparing(Trader::getName)));
		traders.forEach(t -> System.out.println(t.getName()));
		System.out.println("câu 7");
		int a =(int) traders.stream().filter(i -> i.getCity().equals("Milan")).count();
		System.out.println(a);
		
		
		System.out.println("cau 8");
		filter(transactions, t -> t.getTrader().getCity().equals("Cambridge")).forEach(i -> System.out.println(i.getValue()));
	    System.out.println("cau 9 & 10");
	    List<Integer> t = transactions.stream().map(o -> o.getValue()).sorted((o1,o2) -> (o1 - o2)).toList();
	    System.out.println("hightest: " + t.get(t.size()-1));
	    System.out.println("smallest: " + t.get(0));
	}
	
	private static <T> List<T> filter(List<T> inventory, Predicate<T> predicate){
		List<T> result = new ArrayList<>();
		for(T t:inventory) {
			if(predicate.test(t)) {
				result.add(t);
			}
		}
		return result;
	}
	
	

}
