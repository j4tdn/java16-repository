package live.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import model.DataModel;

public class Ex01TransactionApp {

	public static void main(String[] args) {
		List<Trader> traders = DataModel.getTraders();
		List<Transaction> transaction = DataModel.getTransactions();

		/*
		 * 1. Find all transactions in the year 2011 and sort them by value (small to high). 
		 * 2. Find all transactions have value greater than 300 and sort them by trader’s city 
		 * 3. What are all the unique cities where the traders work? 
		 * 4. Find all traders from Cambridge and sort them by name desc. 
		 * 5. Return a string of all traders’ names sorted alphabetically. 
		 * 6. Are any traders based in Milan? 
		 * 7. Count the number of traders in Milan. 
		 * 8. Print all transactions’ values from the traders living in Cambridge. 
		 * 9. What’s the highest value of all the transactions? 
		 * 10. Find the transaction with the smallest value.
		 */
//1
		transaction.stream()
		.filter(i -> i.getYear() == 2011)
				.sorted(Comparator.comparing(Transaction::getValue))
				.forEach(System.out::println);
//2.
		
		transaction.stream()
		.filter(i -> i.getValue() >= 300)
				.sorted(Comparator.comparing(i -> i.getTrader().getCity()))
				.forEach(System.out::println);
//3.
		
		traders.stream()
		.map(Trader::getCity)
		.distinct()
		.forEach(System.out::println);
//5.
		
		traders.stream()
		.map(Trader::getName)
		.distinct().sorted()
		.forEach(System.out::println);
		
//6.
        boolean TraderInMilan =transaction.stream()
                               .anyMatch(transaction -> transaction.getTrader()
                                                                   .getCity()
                                                                   .equals("Milan")
                                        );
               System.out.println(TraderInMilan);
               System.out.println("===========================================");

	}
}