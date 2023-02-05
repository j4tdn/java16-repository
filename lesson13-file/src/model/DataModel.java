package model;

import java.util.List;

import bean.Trader;

//Lấy trader ghi vào file; mỗi trader ghi 1 hàng
//mỗi hàng phải ghi Id , Họ tên, Nơi

public class DataModel {
	private DataModel() {
		
	}
	
	public static List<Trader> getTraders(){
		//[id], name, address
		
		return List.of(
				new Trader(1,"Terry", "London","0t@gmail.com"),
				new Trader(2,"Kaka", "Brasil","2k@gmail.com"),
				new Trader(3,"Adam", "Milan","4a@gmail.com")
				);
				
	}

}

