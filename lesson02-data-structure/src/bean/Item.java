package bean;
//class -> kieu du lieu doi tuong 
//chua nhieu thong tin ben trong
// moi thong tin minh` goi la` mot thuoc tinh', dac diem? cua? class nay`
public class Item {
	public int itemId;
	public String name;
	public double price;
	
	//this dai dien cho dia chi , o nho hien tai dang goi, dang khoi tao
	public Item(int itemId, String name) {
		this.itemId = itemId;
		this.name = name;
	}
	
	
	public Item(int itemId, String name, double price) {
		super();
		this.itemId = itemId;
		this.name = name;
		this.price = price;
	}


	@Override
	public String toString() {
		return "itemId=" + itemId + ", name=" + name + ", price=" + price + "";
	}
	

}
