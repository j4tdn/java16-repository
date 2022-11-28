package generic.type;

import java.util.function.Consumer;
import java.util.function.Predicate;

public interface IList<E> {
	boolean add(E e);
	boolean addAll(IList<E> list);
	boolean remove(int removeIndex);
	boolean remove(E e);
	boolean remove(Predicate<E> predicate);
	
	E get(int i);
	
	void set(int i, E e);
	
	boolean isEmpty();
	
	int size();
	
	void printf();
	
	void forEach(Consumer<E> consumer);
}
