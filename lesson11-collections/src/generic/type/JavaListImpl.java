package generic.type;

import java.lang.reflect.Array;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class JavaListImpl<E> implements IList<E> {
	private static final int DEFAULT_CAPACITY = 4;//khi gọi hàm khởi tạo rỗng thì sẽ truyền cho
// elementData 1 cái DEFAULT_CAPACITY để tạo mảng có độ dài =4
	
	private static final int PLUS_CAPACITY = 10;
	// real element in element data
	
	private int size = 0;//số lượng phần tử hiện tại chứa trong list elementdata

	private E[] elementData;
	//add 1 phần tử-> cho elementdata tại size bằng giá trị đưa vô
	//sau khi xong tăng size lên 1
	
	public JavaListImpl() {
		this(DEFAULT_CAPACITY);//elementData = (E[]) Array.newInstance(Object.class, DEFAULT_CAPACITY);
	}

	@SuppressWarnings("unchecked")//không warming nữa
	public JavaListImpl(int capacity) {//hàm này gọi hàm khởi tạo rỗng
		int newCapacity = capacity > DEFAULT_CAPACITY ? capacity : DEFAULT_CAPACITY;
		//nếu capacity > default thì dùng capacity; nhỏ nhwo thì dùng default
		
		elementData =newInstance(newCapacity); 
				//(E[]) Array.newInstance(Object.class, newCapacity);
	}//Array.newInstance: tạo thể hiện ra 1 mảng có kdl truyền vào và số lượng phần tử size
	//ép kiểu (E[])

	
	//list.add("Item A") gán vào size =0 elementData[size++] = e;
	//return true;
	
	@Override//chống tràn mảng
	
	public boolean add(E e) {
		if (size == elementData.length) {
			//khi size = length thì tạo mảng mới với sức chứa mới
			// copy các phần tử hiện tại qua
			
			elementData = grow(size + PLUS_CAPACITY);
		}
		elementData[size++] = e;
		return true;
	}

	@Override
	//for(E element: elementData)--> in ra cả NULL
	public void printf() {
		for (int i = 0; i < size; i++) {
			System.out.print(elementData[i] + " ");
		}
		System.out.println();
	}

	@Override
	//tìm phần tử xem có phù hợp đk không?
	//duyệt phần tử
	public void foreach(Consumer<E> consumer) {
		for (int i = 0; i < size; i++) {
			//chưa biết điều kiện nào-->strategy
			//-->Truyền vào element và trả về void
			consumer.accept(elementData[i]);
		}//consumer nhập vào tham số trả về void
		//bên ngoài truyền đk vào consumer--> new consumer-->override lại accept
		
	}

	@Override
	public boolean addAll(IList<E> list) {

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
			throw new ArrayIndexOutOfBoundsException("out of range");
		}
		return elementData[i];
	}

	@Override
	public void set(int i, E e) {
		if (i < 0 || i >= size) {
			throw new ArrayIndexOutOfBoundsException("out of range");
		}
		elementData[i] = e;

	}

	@Override
	public boolean isEmpty() {

		return false;
	}

	@Override
	public int size() {

		return size;
	}

	private E[] grow(int newCapaciry) {//tạo thêm grow cho hàm add
		//grow phải là mảng mới có số phần tử= size +plus và có tất cả phần tử bên mảng củ
		
		E[] newArray = newInstance(newCapaciry);
		for (int i = 0; i < size; i++) {
			newArray[i] = elementData[i];
		}
		return newArray;
	}

	@SuppressWarnings("unchecked")
	private E[] newInstance(int length) {
		return (E[]) (Array.newInstance(Object.class, length));
	}

}
