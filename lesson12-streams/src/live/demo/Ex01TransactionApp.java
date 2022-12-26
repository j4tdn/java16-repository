package live.demo;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import bean.Trader;
import bean.Transaction;
import model.DataModel;

public class Ex01TransactionApp {
	public static void main(String[] args) {

		List<Trader> traders = DataModel.getTraders();

		List<Transaction> transactions = DataModel.getTransactions();
		/*
		 * 1. Find all transactions in the year 2011 and sort them by value (small to
		 * high). 
		 * 2. Find all transactions have value greater than 300 and sort them by
		 * trader’s city 
		 * 3. What are all the unique cities where the traders work? 
		 * 4.Find all traders from Cambridge and sort them by name desc. 
		 * 5. Return a string of all traders’ names sorted alphabetically. 
		 * 6. Are any traders basedin Milan? 
		 * 7. Count the number of traders in Milan. 
		 * 8. Print all transactions’
		 * values from the traders living in Cambridge. 
		 * 9. What’s the highest value of
		 * all the transactions? 
		 * 10. Find the transaction with the smallest value
		 */
        //1
		transactions.stream().filter(t -> t.getYear() == 2011).sorted().forEach(System.out::println);
		
		//2
		transactions.stream().filter(t -> t.getValue() > 300).sorted(( t1, t2) -> t1.getTrader().getCity()).forEach(System.out::println);
		
		//3
		traders.stream().map(Trader::getCity)
		.distinct().forEach(System.out::println);
		
		//4
		List<Integer> Ex04 = traders.stream().map(t -> t.getCity() == "Cambridge").sorted().collect(Collectors.toList());
		System.out.println(Ex04);
		
		//5
		 
		

	}

}
