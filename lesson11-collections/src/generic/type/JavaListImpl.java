package generic.type;

import java.lang.reflect.Array;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class JavaListImpl<E> implements IList<E> {

	private static final int DEFAULT_CAPACITY = 4;
	private static final int PLUS_CAPACITY = 10;

	// real elements in element data
	private int size = 0;
	private E[] elementData;

	@SuppressWarnings("unchecked")
	public JavaListImpl() {
		this(DEFAULT_CAPACITY);
	}

	@SuppressWarnings("unchecked")
	public JavaListImpl(int capacity) {
		int newCapacity = capacity > DEFAULT_CAPACITY ? capacity : DEFAULT_CAPACITY;
		elementData = newInstance(newCapacity);
	}

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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(int removeIndex) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(E e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Predicate<E> predicate) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E get(int i) {
		if(i < 0 || i >= size) {
			throw new ArrayIndexOutOfBoundsException("out of range ");
		}
		return elementData[i];
	}

	@Override
	public void set(int i, E e) {
		if(i < 0 || i >= size) {
			throw new ArrayIndexOutOfBoundsException("out of range ");
		}
		elementData[i] = e;
	}
	
	@Override
	public void printf() {
		for(int i = 0; i < size; i++) {
			System.out.println(elementData[i] + " ");
		}
	}

	@Override
	public void forEach(Consumer<E> consumer) {
		for(int i = 0; i < size; i++) {
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
		E[] newArray = (E[])Array.newInstance(Object.class, newCapacity);
		for(int i = 0; i < size; i++) {
			newArray[i] = elementData[i];
		}
		return newArray;
	}
	
	@SuppressWarnings("unchecked")
	private E[] newInstance(int length) {
		return (E[])Array.newInstance(Object.class, length);
	}
	
}
