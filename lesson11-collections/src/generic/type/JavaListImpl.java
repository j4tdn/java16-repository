package generic.type;

import java.lang.reflect.Array;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class JavaListImpl<E> implements IList<E> {
	
	private static final int DEFAULT_CAPACITY = 4;
	private static final int PLUS_CAPACITY = 10;
	private E[] elementData;
	
	// real elements in element data
	private int size = 0;
	
	@SuppressWarnings("unchecked")
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
	
	@Override
	public boolean add(E e) {
		if (size == elementData.length) {
			elementData = grow(size + PLUS_CAPACITY);
		}
		elementData[size++] = e;
		return true;
	}
	
	@Override
	public boolean addAll(IList<E> list) {
		list.forEach(element -> add(element));
		return true;
	}

	@Override
	public boolean remove(int removedIndex) {
		if (removedIndex < 0 || removedIndex >= size) {
			return false;
		}
		
		for (int i = removedIndex; i < size - 1; i++) {
			elementData[i] = elementData[i + 1];
		}
		
		size--;
		return true;
	}

	@Override
	public boolean remove(E e) {
		if (e == null) {
			return false;
		}
		
		return removeIf(element -> element.equals(e));
	}

	@Override
	public boolean removeIf(Predicate<E> predicate) {
		boolean removed = false;
		for (int i = 0; i < size; i++) {
			if(predicate.test(elementData[i])) {
				removed = true;
				for (int j = i; j < size - 1; j++) {
					elementData[j] = elementData[j + 1];
				}
				size--;
				i--;
			}
		}
		return removed;
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
		// TODO Auto-generated method stub
		for (int i = 0; i < size; i++){
			System.out.println(elementData[i] + " ");
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
	
	@Override
	public int count(Predicate<E> predicate) {
		int count = 0;
		for (int i = 0; i < size; i++) {
			E element = elementData[i];
			if (predicate.test(element)) {
				count++;
			}
		}
		return count;
	}
	
	private E[] grow(int newCapacity) {
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
	
	private void shiftLeft(int pos) {
		for (int i = pos; i < size - 1; i++) {
			elementData[i] = elementData[i + 1];
		}
		size--;
	}
}
