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
		
		// Em code nhưng này thì new ra Object khác nhiều lần không cần thiết
		// Tạo 1 biến STATIC như đã làm chung với lớp
		List<ItemGroup> itemGroups = new ItemgGroupService().getItembyItemGroup();
		
		List<ItemService> itemServices = new ItemgGroupService().getItemService();
		
		//cau 1
		// Kết quả chạy được nhưng cách code sai hết --> 13/20
		 System.out.println(" ===============  Cau 1 ============== ");
		for (ItemService itemService : itemServices) {
			System.out.println(itemService + " ");
		}
		 System.out.println(" ============================= ");
		 System.out.println(" ===============  Cau 2 ============== ");
		
		 //cau 2
		 // dữ liệu chi tiết mặt hàng lấy về chưa đủ --> 17/20
		for (ItemGroup itemGroup : itemGroups) {
			System.out.println(itemGroup + " ");
		}
		
		//cau 3
		// OK --> 20
		System.out.println(" ===============  Cau 3 ============== ");
		
		System.out.println(" ============================= ");
		
		List<String> itemTop3year = new ItemgGroupService().getItemServiceTop3(2023);
		
		for (String string : itemTop3year) {
			System.out.println(string + " ");
		}
		
		//cau 4
		// OK
		System.out.println(" ============================= ");
		System.out.println(" ===============  Cau 4 ============== ");
		List<Item> itembySellMax = new ItemgGroupService().getItemServicemaxPrice();
		for (Item item : itembySellMax) {
			System.out.println(item + " ");
		}
		
		
		Readfile("data.txt");
		
		// OK nhưng cách làm chưa hay --> 15/20
		boolean inserts = new  ItemgGroupService().add(Readfile("data.txt"));
		
		// Làm thì được nhưng các code còn hơi nhớp DA nghe
		
		
	}
	
	// tên hàm --> viết thường chữ cái đầu tiên
	// Tên class e cứ đặt là ItemGroupDto hoặc ...Dto chứ k đặt theo chức năng insert
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
