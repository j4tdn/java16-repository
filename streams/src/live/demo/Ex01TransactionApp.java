package live.demo;

import java.util.List;
import java.util.stream.Collectors;

import model.DataModel;
import predemo.Trader;
import predemo.Transacions;
import predemo.TransactionDemo;

public class Ex01TransactionApp {
	public static void main(String[] args) {
		List<Trader> trade = DataModel.getTraders();
		List<Transacions> transListDefault = DataModel.getTransaction();
		//1
		List<Transacions> transIn2011 = transListDefault.stream()
				.filter(ts -> ts.getYear() == 2011)
				.sorted((o1, o2) -> o1.getValue() - o2.getValue()).collect(Collectors.toList());
		
		TransactionDemo.printList(transIn2011);
		System.out.println("cau 1");
		//2
		List<Transacions> transGreater300 = transListDefault.stream()
				.filter(ts -> ts.getValue() > 300)
				.sorted((s1, s2) -> s1.getTrader().getCity().compareTo(s2.getTrader().getCity()))
				.collect(Collectors.toList());
		
		TransactionDemo.printList(transGreater300);
		System.out.println("cau 2");
		//3
		
		//4
		System.out.println("cau 4");
		List<Trader> tradeInCambridge = trade.stream()
				.filter(ts -> "Cambridge".equals(ts.getCity()))
				.sorted((o1, o2) -> o1.getName().compareTo(o2.getName()))
				.collect(Collectors.toList());
		
		
	}

}
