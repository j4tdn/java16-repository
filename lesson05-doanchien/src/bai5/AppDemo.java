package bai5;

public class AppDemo {
	public static void main(String[] args) {
		TextBook textbook1 = new TextBook();
		textbook1.getId();
		textbook1.getPrice();
		textbook1.getPushCompany();
		textbook1.getStatus();
		
		System.out.println("textbook1" +textbook1);
		
		TextBook textbook2 = new TextBook(1, 10000, "Nhi Dong", "moi");
		
		System.out.println(textbook2);
		
		ReferenceBook referbook1 = new ReferenceBook();
		
		referbook1.getId();
		referbook1.getPrice();
		referbook1.getPushCompany();
		referbook1.getVat();
		
		System.out.println(referbook1);
		
		
		
	}
}
