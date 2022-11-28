package generic.type;

import java.util.function.Consumer;
import java.util.function.Predicate;

public interface IList<E> {
	boolean add(E e);
	boolean addAll(IList<E> list);
	boolean remove(int removedIndex);// xóa tại vị trí index
	boolean remove(E e);
	boolean removeIf(Predicate<E> predicate);
	
	E get(int i);
	void set (int i, E e);//hàm setter thường trả về void
	void printf();
	void foreach(Consumer<E> consumer);
	
	boolean isEmpty();
	
	int size();

}
