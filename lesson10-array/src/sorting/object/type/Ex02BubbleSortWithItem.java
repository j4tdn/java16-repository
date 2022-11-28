package sorting.object.type;

import common.Item;
import common.NullOPtion;
import utils.ArrayUtils;

public class Ex02BubbleSortWithItem {
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
				// step 1 end
				//gọi được hàm compareTo vì
				//String implement Comparable<String>
				//hoán vị từng Item
				//so sánh Item price thôi
				
				//case1: xắp xếp bằng giá :if (i1.getPrice()-i2.getPrice()  > 0)
				
				//case 2: bằng ItemId:	if (i1.getId()-i2.getId()  > 0)
				
				//case 3: giảm dần theo name
				
				//case4: Store tăng--> Store trùng thì ItemId tăng
				if (i1.getName().compareTo(i2.getName())  < 0) {

					Item tmp = elements[i];
					elements[i] = elements[i + 1];
					elements[i + 1] = tmp;
				}
			}
		}
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
