package live.demo;

import static java.util.Comparator.comparing;

import java.util.List;
import java.util.stream.Collectors;

import predit.DataModel;
import predit.Trader;
import predit.Transaction;

public class Ex01TransactionApp {
	public static void main(String[] args) {
		List<Trader> traders = DataModel.getTraders();
		List<Transaction> transactions = DataModel.getTransactions();
		// Query 1: Find all transactions from year 2011 and sort them by value (small to high).
				System.out.println("Query 01----->");
				List<Transaction> tr2011 = 
						 transactions.stream()
						 .filter(transaction -> transaction.getYear() == 2011)
		                 .sorted(comparing(Transaction::getValue))
		                 .collect(Collectors.toList());

						 System.out.println(tr2011.toString());
				 // Query 2: What are all the unique cities where the traders work?
				System.out.println("Query 02----->");
						 List<String> cities = 
		            transactions.stream()
		                        .map(transaction -> transaction.getTrader().getCity())
		                        .distinct()
		                        .collect(Collectors.toList());
		        System.out.println(cities);
		        // Query 3: Find all traders from Cambridge and sort them by name.
		        System.out.println("Query 03----->");
		        List<Trader> traders1 = 
		            transactions.stream()
		                        .map(Transaction::getTrader)
		                        .filter(trader -> trader.getCity().equals("Cambridge"))
		                        .distinct()
		                        .sorted(comparing(Trader::getName))
		                        .collect(Collectors.toList());
		        System.out.println(traders1.toString());
		        // Query 4: Return a string of all traders’ names sorted alphabetically.
		        System.out.println("Query 04----->");
		        String traderStr = 
		            transactions.stream()
		                        .map(transaction -> transaction.getTrader().getName())
		                        .distinct()
		                        .sorted()
		                        .reduce("", (n1, n2) -> n1 + n2);
		        System.out.println(traderStr);
		        
		        // Query 5: Are there any trader based in Milan?
		        System.out.println("Query 05----->");
		        boolean milanBased =
		            transactions.stream()
		                        .anyMatch(transaction -> transaction.getTrader()
		                                                            .getCity()
		                                                            .equals("Milan")
		                                 );
		        System.out.println(milanBased);
		        // Query 6: Update all transactions so that the traders from Milan are set to Cambridge.
		        System.out.println("Query 06");
		        transactions.stream()
		                    .map(Transaction::getTrader)
		                    .filter(trader -> trader.getCity().equals("Milan"))
		                    .forEach(trader -> trader.setCity("Cambridge"));
		        System.out.println(transactions);
		        
		        
		        // Query 7: What's the highest value in all the transactions?
		        System.out.println("Query 07");
		        int highestValue = 
		            transactions.stream()
		                        .map(Transaction::getValue)
		                        .reduce(0, Integer::max);
		        System.out.println(highestValue);	
	}
}
