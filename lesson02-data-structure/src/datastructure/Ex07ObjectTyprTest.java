package datastructure;
import bean.Item;
public class Ex07ObjectTyprTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Item itemX = new Item(101,"ItemX",200);
        System.out.println(" Price "+ itemX.price);
        
		modify(itemX);
		 System.out.println(" Price "+ itemX.price);
	        
	}
 private static void modify( Item itemY) {
	
	 itemY =new Item( 202,"itemZ",555);
	 itemY.price=777;
 }
}
