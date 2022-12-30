package live.demo;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import model.DataModel;
import predemo.Trader;
import predemo.Transacions;
import predemo.TransactionDemo;

public class Ex01TransactionApp {
    public static void main(String[] args) {
        List<Trader> trade = DataModel.getTraders();
        List<Transacions> transListDefault = DataModel.getTransaction();
        TransactionDemo.printList_set(transListDefault);

        //1
        System.out.println("--1--Find all transactions in 2011 sort value (small to high).------");
        List<Transacions> transIn2011 = transListDefault.stream()
                .filter(ts -> ts.getYear() == 2011)
                .sorted((o1, o2) -> o1.getValue() - o2.getValue()).collect(Collectors.toList());
        TransactionDemo.printList_set(transIn2011);
        //2
        System.out.println("--2--Find transactions have value greater than 300 and sort them by trader’s city----");
        List<Transacions> transGreater300 = transListDefault.stream()
                .filter(ts -> ts.getValue() > 300)
                .sorted((s1, s2) -> s1.getTrader().getCity().compareTo(s2.getTrader().getCity()))
                .collect(Collectors.toList());
        TransactionDemo.printList_set(transGreater300);
        //3
        System.out.println("--3--all city of trader----");
        Set<String> setCity = trade.stream().map(Trader::getCity).collect(Collectors.toSet());
        TransactionDemo.printList_set(setCity);
        //4
		System.out.println("--4--Find all traders from Cambridge and sort them by name desc.------");
        List<Trader> tradeInCambridge = trade.stream()
                .filter(ts -> "Cambridge".equals(ts.getCity()))
                .sorted((o1, o2) -> o1.getName().compareTo(o2.getName()))
                .collect(Collectors.toList());
		TransactionDemo.printList_set(tradeInCambridge);
        //5
        System.out.println("--5-- Return a string of all traders’ names sorted alphabetically.------");
        String allTraderName = trade.stream().map(Trader::getName).collect(Collectors.joining(","));
        System.out.println(allTraderName);
        //6
        System.out.println("--6-- Are any traders based in Milan?------");
        boolean check = trade.stream().anyMatch(trader -> "Milan".equals(trader.getCity()));
        System.out.println(check);
        //7
        System.out.println("--7-- Count the number of traders in Milan.------");
        long count = trade.stream()
                .filter(trader -> "Milan".equals(trader.getCity())).count();
        System.out.println(count);
        //8
        System.out.println("--8-- Print all transactions’ values from the traders living in Cambridge.------");
        List<Integer> TransValue = transListDefault.stream()
                .filter(transacions -> "Cambridge".equals(transacions.getTrader().getCity()))
                .map(Transacions::getValue).collect(Collectors.toList());
        TransactionDemo.printList_set(TransValue);
        //9
        System.out.println("--9-- What’s the highest value of all the transactions?------");
        Integer maxValue = transListDefault.stream()
                .max((o1, o2) -> o1.getValue() -o2.getValue())
                .map(Transacions::getValue).get();
        System.out.println(maxValue);
        //10
        System.out.println("--10-- Find the transaction with the smallest value.------");
        Transacions smallesTrans = transListDefault.stream().min((o1, o2) -> o1.getValue() - o2.getValue()).get();
        System.out.println(smallesTrans);



    }

}
