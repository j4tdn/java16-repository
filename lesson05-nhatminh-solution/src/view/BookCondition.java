package view;

import bean.Book;

//Khi interface chi co duy nhat 1 ham truu tuong
// -> De khoi tao 1 doi tuong cho interface nay
// + annonymous class
// + lambda expression

public interface BookCondition {
	boolean test(Book book);
}
