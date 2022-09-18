package view;

import bean.Book;

/**
 * Khi interface chỉ có duy nhất một hàm trừu tượng
 * Để tạo 1 đối tượng cho interface
 *
 */

public interface BookCondition {
	boolean test(Book book);
}
