package view;

import java.util.List;

import bean.Trader;
import bean.Transaction;
import model.DataModel;

public class Demo {
	public static void main(String[] args) {
		List<Trader> traders = DataModel.getTraders();
		List<Transaction> transactions = DataModel.getTransactions();

		System.out.println(" ========== ex01 ===========");
		transactions.stream().filter(o -> o.getYear() == 2011).sorted((o1, o2) -> o1.getValue() - o2.getValue())
				.forEach(o -> System.out.println(o));

		System.out.println(" ========== ex02 ===========");
		transactions.stream().filter(o -> o.getValue() > 300)
				.sorted((o1, o2) -> (o1.getTrader().getCity().compareTo(o2.getTrader().getCity())))
				.forEach(o -> System.out.println(o));

		System.out.println(" ========== ex04 ===========");
		traders.stream().filter(o -> o.getName().equals("Cambridge"))
				.sorted((o1, o2) -> o2.getName().compareTo(o1.getName())).forEach(o -> System.out.println(o));

		System.out.println(" ========== ex06 ===========");
		traders.stream().filter(o -> o.getCity().equals("Milan")).forEach(o -> System.out.println(o));

		System.out.println(" ========== ex08 ===========");
		transactions.stream().filter(o -> o.getTrader().getCity().equals("Cambridge")).map(o -> o.getValue())
				.forEach(o -> System.out.println(o));

	}
}
