package sorting.object.type;

import common.Item;
import common.NullOption;
import utils.ArrayUtils;

public class Ex02BubbleSortWithItem {
	public static void main(String[] args) {

		Item[] items = getItems();
		ArrayUtils.printf("items", items);
		// sort items by storeId(ASC), itemId(DESC)
		System.out.println("========================");
		// sort
		bubbleSort(items, NullOption.NULL_FIRST);
		ArrayUtils.printf("items", items);
	}
	
	public static Item[] getItems()
	{
		return new Item[] {
				new Item(1, "Item 1", 350, 101),
				new Item(3, "Item 3", 220, 102),
				new Item(2, "Item 2", 120, 101),
				new Item(4, "Item 4", 230, 102),
				new Item(7, "Item 7", 310, 101)
		};
	}
	private static void bubbleSort(Item[] elements, NullOption no)
	{
		for(int round = 0; round < elements.length; round ++)
		{
			for(int i  = 0; i < elements.length - round - 1;i++)
			{
				
				Item s1 = elements[i];
				Item s2 = elements[i+1];
				if(NullOption.NULL_FIRST.equals(no))
				{
					if(s1 == null)
					{
						continue;
					}
					if(s2 == null)
					{
						Item tmp = elements[i];
						elements[i] = elements[i +1 ];
						elements[i+1] = tmp;
						continue;
					}
				}
				else if(NullOption.NULL_LAST.equals(no))
				{
					if(s1 == null && s2 != null)
					{
						Item tmp = elements[i];
						elements[i] = elements[i +1 ];
						elements[i+1] = tmp;
						continue;
					}
					if(s2 == null)
					{
						continue;
					}
				}
				if(s1.getStoreId() - s2.getStoreId() > 0)
				{
					Item tmp = elements[i];
					elements[i] = elements[i +1 ];
					elements[i+1] = tmp;
				}
				else if(s1.getStoreId() - s2.getStoreId() == 0)
				{
					if(s1.getId() - s2.getId() > 0)
					{
						Item tmp = elements[i];
						elements[i] = elements[i +1 ];
						elements[i+1] = tmp;
					}
				}
				
			}
		}
	}
}
