package generic.type;

import java.lang.reflect.Array;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class JavaListImpl<E> implements IList<E> {
	private static final int DEFAULT_CAPACITY = 4;
	private static final int PLUST_CAPACITY = 10;
	// phải tạo size khi add size là real element in element data
	private int size = 0;
	// |NULL|NULL|NULL|NULL
	private E[] elementData;

	// cách 1
	public JavaListImpl() {
		this(DEFAULT_CAPACITY);
	}

	// cách 2

	public JavaListImpl(int capacity) {
		int newcapacity = capacity > DEFAULT_CAPACITY ? capacity : DEFAULT_CAPACITY;
		elementData = newInstance(newcapacity);
	}
	// list.add("Item A)//size = 1;
	// list.add(Item B") // size = 2;
	// list.add(Item C") // size = 3;
	// list.add(Item D") // size = 3;

	@Override
	public boolean add(E e) {
		if (size == elementData.length) {
			elementData = grow(size + PLUST_CAPACITY);
		}
		elementData[size++] = e;
		return true;
	}

	@Override
	public boolean addall(IList<E> list) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E get(int i) {
		if(i < 0 || i >= size) {
			throw new ArrayIndexOutOfBoundsException("out of range" + i);
		}
		return elementData[i];
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(E e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(int removedIndex) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeIf(Predicate<E> predicate) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void set(int i, E e) {
		if(i < 0 || i >= size) {
			throw new ArrayIndexOutOfBoundsException("out of range" + i);
		}
		elementData[i] = e;
	}
	@Override
	public void forEach(Consumer<E> consumer) {
		for(int i = 0; i < size ; i++) {
			consumer.accept(elementData[i]);
		}
	}
	@Override
	public void printf() {
		for(int i = 0 ; i < size; i++) {
			System.out.println(elementData[i] + " ");
		}
		System.out.println();
	}

	@Override
	public int size() {
		return size;
	}

	private E[] grow(int newCapacity) {
		// NUll | NUll ..
		E[] newArray = newInstance(newCapacity);
		for(int i = 0; i< size; i++) {
			newArray[i] = elementData[i];
		}
		return newArray;
	}
	@SuppressWarnings("unchecked")
	private E[] newInstance(int lenght) {
		return (E[])Array.newInstance(Object.class, lenght);
	}
}
