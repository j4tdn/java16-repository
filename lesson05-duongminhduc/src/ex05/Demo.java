package ex05;

public class Demo {

	public static void main(String[] args) {
			TextBook[] tb = new TextBook[3];
			
			tb[0] = new TextBook();
			tb[0].setIdbook("SGK1");
			tb[0].setPrice(100);
			tb[0].setPubcompany("Nhi Đồng");
			tb[0].setStatus("mới");
			
			tb[1] = new TextBook();
			tb[1].setIdbook("SGK2");
			tb[1].setPrice(50);
			tb[1].setPubcompany("Xuân Diệu");
			tb[1].setStatus("cũ");
			
			tb[2] = new TextBook();
			tb[2].setIdbook("SGK3");
			tb[2].setPrice(10);
			tb[2].setPubcompany("Nhi Đồng");
			tb[2].setStatus("mới");
			
			ReferenceBook[] rb = new ReferenceBook[2];
			
			rb[1] = new ReferenceBook();
			rb[1].setIdbook("STK1");
			rb[1].setPrice(12);
			rb[1].setPubcompany("Nhi Đồng");
			rb[1].setTax(80);
			
			rb[0] = new ReferenceBook();
			rb[0].setIdbook("STK2");
			rb[0].setPrice(79);
			rb[0].setPubcompany("Nhi aa");
			rb[0].setTax(20);
			
			Book[] books = {tb[0],tb[1],tb[2],tb[0],tb[1]};
			
			for(Book book : books)
			{
				if(book.getPubcompany() == "Nhi Đồng")
				System.out.println(book);
			}
			System.out.println("========================================");
			for(Book book : books)
			{
				if(book.getPrice() < 50)
				System.out.println(book);
			}
			System.out.println("========================================");
			for(Book book : books)
			{
				if(book.getIdbook().contains("SGK")==true && book.getPrice()>=100 && book.getPrice() <= 200 )
				System.out.println(book);
			}
			System.out.println("========================================");
			
			
			
	}
}
