package predemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import model.DataModel;

public class TransactionDemo {
	public static void main(String[] args) {
		System.out.println("------Default list transaction-----");
		List<Transacions> transListDefault = DataModel.getTransaction();
		printList(transListDefault);

		System.out.println("--1--Find all transactions in 2011 sort value (small to high).------");
		List<Transacions> transIn2011 = filter(transListDefault, ts -> ts.getYear() == 2011);
		transIn2011.sort((o1, o2) -> o1.getValue() - o2.getValue());
		printList(transIn2011);

		System.out.println("--2--Find transactions have value greater than 300 and sort them by trader’s city----");
		List<Transacions> transGreater300 = filter(transListDefault, ts -> ts.getValue() > 300);
		transGreater300.sort((s1, s2) -> s1.getTrader().getCity().compareTo(s2.getTrader().getCity()));
		printList(transGreater300);

		System.out.println("--3--all city of trader----");
		List<String> lcity = getListStringFrom(transListDefault, ts -> ts.getTrader().getCity());
		printList(lcity);

		System.out.println("--4--Find all traders from Cambridge and sort them by name desc.------");
		List<Transacions> transInCambridge = filter(transListDefault,
				ts -> "Cambridge".equals(ts.getTrader().getCity()));
		List<String> lname = getListStringFrom(transInCambridge, ts -> ts.getTrader().getName());
		lname.sort((s1, s2) -> s1.compareTo(s2));
		printList(lname);

		System.out.println("--5-- Return a string of all traders’ names sorted alphabetically.------");
		List<String> namelist = getListStringFrom(transListDefault, ts -> ts.getTrader().getName());
		namelist.sort((s1, s2) -> s1.compareTo(s2));
		String allname = "";
		for (String string : namelist) {
			allname = allname + string + ",";
		}
		System.out.println(allname);

		System.out.println("--6-- Are any traders based in Milan?------");
		boolean check = false;
		for (Transacions e : transListDefault) {
			if ("Milan".equals(e.getTrader().getCity())) {
				check = true;
				break;
			}
		}
		System.out.println(check);

		System.out.println("--7-- Count the number of traders in Milan.------");
		List<Transacions> transInMilan = filter(transListDefault, ts -> "Milan".equals(ts.getTrader().getCity()));
		System.out.println(getListStringFrom(transInMilan, ts -> ts.getTrader().getName()).size());

		System.out.println("--8-- Print all transactions’ values from the traders living in Cambridge.------");
		for (Transacions transacions : transInCambridge) {
			System.out.println(transacions.getValue());
		}

		System.out.println("--9-- What’s the highest value of all the transactions?------");
		System.out.println(getTransactionMax(transListDefault).getValue());

		System.out.println("--10-- Find the transaction with the smallest value.------");
		System.out.println(getTransactionMin(transListDefault));

	}

	public static <E> void printList(List<E> list) {
		for (E element : list) {
			System.out.println(element);
		}
	}

	private static <E> List<E> filter(List<E> trans, Predicate<E> predicate) {
		List<E> rs = new ArrayList<>();
		for (E t : trans) {
			if (predicate.test(t)) {
				rs.add(t);
			}
		}
		return rs;
	}

	private static List<String> getListStringFrom(List<Transacions> ltrans, Function<Transacions, String> f) {
		Set<String> setString = new HashSet<String>();
		for (Transacions t : ltrans) {
			setString.add(f.apply(t));
		}
		List<String> listResult = new ArrayList<String>(setString);
		return listResult;
	}

	private static Transacions getTransactionMin(List<Transacions> ltrans) {
		Transacions rs = new Transacions();
		rs.setValue(Integer.MAX_VALUE);
		for (Transacions transacions : ltrans) {
			if (transacions.getValue() < rs.getValue()) {
				rs = transacions;
			}
		}
		return rs;
	}

	private static Transacions getTransactionMax(List<Transacions> ltrans) {
		Transacions rs = new Transacions();
		rs.setValue(0);
		for (Transacions transacions : ltrans) {
			if (transacions.getValue() > rs.getValue()) {
				rs = transacions;
			}
		}
		return rs;
	}

}
