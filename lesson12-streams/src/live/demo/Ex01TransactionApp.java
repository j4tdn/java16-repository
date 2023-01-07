package live.demo;

import java.util.List;

import bean.Trader;
import bean.Transaction;
import model.DataModel;

public class Ex01TransactionApp {
	public static void main(String[] args) {
		List<Trader> traders = DataModel.getTraders();
		List<Transaction> transactions = DataModel.getTransactions();
		
		System.out.println("Cau 1: ");
		transactions.stream()
		.filter(t -> t.getYear() == 2011)
		.sorted((t1, t2) -> t1.getValue() - t2.getValue())
		.forEach(System.out::println);
		
		System.out.println("Cau 2: ");
		transactions.stream()
		.filter(t -> t.getValue() > 300)
		.sorted((t1, t2) -> t1.getTrader().getCity().compareTo(t2.getTrader().getCity()))
		.forEach(System.out::println);
		
		System.out.println("Cau 3: ");
		traders.stream()
		.map(t -> t.getCity())
		.distinct()
		.forEach(System.out::println);
		
		System.out.println("Cau 4: ");
		traders.stream()
		.filter(t -> "Cambridge".equals(t.getCity()))
		.sorted((t1, t2) -> t2.getName().compareTo(t1.getName()))
		.forEach(System.out::println);
		
		System.out.println("Cau 5: ");
		traders.stream()
		.map(t -> t.getName())
		.distinct()
		.sorted()
		.forEach(System.out::println);
	}
}
