package ex05;

public class BookDemo {
	public static void main(String[] args) {
		Book[] arrB= new Book[5];
		
		Book gk1 = new GkBook("SGK1",70,"kimdong","new");
		Book gk2 = new GkBook("SGK2",80,"giaoduc","old");
		Book gk3 = new GkBook("SGK3",98,"kimdong","old");
		Book tk = new TkBook("STK01",88,"tre",20);
		Book tk2 = new TkBook("STK02",10,"kimdong",40);
		findBook(arrB);
		
		//System.out.println();
	}
	public static void findBook(Book[] students) {
		for(Book student:students) {
			if(student.getNxb().equals("kimdong")) {
				System.out.println(student);
			}
		}
	}
	

}
