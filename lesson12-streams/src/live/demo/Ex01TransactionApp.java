package live.demo;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import model.Trader;
import model.Transaction;

public class Ex01TransactionApp {
	public static void main(String[] args) {
		List<Trader> traders = DemoLive.getTraders();
		List<Transaction> transactions =DemoLive.getTransactions();
		//1. Find all transactions in the year 2011 and sort them by value (small to high).
        List<Transaction> transactionsInTheYear2011 = transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());
        transactionsInTheYear2011.forEach(System.out::println);
        System.out.println("===========================================");
		//2. Find all transactions have value greater than 300 and sort them by trader’s city
        transactions.stream().filter(o -> o.getValue() > 300)
		.sorted((o1, o2) -> (o1.getTrader().getCity().compareTo(o2.getTrader().getCity())))
		.forEach(o -> System.out.println(o));
        System.out.println("===========================================");
		//3. What are all the unique cities where the traders work?
        List<String> uniquecities = 
                transactions.stream()
                            .map(transaction -> transaction.getTrader().getCity())
                            .distinct()
                            .collect(Collectors.toList());
        uniquecities.forEach(System.out::println);
        System.out.println("===========================================");
		//4. Find all traders from Cambridge and sort them by name desc.
        List<Trader> Cambridge = 
                transactions.stream()
                            .map(Transaction::getTrader)
                            .filter(trader -> trader.getCity().equals("Cambridge"))
                            .distinct()
                            .sorted(Comparator.comparing(Trader::getName))
                            .collect(Collectors.toList());
        Cambridge.forEach(System.out::println);
        System.out.println("===========================================");
		//5. Return a string of all traders’ names sorted alphabetically.
        String sortedAlphabetically = 
                transactions.stream()
                            .map(transaction -> transaction.getTrader().getName())
                            .distinct()
                            .sorted()
                            .reduce("", (n1, n2) -> n1 + n2);
            System.out.println(sortedAlphabetically);
            System.out.println("===========================================");
		//6. Are any traders based in Milan?
       boolean tradersBasedInMilan =
		            transactions.stream()
		                        .anyMatch(transaction -> transaction.getTrader()
		                                                            .getCity()
		                                                            .equals("Milan")
		                                 );
		        System.out.println(tradersBasedInMilan);
         
		//7. Count the number of traders in Milan.
		long milan = traders.stream().filter(trader -> trader.getCity()=="Milan")
				.count();
            System.out.println(milan);  
            System.out.println("===========================================");
		//8. Print all transactions’ values from the traders living in Cambridge.
         List<Integer> value =transactions.stream().filter(c->c.getTrader().getCity()=="Cambridge")
        		 .map(transaction->transaction.getYear()).collect(Collectors.toList());
         value.forEach(v->System.out.println(v));
         System.out.println("===========================================");

		//9. What’s the highest value of all the transactions?
         int highestValue = 
                    transactions.stream()
                                .map(Transaction::getValue)
                                .reduce(0, Integer::max);
                System.out.println(highestValue);   
                System.out.println("===========================================");
		//10. Find the transaction with the smallest value.
         transactions.stream()
        		                          .sorted(Comparator.comparing(Transaction::getValue))
        		                          .limit(1)
        		                          .forEach(t->System.out.println(t));
         System.out.println("10. The transaction with the smallest value: ");

       
	}

}
