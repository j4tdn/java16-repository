package view;
import java.util.Arrays;
import static java.util.Comparator.*;
import bean.Item;

public class Ex03 {
	public static void main(String[] args) {
		Item[] items = getItems();
		
		maxPriceInStoreID(items);
	}

	public static Item[] getItems() {
		return new Item[] { new Item(1, "A", 25, 101), new Item(2, "B", 90, 102), new Item(3, "C", 88, 102),
				new Item(4, "D", 40, 101), new Item(5, "E", 60, 102), new Item(6, "F", 18, 101)

		};

	}
	
	

	private static void maxPriceInStoreID(Item[] items) {
		Arrays.sort(items, comparing(Item::getStoreId).thenComparing(Item::getSalesPrice,reverseOrder()));
		System.out.println("The item with the highest selling price of the store " + items[0].getStoreId() + " is item: " + items[0]);
		int storeId = items[0].getStoreId();
		for(Item item : items) {
			if(item.getStoreId() != storeId) {
				storeId = item.getStoreId();
				System.out.println("The item with the highest selling price of the store " + storeId + " is item: " + item);
			}
		}
	}
//	public static void maxPriceInStoreID(Item[] items)
//	{
//		HashMap<Integer, Double> check = new HashMap<Integer, Double>();
//		
//		for(int i=0;i<items.length;i++)
//		{
//			if(!check.containsKey(items[i].getItemId()))
//			{
//				check.put(items[i].getStoreId(), items[i].getSalesPrice());
//			}
//			else
//			{
//				if(check.get(items[i].getItemId())< items[i].getSalesPrice())
//				{
//					check.remove(items[i].getItemId());
//					check.put(items[i].getStoreId(), items[i].getSalesPrice());
//				}
//				
//			}
//		}
//		
//		
//		System.out.println("The item with the highest selling price of the store " + i.getItemId() + " is item: " + i);
//	}
}
