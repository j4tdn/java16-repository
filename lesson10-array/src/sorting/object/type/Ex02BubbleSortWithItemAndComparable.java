package sorting.object.type;

import common.Item;
import common.NullOPtion;
import utils.ArrayUtils;

//Ex03 gọn hơn

public class Ex02BubbleSortWithItemAndComparable {
	public static void main(String[] args) {
		Item[] item=getItems();
		ArrayUtils.printf("item", item);
		
		//xắp xếp item bởi giá tăng dần
		System.out.println("===============================");
		bubbleSort(item);
		ArrayUtils.printf("Item", item);
	}
	private static void bubbleSort(Item[] elements) {
		bubbleSort(elements, NullOPtion.NULL_FIRST);
	}
	
	private static void bubbleSort(Item[] elements, NullOPtion no) {

		for (int round = 0; round < elements.length; round++) {
			for (int i = 0; i < elements.length - round - 1; i++) {
				Item i1 =elements[i];
				Item i2= elements[i+1];
				if(NullOPtion.NULL_FIRST.equals(no)) {

					if(i1==null) {
						continue;
					}//sure-->s1!= null
					if(i2==null) {

						Item tmp = elements[i];
						elements[i] = elements[i + 1];
						elements[i + 1] = tmp;
						continue;
					}////sure-->s1!= null-s2!=null
				}else if(NullOPtion.NULL_LAST.equals(no)) {//null sau

					if(i1==null&& i2!=null) {
						Item tmp = elements[i];
						elements[i] = elements[i + 1];
						elements[i + 1] = tmp;
						continue;
					}
					if(i2==null) {
						continue;
					}
				}
				
				if (compareTo(i1, i2)  < 0) {

					Item tmp = elements[i];
					elements[i] = elements[i + 1];
					elements[i + 1] = tmp;
				}
			}
		}
	}
	//name1<name2 -> âm
	//name1>name2-> dương
	//0 -> name1=name2
	//so sánh name1 và name2 --> trả về >< hặng =0
	/*public static int compareTo(Item i1, Item i2) {
		return i1.getName().compareTo(i2.getName());
	}*/
	
	
	public static int compareTo(Item i1, Item i2) {
		return i1.getId()-i2.getId();
	}
	
	public static Item[] getItems() {
		return new Item[] {
				new Item(1,"Item1",350,101),
				new Item(8,"Item8",120,102),
				new Item(2,"Item2",450,101),
				new Item(9,"Item9",250,102),
				new Item(5,"Item5",620,102),
		};
	}

}
