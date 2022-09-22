package view;

import bean.Book;

public interface BookCondition {
// khi interface chỉ có duy nhất 1 hàm trùy tượng
	// Để tạo 1 đối tượng cho interface
// + new Interface và overide ==>anonymus class 
//	+lambda expression : hàm mình overide lại hàm trùy tượng trong interface.
	boolean test(Book book);
}
