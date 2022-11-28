package generic.type;

import java.util.function.Consumer;

public class CustomArrayList<E> implements IList<E> {

	int initcapacity = 8;
    private E[] elementData;
    private int size;

    CustomArrayList(){
        elementData = createNew(initcapacity);
    }

    CustomArrayList(int capacity){
        if(capacity <= 0) throw new IllegalArgumentException("Capacity should be great than 0");
        initcapacity = capacity > initcapacity ? capacity : initcapacity;
        elementData = createNew(initcapacity);
    }
   
    @Override
    public void show() {
        for (int i = 0; i < size; i++) {
            System.out.print(elementData[i] + " ");
        }
        System.out.println();
    }

    @Override
    public int size() {return size;}

    @Override
    public boolean isEmpty() {return size == 0;}

    @Override
    public boolean contains(E o) {return indexOf(o) >= 0;}
    
    @Override
    public boolean add(E e) {
        if(size < initcapacity){
            elementData[size++] = e;
            return true;
        }
        else{
            elementData = grow();
            add(e);
            return true;
        }
    }
    
    @Override
    public void add(int index, E e) {
        if (index >= size) throw new IndexOutOfBoundsException();
        if (size < initcapacity) {
            for (int i = size; i > index; i--) {
                elementData[i] = elementData[i - 1];
            }
            elementData[index] = e;
            size++;
        } else {
            elementData = grow();
            add(index, e);

        }
    }
    
    @Override
    public boolean remove(E o) {
        for (int i = 0; i < size; i++) {
            if(elementData[i].equals(o)){
                remove(i);
                return true;
            }
        }
        return false;
    }
    
    @Override
    public E remove(int index) {
        if(index>=size) throw new IndexOutOfBoundsException();
        E c = elementData[index];
        for(int i = index ; i < size-1; i++)
            elementData[i] = elementData[i+1];
        size--;
        return c;
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
            for (int i = 0; i < size; i++) {
                if(elementData[i].equals(e)){
                    remove(i);
                }
            }
        }
        return false;
    }

    @Override
    public boolean replace(E o, E n) {
        for (int i = 0; i < size; i++) {
            if(elementData[i].equals(o)) {
                elementData[i] = n;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean replaceAll(E o, E n) {
        boolean check = false;
        for (int i = 0; i < size; i++) {
            if(elementData[i].equals(o)) {
                elementData[i] = n;
                check = true;
            }
        }
        return check;
    }

    @Override
    public E get(int index) {
        if (index < size)
            return elementData[index];
        else throw new IndexOutOfBoundsException();
    }

    @Override
    public boolean set(int index, E element) {
        if (index < size){
            elementData[index] = element;
            return true;
        }
        else throw new IndexOutOfBoundsException();
    }
    
    @Override
    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if(elementData[i].equals(o))
                return i;
        }
        return -1;
    }

    
    @Override
    public int lastIndexOf(E o) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if(elementData[i].equals(o))
                index = i;
        }
        return index;
    }

    @SuppressWarnings("unchecked")
	private E[] createNew(int capacity){
        return (E[]) new Object[capacity];
    }

    private E[] grow(){
        initcapacity = size + initcapacity;
        E[] tmpData = createNew(initcapacity);
        for (int i = 0; i < size; i++) {
            tmpData[i] = elementData[i];
        }
        return tmpData;
    }
    
    @Override
    public void printf() {
    	for (int i = 0; i < size; i++) {
			System.out.println(elementData[i]);
		}
    	System.out.println();
    }

	@Override
	public void forEach(Consumer<E> consumer) {
		// TODO Auto-generated method stub
		for (int i = 0; i < size; i++) {
			consumer.accept(elementData[i]);
		}
	}
	
    
    
	
}
