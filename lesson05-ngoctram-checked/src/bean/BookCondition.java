package bean;

// Khi interface chỉ có 1 hàm trừu tượng
// Để tạo 1 đối tượng cho interface
// + new Interface và override => anonymous class
// + lambda expression để tạo đối tượng cho interface

// lambda expression là 1 hàm override hàm trừu tượng trong interface
public interface BookCondition {
	boolean test(Book book);
}
