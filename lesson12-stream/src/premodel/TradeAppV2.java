package premodel;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

import bean.Trade;
import bean.Transaction;

public class TradeAppV2 {

	   public static void main(String[] args) {
	        Trade raoul = new Trade("Raoul", "Cambridge");
	        Trade mario = new Trade("Mario", "Milan");
	        Trade alan = new Trade("Alan", "Cambridge");
	        Trade brian = new Trade("Brian", "Cambridge");

	        List<Transaction> transactions = Arrays.asList(
	                new Transaction(brian, 2011, 300),
	                new Transaction(raoul, 2012, 1000),
	                new Transaction(raoul, 2011, 400),
	                new Transaction(mario, 2012, 710),
	                new Transaction(mario, 2012, 700),
	                new Transaction(alan, 2012, 950)
	        );
	        System.out.println("1. Find all transaction in the year 2011 and sort them by value (small to high).");
	        // 1. Find all transaction in the year 2011 and sort them by value (small to high).
	        transactions.stream().filter(o -> o.getYear() == 2011).sorted((o1, o2) -> o1.getPrice() - o2.getPrice()).forEach(o -> System.out.println("- " + o.toString()));
	        System.out.println("2. Find all transaction have value greater than 300 and sort them by trader's city.");
	        // 2. Find all transaction have value greater than 300 and sort them by trader's city.
	        transactions.stream().filter(o -> o.getPrice() > 300).sorted((o1, o2) -> o1.getTraders().getCity().compareTo(o2.getTraders().getCity())).forEach(o -> System.out.println("- " + o.toString()));
	        System.out.println("3. What are all the unique cities where the trader work ?");
	        // 3. What are all the unique cities where the trader work ?
	        transactions.stream().filter(distinctByKey(p -> p.getTraders().getCity())).forEach(o -> System.out.println("- " + o.getTraders().getCity()));
	        System.out.println("4. Find all traders from Cambridge and sort them by name (desc).");
	        // 4. Find all traders from Cambridge and sort them by name (desc).
	        transactions.stream().filter(p -> p.getTraders().getCity().equals("Cambridge")).sorted((o1, o2) -> o2.getTraders().getName().compareTo(o1.getTraders().getName())).forEach(o -> System.out.println("- " + o.toString()));
	        System.out.println("5. Return a string of all trader's names sorted alphabetically.");
	        // 5. Return a string of all trader's names sorted alphabetically.
	        System.out.println(Arrays.toString(transactions.stream().filter(distinctByKey(p -> p.getTraders().getName())).map(p -> p.getTraders().getName()).sorted((o1, o2) -> o1.compareTo(o2)).toArray(String[]::new)));
	        System.out.println("6. Are any traders based in Milan ?");
	        // 6. Are any traders based in Milan ?
	        System.out.println("- " + (transactions.stream().filter(p -> p.getTraders().getCity().equals("Milan")).count() > 0 ? "YES" : "NO"));
	        System.out.println("7. Count the number of traders in Milan.");
	        // 7. Count the number of traders in Milan.
	        System.out.println("- " + transactions.stream().filter(p -> p.getTraders().getCity().equals("Milan")).count());
	        System.out.println("8. Print all transaction's vales from the traders living in Cambridge.");
	        // 8. Print all transaction's vales from the traders living in Cambridge.
	        transactions.stream().filter(p -> p.getTraders().getCity().equals("Cambridge")).forEach(o -> System.out.println("- " + o.getTraders().getName() + " - " + o.getPrice()));
	        System.out.println("9. What's the highest value of all the transaction ?");
	        // 9. What's the highest value of all the transaction ?
	        System.out.println("- " + transactions.stream().sorted((o1, o2) -> o2.getPrice() - o1.getPrice()).toList().get(0).getPrice());
	        System.out.println("10. Find the transaction with the smallest value.");
	        // 10. Find the transaction with the smallest value.
	        System.out.println("- " + transactions.stream().sorted((o1, o2) -> o1.getPrice() - o2.getPrice()).toList().get(0).getPrice());
	        System.out.println("==============");

	    }

	    public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor) {
	        Set<Object> set = new HashSet<>();
	        return t -> set.add(keyExtractor.apply(t)) == true;
	    }

}
