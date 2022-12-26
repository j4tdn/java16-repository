package predemo;

import java.util.List;

import model.DataModel;

public class demo {
	public static void main(String[] args) {
		List<Trader> listTraders = DataModel.getTraders();
		
		listTraders.forEach(null);
	}
	
	public static void fillterTraders() {
		
	}
}