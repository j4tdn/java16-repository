package view;

import java.util.ArrayList;

import java.util.Arrays;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import bean.Trader;
import bean.Transaction;

public class Appdemo {
	public static void main(String... args) {
		List<Trader> traders = new ArrayList<>();
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");

		traders.add(raoul);
		traders.add(mario);
		traders.add(alan);
		traders.add(brian);

		List<Transaction> transactions = Arrays.asList(
				new Transaction(brian, 300, 2011),
				new Transaction(raoul, 1000, 2012), 
				new Transaction(raoul, 400, 2011),
				new Transaction(mario, 710, 2012), 
				new Transaction(mario, 700, 2012), 
				new Transaction(alan, 950, 2012)
				);
		// 1
		Collections.sort(transactions);

		find2011(transactions).forEach(t -> System.out.println(t));
		System.out.println("============================================");

		// 2
		Collections.sort(transactions, new Comparator<Transaction>() {

			@Override
			public int compare(Transaction o1, Transaction o2) {
				if (o1.getTrader().getCity() == o2.getTrader().getCity()) {
					return 0;
				}
				return 1;
			}
		});
		findValueThan300(transactions).forEach(t -> System.out.println(t));
		System.out.println("============================================");

		// 3
		findCity(traders).forEach(t -> System.out.println(t));
		System.out.println("============================================");
		// 4
		Collections.sort(traders, new Comparator<Trader>() {

			@Override
			public int compare(Trader o1, Trader o2) {
				if (o1.getName().compareTo(o2.getName()) < 0) {
					return -1;
				} else {
					if (o1.getName().compareTo(o2.getName()) == 0) {
						return 1;
					}
				}
				return 1;
			}
		});
		findCambridge(traders).forEach(t -> System.out.println(t));
		System.out.println("============================================");
		// 5
		Collections.sort(traders);
		TraderName(traders).forEach(t -> System.out.println(t));
		System.out.println("============================================");
		// 6
		boolean check = false;
		for (Trader e : traders) {
			if ("Milan".equals(e.getCity())) {
				check = true;
				break;
			}
		}
		if (check == true) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		System.out.println("============================================");
		// 7
		System.out.println("number of trader in Milan : " + CountTrader(traders));
		System.out.println("============================================");
		// 8
		traderInCambridge(transactions).forEach(t -> System.out.println(t.getValue()));
		System.out.println("============================================");
		// 9
		System.out.println("the highest value of all the transactions :" + findMaxValue(transactions));
		System.out.println("============================================");
		// 10
		System.out.println("the transaction with the smallest value : " + findMinValue(transactions));

	}

	private static List<Transaction> traderInCambridge(List<Transaction> transactions) {
		List<Transaction> trader = new ArrayList<Transaction>();
		for (Transaction a : transactions) {
			if (a.getTrader().getCity() == "Cambridge") {
				trader.add(a);
			}
		}
		return trader;
	}

	private static int CountTrader(List<Trader> traders) {
		int count = 0;
		for (Trader a : traders) {
			if (a.getCity() == "Milan")
				count++;
		}
		return count;
	}

	private static List<Transaction> find2011(List<Transaction> transactions) {
		List<Transaction> a2011 = new ArrayList<>();
		for (Transaction t : transactions) {
			if (t.getYear() == 2011) {
				a2011.add(t);
			}
		}
		return a2011;
	}

	private static List<Transaction> findValueThan300(List<Transaction> transactions) {
		List<Transaction> a300 = new ArrayList<>();
		for (Transaction t : transactions) {
			if (t.getValue() > 300) {
				a300.add(t);
			}
		}
		return a300;
	}

	private static Set<String> findCity(List<Trader> traders) {
		Set<String> city = new HashSet<>();
		for (Trader trader : traders) {
			city.add(trader.getCity());
		}
		return city;
	}

	private static List<Trader> findCambridge(List<Trader> traders) {
		List<Trader> city = new ArrayList<>();
		for (Trader trader : traders) {
			if (trader.getCity() == "Cambridge") {
				city.add(trader);
			}
		}
		return city;
	}

	private static List<String> TraderName(List<Trader> name) {
		List<String> names = new ArrayList<String>();
		for (Trader trader : name) {
			names.add(trader.getName());
		}
		return names;
	}

	private static Transaction findMinValue(List<Transaction> transactions) {
		int min = Integer.MAX_VALUE;
		Transaction transaction = new Transaction();
		for (Transaction a : transactions) {
			if (a.getValue() < min) {
				min = a.getValue();
				transaction = a;
			}
		}
		return transaction;
	}

	private static int findMaxValue(List<Transaction> transactions) {
		int max = Integer.MIN_VALUE;
		for (Transaction a : transactions) {
			if (a.getValue() > max) {
				max = a.getValue();
			}
		}
		return max;
	}

}