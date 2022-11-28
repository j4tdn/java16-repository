package generic.type;

import java.util.function.Consumer;

public interface IList<E> {
	int size();
    
	boolean isEmpty();
    
	boolean contains(E o);
    
	boolean add(E e);
    
	void add(int index, E element);
    
	boolean remove(E o);
    
	E remove(int index);
    
	boolean addAll(E ... c);
    
	boolean removeAll(E ... o);
    
	boolean replace(E o, E n);
    
	boolean replaceAll(E o, E n);
    
	boolean equals(Object o);
    
	E get(int index);
    
	boolean set(int index, E element);
    
	int indexOf(E o);
    
	int lastIndexOf(E o);
    
	void show();
	
	void printf();
	
	void forEach(Consumer<E> consumer);

}
