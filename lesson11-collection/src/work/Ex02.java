package work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

import bean.CD;


public class Ex02 {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		List<CD> cd = getCDs();
	    CD cd1 = new CD().withidCD(1).withnameCD("MIEN CAT TRANG").withnumberOfSong(1).withsinger("GDA").withPrice(100);
	    add(cd, cd1);
	    System.out.println("the number of CDs in the list "+ cd.size());
	    System.out.println("price CDs " + sumPrice(cd));
	    cd.sort(Comparator.comparing(CD::getidCD).thenComparing(CD::getPrice, Comparator.reverseOrder()));
	  
	    
		System.out.println(cd);

	}
	private static void add(List<CD> list, CD cd) {
		 if(cd.equals(list) == false) {
		    	System.out.println("data already available");
		    }
		    else {
		    	list.add(cd);
			}
	}
	
	private static double sumPrice(List<CD> cd) {
		double sum =0;
		for (CD cd2 : cd) {
			sum +=cd2.getPrice();
		}
		return sum;
	}
	
	

	public static List<CD> getCDs() {

		List<CD> listCD = new ArrayList<>();
		listCD.add(new CD().withidCD(1).withnameCD("MIEN CAT TRANG").withnumberOfSong(1).withsinger("GDA").withPrice(100));
		listCD.add(new CD().withidCD(2).withnameCD("CON MUA BANG GIA").withnumberOfSong(12).withsinger("DA1").withPrice(101));
		listCD.add(new CD().withidCD(3).withnameCD("TRAI TIM BEN LE").withnumberOfSong(13).withsinger("DA2").withPrice(102));
		listCD.add(new CD().withidCD(2).withnameCD("TONG PHU").withnumberOfSong(21).withsinger("DA3").withPrice(103));
		listCD.add(new CD().withidCD(3).withnameCD("CHUYEN DOI TA").withnumberOfSong(1).withsinger("DA4").withPrice(104));
		listCD.add(new CD().withidCD(1).withnameCD("KKKKK").withnumberOfSong(18).withsinger("DA5").withPrice(105));
		return listCD;

	}
}
