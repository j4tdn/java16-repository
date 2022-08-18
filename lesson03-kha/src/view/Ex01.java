package view;

import java.util.Date;

import bean.Customer;
import bean.Item;
import bean.ItemDetail;
import bean.Order;

public class Ex01 {
	
	static Customer c1 = new Customer(1, "KH1", "123", "NewYork");
	static Customer c2 = new Customer(2, "KH2", "456", "California");
	static Customer c3 = new Customer(3, "KH3", "789", "American");
	public static Customer[] listCustomers = {c1, c2, c3};
	
	
	
	static Item i1 = new Item(1, "SS10+", "Android","Black",  620);
	static Item i2 = new Item(2, "SS20U", "Android","Green",  840);
	static Item i3 = new Item(3, "IP4", "IOS","White",  280);
	static Item i4 = new Item(4, "IP12", "IOS","Black",  880);
	static Item i5 = new Item(5, "WP8", "WindowPhone","Blue",  560);
	public static Item[] listItems = {i1, i2, i3, i4, i5};
	
	public static void main(String[] args) {
		
		
		Order o1 = new Order(1, new ItemDetail[]{new ItemDetail(1, 3), new ItemDetail(4, 1), new ItemDetail(2, 3)} , new Date(2021, 8, 7, 10, 10, 10));
		Order o2 = new Order(2, new ItemDetail[]{new ItemDetail(3, 2), new ItemDetail(5, 1)} , new Date(2021, 5, 5, 10, 10, 10));
		Order o3 = new Order(3, new ItemDetail[]{new ItemDetail(4, 1)} , new Date(2021, 8, 7, 10, 10, 10));
		Order[] listOders = {o1, o2, o3};
		
		System.out.println(calcularOrder(o1));
		System.out.println(calcularOrder(o2));
		System.out.println(calcularOrder(o3));
		System.out.println("=================================");
		export(o1);
		System.out.println("=================================");
		export(o3);
		System.out.println("=================================");
		export(o2);
	}
	
	
	public static void export(Order o) {
		System.out.println("Customer : " + getCustomerById(o.getCustomerid()).getName());
		System.out.println("Items Buy: ");
		for (ItemDetail itemdetails : o.getItemDetail()) {
			System.out.println("           " + "Name: " + getItemById(itemdetails.getItemid()).getName() + 
					" Color: " + getItemById(itemdetails.getItemid()).getColor() + " Quantity: " + itemdetails.getQuantity());
		}
		System.out.println("Total cost: ");
		
	}
	
	public static double calcularOrder(Order o) {
		double sumCost = 0;
		for (ItemDetail itemdetails : o.getItemDetail()) {
			sumCost += getItemById(itemdetails.getItemid()).getCost() * itemdetails.getQuantity();
		}
		if(o.getDatetime().getDate() == 5 && sumCost > 590) {
			sumCost -= sumCost*10/100;
			
		}
		return sumCost;
	}
	
	public static Item getItemById(int id) {
		for (Item items : listItems) {
			if(items.getId() == id) return items;
		}
		return null;
	}
	
	public static Customer getCustomerById(int id) {
		for (Customer customer : listCustomers) {
			if(customer.getId() == id) return customer;
		}
		return null;
	}
}
