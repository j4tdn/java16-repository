package generic.ftclass;

import java.lang.reflect.Array;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class CustomList<E> implements IList<E> {
	private static int dfdecapacity =  5;
	private int size;
	private E[] elements;
	
	public CustomList() {
		this(dfdecapacity);
	}
	public CustomList(int capacity) {
		if( capacity <= 0 ) {
		   throw new IllegalArgumentException("Capacity Element must be >= 0");
		}
		elements = createArrayInstance(capacity);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean add(E e) {
		if(size == elements.length) {
			elements = grow(size);
		}
		elements[size++] = e;
		return false;
	}

	@Override
	public boolean add(int index, E e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean AddIf(E e, Predicate<E> predicate) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(int index) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(E e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeIf(Predicate<E> predicate) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E get(int indix) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void set(int index) {
		// TODO Auto-generated method stub
		
	}
	@SuppressWarnings("unchecked")
	private E[] createArrayInstance(int lengt) {
		return (E[])Array.newInstance(Object.class, lengt);
	}
	private E[] grow(int currenSize) {
		E[] newElements = createArrayInstance(currenSize + dfdecapacity*2);
		for(int i = 0 ; i < currenSize ; i ++) {
			newElements[i] = elements[i];
		}
		return newElements;
	}
	@Override
	public void iterate(Consumer<E> consumer) {
		for (int i = 0; i <size; i++) {
			consumer.accept(elements[i]);
			System.out.println(elements[i]);
			
		}
		
	}

}
