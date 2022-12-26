package generic.type;

import java.lang.reflect.Array;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class JavaListImpl<E> implements IList<E> {
	private static final int DEFAULT_CAPACITY = 4;
	private static final int PLUS_CAPACITY = 10;
	
	// real elements in element data
	private int size = 0;
	
	// | Item A | Item B | Item C | Item D | ...
	private E[] elementData;
	
	public JavaListImpl() {
		this(DEFAULT_CAPACITY);
	}
	
	@SuppressWarnings("unchecked")
	public JavaListImpl(int capacity) {
		int newCapacity = capacity > DEFAULT_CAPACITY ? capacity : DEFAULT_CAPACITY;
		elementData = newInstance(newCapacity);
	}
	
	// list.add("Item A"); // size = 1
	// list.add("Item B"); // size = 2
	// list.add("Item C"); // size = 3
	// list.add("Item D"); // size = 4
	
	// list.add("Item E"); // 
	
	@Override
	public boolean add(E e) {
		// | Item A | Item B | Item C | Item D | ...
		// | Item A | Item B | Item C | Item D | NULL | NULL .. 10
		if (size == elementData.length) {
			elementData = grow(size + PLUS_CAPACITY);
		}
		elementData[size++] = e;
		return true;
	}

	@Override
	public boolean addAll(IList<E> list) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(int removedIndex) {
		return false;
	}

	@Override
	public boolean remove(E e) {
		return false;
	}

	@Override
	public boolean removeIf(Predicate<E> predicate) {
		return false;
	}

	@Override
	public E get(int i) {
		if (i < 0 || i >= size) {
			throw new ArrayIndexOutOfBoundsException("out of range " + i);
		}
		return elementData[i];
	}

	@Override
	public void set(int i, E e) {
		if (i < 0 || i >= size) {
			throw new ArrayIndexOutOfBoundsException("out of range " + i);
		}
		elementData[i] = e;
	}
	
	@Override
	public void printf() {
		for (int i = 0; i < size; i++) {
			System.out.print(elementData[i] + "  ");
		}
		System.out.println();
	}
	
	@Override
	public void forEach(Consumer<E> consumer) {
		for (int i = 0; i < size; i++) {
			// body --> strategy --> (E element) --> void
			consumer.accept(elementData[i]);
		}
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		return size;
	}
	
	
	private E[] grow(int newCapacity) {
		// Item A | Item B | Item C | Item D | NULL | NUll ... 10
		E[] newArray = newInstance(newCapacity);
		for (int i = 0; i < size; i++) {
			newArray[i] = elementData[i];
		}
		return newArray;
	}
	

	@SuppressWarnings("unchecked")
	private E[] newInstance(int length) {
		return (E[])Array.newInstance(Object.class, length);
	}
	
}