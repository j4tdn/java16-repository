package view;

import bean.Book;

// Khi interface chỉ có duy nhất 1 hàm trừu tượng
// Để tạo 1 đối tượng cho interface
// + new Interface và overrid ==> anonymous class
// + 
public interface BookCondition {
	boolean test(Book book);
}
