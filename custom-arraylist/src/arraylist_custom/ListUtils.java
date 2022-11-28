package arraylist_custom;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Predicate;

import funcion_interface.IList;

public class ListUtils<E> implements IList<E>  {

	private static int defaultCapacity = 4; 
	private static final int PLUS_CAPACITY = 10;
	private int size;
	private E[] elements;
	
	public ListUtils() {
		this(defaultCapacity);
	}
	
	public  ListUtils(int capacity) {
		if(capacity <=  0) {
			throw new IllegalArgumentException(" capacity > 0 pls");
		}
		int newcapacity = capacity > defaultCapacity ? capacity : defaultCapacity;
		elements = createArrayInstance(newcapacity);
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean add(E e) {
		if(size < elements.length) {
			elements[size++] = e;
		}
		else {
			elements =  grow(size);
			add(e);
		}
		return false;
	}

	@Override
	public boolean add(int index, E e) {
		if(index > size) throw new IllegalArgumentException("index < size");
		
		for (int i = size ; i > index ; i--) {
			elements[i] = elements[i - 1];
			
		}
		elements[index] = e;
		size++;
		return true;
		
		
	}


	@Override
	public boolean remove(int index) {
		if (index > size)
			throw new IllegalArgumentException("index < size");

		for (int i = index; i < size - 1; i++) {
			elements[i] = elements[i + 1];

		}
		size -=1;
		return true;
		
	}

	@Override
	public boolean remove(E e) {
		for(int i = 0; i < size; i ++) {
			if(e.equals(elements[i])) {
				remove(i);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean removeIf(Predicate<E> predicate) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E get(int index) {
		if(index < 0 || index >= size) {
			throw new ArrayIndexOutOfBoundsException("index < size");
		}
		return elements[index];
	}

	@Override
	public void set(int index, E value) {
		if(index < 0 || index >= size) {
			throw new ArrayIndexOutOfBoundsException("index < size");
		}
		elements[index] = value;
		
	}
	
	@SuppressWarnings("unchecked")
	private E[] createArrayInstance(int length) {
		return (E[])Array.newInstance(Object.class, length);
	}
	private E[] grow(int currentsize) {
		 E[] newElements = createArrayInstance(currentsize + defaultCapacity * 2);
		 for (int i = 0; i < currentsize; i++) {
			newElements[i] = elements[i];
		}
		 return  newElements;
		 
	}
	@Override
	public String toString() {
		String string = "";
		for (int i = 0; i < size; i++) {
			string += elements[i].toString() + " ";
		}
		return string;
	}

	@Override
	public boolean addAll(E... c) {
		for (E e : c) {
			add(e);
		}
		return false;
	}

	@Override
	public boolean removeAll(E... c) {

		
		for (E e : c) {
			remove(e);
		}
		return false;
	}

	@Override
	public void printf() {
		for (int i = 0; i < size; i++) {
		    System.out.print(elements[i] + " ");
			
		}
		System.out.println();
		
	}

	@Override
	public void foreach(Consumer<E> consumer) {
		for (int i = 0; i < size; i++) {
		    consumer.accept(elements[i]);
			
		}
		
	}

	

	


}
