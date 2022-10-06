package datetime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;

public class Ex01DatetimeBasicDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> numbers = new HashMap<Integer, String>();
		numbers.put(8, "Chu nhat");
		numbers.put(2, "thu hai ");
		numbers.put(3, "thu ba  ");
		numbers.put(4, "thu tu  ");
		numbers.put(5, "thu nam ");
		numbers.put(6, "thu sau ");
		numbers.put(7, "thu bay ");

		// Ex01: Lấy thông tin thời gian với timezone
		// + 1. Ngày, Tháng, Năm
		// ICT :Indochina time
		Date date = new Date();
		System.out.println("date " + date);
		// + 2. Giờ 12-24, Phút, Giây
		SimpleDateFormat timeformat = new SimpleDateFormat("hh:mm:ss");
		SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyy");
		System.out.println(dateformat.format(date) + " " + timeformat.format(date));

		Date datewithMilliseconds = new Date(99999999 * 99);
		System.out.println("dateWithmilisec " + datewithMilliseconds);
		System.out.println("=================");

		Calendar cNow = Calendar.getInstance();
		System.out.println("c --> " + cNow);
		int dayOfMoth = cNow.get(Calendar.DAY_OF_MONTH); // c: fields[Calendar.DAY_OF_MONTH]
		int month = cNow.get(Calendar.MONTH) + 1;
		int year = cNow.get(Calendar.YEAR);
		System.out.println(dayOfMoth + "/" + month + "/" + year);
		System.out.println("==================================================");
		Calendar cNotNow = Calendar.getInstance();
		System.out.println(cNotNow);
		// set specify fields
		cNotNow.set(1999, Calendar.AUGUST, 17);
		System.out.println(cNotNow.get(Calendar.DAY_OF_WEEK) + " " + cNotNow.get(Calendar.DAY_OF_YEAR));
		System.out.println("cNotNow" + cNotNow);
		System.out.println("================================");
		int k = cNotNow.get(Calendar.DAY_OF_WEEK);
		System.out.println(k);

		// + 2. Giờ 12-24, Phút

		String hms = "" + cNotNow.get(Calendar.HOUR_OF_DAY) + " : " + cNotNow.get(Calendar.MINUTE) + " : "
				+ cNotNow.get(Calendar.SECOND);
		System.out.println(hms);
		System.out.println("===================================================");
		// 3. Thứ ngày, tuần/ngày trong tháng
		// 3.1 --> in ra thu hien tai -->text
		// 3.2 --> in ra tuan thu may trong thang nam
		int dayofWeek = cNow.get(Calendar.DAY_OF_WEEK);
		System.out.println("dayofwork : " + numbers.get(dayofWeek));

		// 4. Đếm số ngày tháng, năm hiện tại
		int Cmonth = cNotNow.get(Calendar.MONTH);
		// lay gia tri lon nhat cua field thong qua du lieu c
		int dayintMonth = cNow.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("Month " + Cmonth + " has " + dayintMonth);

		// kiem tra nam nhuan
		cNow.set(Calendar.MONTH, Calendar.FEBRUARY);
		cNow.set(Calendar.YEAR, 2024);
		int Cmonth2 = cNotNow.get(Calendar.MONTH);
		// lay gia tri lon nhat cua field thong qua du lieu c
		int dayintMonth2 = cNow.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("Month " + Cmonth2 + " has " + dayintMonth2);
		if (dayintMonth2 == 29) {
			System.out.println("nam nay la nam nhuan");
		} else {
			System.out.println("cut");
		}

		GregorianCalendar gc = new GregorianCalendar();
		System.out.println("isLeapYear : " + gc.isLeapYear(2024));

		Calendar c1 = Calendar.getInstance(new Locale("vi", "VN"));
		System.out.println("VN: " + c1.getFirstDayOfWeek());

		System.out.println("===========================");
		
		Calendar cNow1 = Calendar.getInstance();
		cNow1.set(2022, 10, 9);
		System.out.println(cNow1);
		System.out.println(cNow1.get(Calendar.DAY_OF_WEEK));
		int fdow = cNow1.getFirstDayOfWeek();
		System.out.println(fdow);
		if(fdow == 1) {
			fdow++;
		}
		System.out.println(fdow + " ngay dau tien " + numbers.get(fdow));
		cNow1.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		System.out.println(cNow1.get(Calendar.DAY_OF_MONTH));
		int firstdayOfmont = cNow1.get(Calendar.DAY_OF_MONTH);
		int dayintMonth3 = cNow.getActualMaximum(Calendar.DAY_OF_MONTH);
		int month3 = cNow1.get(Calendar.MONTH)+1;
		System.out.println("so ngay toi da cua thang " + dayintMonth3);
		for (int i = fdow; i <= 8; i++) {			
				System.out.print(numbers.get(i) + " / ");
				System.out.print( " ngay " + firstdayOfmont++ + " / ");
				System.out.println(" thang "  + month3);
				if(firstdayOfmont == dayintMonth3) {
					firstdayOfmont = 1;		
					month3++;
				}
				
	
		}
		// co the dung today.add

	
/*
 * int fdOW = cNow1.getFirstDayOfWeek() + 1;
		System.out.println(fdOW);
		System.out.println("NGAY DAU TIEN TRONG TUAN HIEN TAI LA THU: " + numbers.get(fdOW));
	    int dayOfMonth1 = cNow1.get(Calendar.DAY_OF_MONTH);
	    cNow1.set(2022, cNow1.MONTH, fdOW);
 */
		/*
		 * Ex01: Lấy thông tin thời gian với timezone + 1. Ngày, Tháng, Năm + 2. Giờ
		 * 12-24, Phút, Giây + 3. Thứ ngày, tuần/ngày trong tháng, năm + 4. Đếm số ngày
		 * tháng, năm hiện tại >> Calendar + 5. Kiểm tra năm hiện tại có phải năm nhuận
		 * không + 6. Ngày đầu tiên trong tuần là thứ mấy với locale + 7. Ngày đầu tiên
		 * trong tuần hiện tại là ngày mấy ==> In ra danh sách các ngày trong tuần hiện
		 * tại =>>> Epoch time
		 */

	}

}
