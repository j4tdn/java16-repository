package live.demo;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

import model.DataModel;
import predemo.Trader;
import predemo.Transaction;

public class Ex01TransactionApp {
	public static void main(String[] args) {
		List<Transaction> transactions = DataModel.getTransactions();
		List<Trader> traders = DataModel.getTraders();
		
		//1. Find all transactions in the year 2011 and sort them by value (small to high).
		transactions.stream().filter( transaction -> transaction.getYear() == 2010);
		//2. Find all transactions have value greater than 300 and sort them by trader’s city
		transactions.stream().filter(transaction -> transaction.getValue() > 300);
		//3. What are all the unique cities where the traders work?
		
		//4. Find all traders from Cambridge and sort them by name desc.
		transactions.stream().filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"));
		//5. Return a string of all traders’ names sorted alphabetically.
		
		//6. Are any traders based in Milan?
		transactions.stream().anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));
		//7. Count the number of traders in Milan.
		transactions.stream().filter(transaction -> transaction.getTrader().getCity().equals("Milan")).count();
		//8. Print all transactions’ values from the traders living in Cambridge.
		
		//9. What’s the highest value of all the transactions?
		
		//10. Find the transaction with the smallest value.
	}
	
	
}
