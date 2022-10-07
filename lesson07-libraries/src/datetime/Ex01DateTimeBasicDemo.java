package datetime;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

import javax.print.CancelablePrintJob;
import javax.print.attribute.standard.Fidelity;

public class Ex01DateTimeBasicDemo {
	public static void main(String[] args) {
//	Láº¥y thÃ´ng tin thá»�i gian vá»›i timezone
//	+ 1. NgÃ y, ThÃ¡ng, NÄƒm hiá»‡n táº¡i
		
		Date now = new Date();
		System.out.println("date now: "  + now);
		
	   // ICT: Indochina time - giá»� Ã¢m dÆ°Æ¡ng = UTC+7 ==>TimeZone
		
		//@Deprecated = OutDate ==> Should not use
		// Epoch = Unix Time = January 1, 1970, 00:00:00 GMT
		
		Date notNow = new Date(72000000);
		
		//7200 lÃ  milliseconds since epoch time
		
		System.out.println("not Now : " + notNow);
		
		// Date ==> sá»­ dá»¥ng chá»§ yáº¿u Ä‘á»ƒ lÆ°u trá»¯
		// phÆ°Æ¡ng thá»©c xá»­ lÃ­ --> Deprecated
		
		//singleton design pattern
		// idea: má»™t class chá»‰ cho phÃ©p táº¡o ra duy nháº¥t má»™t Ä‘á»‘i tÆ°á»£ng
		
		Calendar cNow = Calendar.getInstance();
		
		System.out.println("c --> " + cNow);
		int dayOfMonth = cNow.get(Calendar.DAY_OF_MONTH);// c: fields[Calendar.DAY_OF_MONTH]
		
		int month = cNow.get(Calendar.MONTH) + 1;
		
		int year = cNow.get(Calendar.YEAR);
		
		String currentDate = "" + dayOfMonth + "/" + month + "/" + year;
		System.out.println("Current date: " + currentDate);
		
		Calendar cNotNow = Calendar.getInstance();
		// 17/8/1999 --> dayOfWeek = ?, dayOfYear = ?
		cNotNow.set(1999, Calendar.AUGUST, 17);
		// Set specify fields
		
		//cNotNow.setTimeInMillis(cNotNow.getTimeInMillis());
		// Náº¿u khÃ´ng setTime (--> computeFields()) --> toString sáº½ in ra thÃ´ng tin lá»—i
		
		System.out.println("cNotNOw: " + cNotNow);
		
		
		int dayOfWeek = cNotNow.get(Calendar.DAY_OF_WEEK);
		int dayOfYear = cNotNow.get(Calendar.DAY_OF_YEAR);
		System.out.println("Day Of Week: " + dayOfWeek);
		System.out.println("Day Of Year: " + dayOfYear);
		System.out.println("=========================================================");
		
		
			
//============================================================================		
//		+ 2. Giá»� 12-24, PhÃºt, GiÃ¢y
		String hms = "" + cNotNow.get(Calendar.HOUR_OF_DAY) + ":" 
                        + cNotNow.get(Calendar.MINUTE) +":"
                        + cNotNow.get(Calendar.SECOND);
		System.out.println("HMS: " + hms);
		System.out.println("=========================================================");
			
//=============================================================================		
//		+ 3. Thá»© ngÃ y, tuáº§n trong thÃ¡ng, nÄƒm
//        3.1 --> In ra thá»© ngÃ y hiá»‡n táº¡i
//		  3.2 --> In ra tuáº§n thá»© máº¥y trong thÃ¡ng/nÄƒm hiá»‡n táº¡i
		
		int dow = cNow.get(Calendar.DAY_OF_WEEK);
		
		// TODO: Enumeration
		String[] weekdays = {"Chá»§ nháº­t", "Thá»© hai", " Thá»© ba", " Thá»© nÄƒm", "Thá»© sÃ¡u","Thá»© báº£y"};
		System.out.println("dow: " + weekdays[dow-1]);
		System.out.println("weekOfMonth: " + cNotNow.get(Calendar.WEEK_OF_MONTH));
		System.out.println("weekOfYear: " + cNotNow.get(Calendar.WEEK_OF_YEAR));
	
		System.out.println("=========================================================");

//============================================================================
//	    + 4. Ä�áº¿m sá»‘ ngÃ y thÃ¡ng, nÄƒm hiá»‡n táº¡i >> Calendar
		int cMonth = cNow.get(Calendar.MONTH) + 1;
		
		//getActualMaximum(field) --> láº¥y giÃ¡ trá»‹ láº¥n nháº¥t cá»§a field thÃ´ng qua dá»¯ liá»‡u trong c
		int daysInMonth = cNow.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("Month " + cMonth + " has " + daysInMonth + " days");
		System.out.println("=========================================================");
//============================================================================
//		+ 5. Kiá»ƒm tra nÄƒm hiá»‡n táº¡i cÃ³ pháº£i nÄƒm nhuáº­n khÃ´ng
		
		//TrÃ¡i Ä‘áº¥t: 365 ngÃ y 6 giá»� --> TÃ¢y
		//2023: DÆ°Æ¡ng lá»‹ch -> ko pháº£i nÄƒm nhuáº­n
		//      Ã‚m lá»‹ch -> nÄƒm nhuáº­n
		
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println("isLeapYear: " + gc.isLeapYear(2020));
		System.out.println("=========================================================");
		
//============================================================================
//		+ 6. NgÃ y Ä‘áº§u tiÃªn trong tuáº§n lÃ  thá»© máº¥y vá»›i locale ( phá»¥ thuá»™c )
		Calendar c1 = Calendar.getInstance(new Locale("vi", "VN"));
		System.out.println("US FDOW: " + c1.getFirstDayOfWeek());
		System.out.println("=========================================================");
		
		
//============================================================================
//	    + 7. NgÃ y Ä‘áº§u tiÃªn trong tuáº§n hiá»‡n táº¡i lÃ  ngÃ y máº¥y
	   
		System.out.println("Default locale: " + Locale.getDefault());
		Locale.setDefault(Locale.FRANCE);
		Calendar today = Calendar.getInstance();
		today.set(2022, Calendar.OCTOBER, 19);
		
		
		//CÃ¡ch 1
		int tfdow = today.getFirstDayOfWeek();
		int tdow = today.get(Calendar.DAY_OF_WEEK);
		today.add(Calendar.DAY_OF_MONTH, tfdow - tdow);
		System.out.println("today: " + today);
		
//	    + 8. In ra danh sÃ¡ch cÃ¡c ngÃ y trong tuáº§n hiá»‡n táº¡i   
		System.out.println("=========== Curent week days ============");
		//Ex02
	//=>>> Epoch time : liÃªn káº¿t giá»¯a date vÃ  calendar
		
		
		//1
		
	}
}
