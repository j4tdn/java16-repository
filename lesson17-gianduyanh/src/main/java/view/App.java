package view;



import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import bean.Item;
import bean.ItemGroup;
import bean.ItemGroupInsert;
import bean.ItemService;
import service.ItemgGroupService;

public class App {
	
	public static void main(String[] args) {
		
		List<ItemGroup> itemGroups = new ItemgGroupService().getItembyItemGroup();
		
		List<ItemService> itemServices = new ItemgGroupService().getItemService();
		
		//cau 1
		 System.out.println(" ===============  Cau 1 ============== ");
		for (ItemService itemService : itemServices) {
			System.out.println(itemService + " ");
		}
		 System.out.println(" ============================= ");
		 System.out.println(" ===============  Cau 2 ============== ");
		//cau 2
		for (ItemGroup itemGroup : itemGroups) {
			System.out.println(itemGroup + " ");
		}
		
		//cau 3
		System.out.println(" ===============  Cau 3 ============== ");
		
		System.out.println(" ============================= ");
		
		List<String> itemTop3year = new ItemgGroupService().getItemServiceTop3(2023);
		
		for (String string : itemTop3year) {
			System.out.println(string + " ");
		}
		
		//cau 4
		
		System.out.println(" ============================= ");
		System.out.println(" ===============  Cau 4 ============== ");
		List<Item> itembySellMax = new ItemgGroupService().getItemServicemaxPrice();
		for (Item item : itembySellMax) {
			System.out.println(item + " ");
		}
		
		
		Readfile("data.txt");
		
		boolean inserts = new  ItemgGroupService().add(Readfile("data.txt"));
		
		
		
		
	}
	public static List<ItemGroupInsert> Readfile(String fileName) {
		List<ItemGroupInsert> itemgrinsert = new ArrayList<ItemGroupInsert>();
        try {
        	
        	
              File myObj = new File(fileName);
              Scanner myReader = new Scanner(myObj);
              while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] dataSplit = data.split(",");
               
                ItemGroupInsert itemGroupInsert = new ItemGroupInsert(Integer.parseInt(dataSplit[0]),dataSplit[1], dataSplit[2]);
                
               
                itemgrinsert.add(itemGroupInsert);
                
              }
              myReader.close();
            } catch (FileNotFoundException e) {
              System.out.println("An error occurred.");
              e.printStackTrace();
            }


        return itemgrinsert;
    }
	
	

}
