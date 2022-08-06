package bean;

// Class --> Kiểu dữ liệu đối tượng
// Chứa nhiều thông tin bên trong
// Mỗi thông tin mình gọi là một thuộc tính, đặc điểm của class này
public class Item {
    
	//thuộc tính, attributes
	public int id;
    public String name;
    public double price;
    
    //Hàm: [access_modifier] [static] return_type function_name(parameter)
    //Hàm khởi tạo: [access_modifier] function_name(parameter)
    
   public Item(int pId, String pName, double pPrice)
   {
	   id = pId;
	   name = pName;
	   price = pPrice;
   }
    
   //Khởi tạo hàm rỗng
   public Item()
   {
	   
   }
   public Item(int pId, String pName)
   {
	   id = pId;
	   name = pName;
   }
   @Override
public String toString() {
	return this.id + ", "+ this.name + ", " + this.price;
}
}
