package generic.type;

import java.util.function.Consumer;
import java.util.function.Predicate;

public interface IList<E> {
	boolean add(E e);
	boolean addAll(IList<E> List);
	boolean remove(int removedIndex);
	boolean removeIf(Predicate<E> predicate);

	E get(int i);
	void set(int i, E e);
	void printf();
	void forEach(Consumer<E> consumer);
	
	boolean isEmpty();
	int size();
}
