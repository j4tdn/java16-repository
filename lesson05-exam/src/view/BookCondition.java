package view;
import bean.Book;

//Khi interface chỉ có duy nhất 1 hàm trừu tượng
//Để tạo 1 đối tượng cho interface
//+ new Interface và override ==> anonymous class
//+ lambda expression để tạo đối tượng cho interface
//lambda expression: hàm mình override lại hàm trừu tượng trong interface
public interface BookCondition {
	boolean test(Book book);
}
