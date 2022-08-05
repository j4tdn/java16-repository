package bean;
//Class cũng là kiểu dữ liệu đối tượng 
// Chứa nhiều thông tin bên trong 
// Mỗi thông tin gọi là một thuộc tính, đặc điểm của class này
public class Item {
	//thuộc tính, attribute
     public int id;
     public String name;
     public double price;
     
     // Hàm: [access_modifier] [static] return_type function_name(parameters)
     // Hàm khởi tạo: [access_modifier] function_name(parameters)--> function_name= class_name
     
     
     public Item() {
    	 
     }
     //this đại diện cho địa chỉ ô nhớ hiện tại đang gọi,đang khởi tạo
     public Item(int pId,String pName, double pPrice) {
    	 id = pId;
    	 name = pName;
    	 price= pPrice;
    	 
     }
     public Item(int pId,String pName) {
    	 //id = pId;
    	 //name = pName;
   
    	 
     }@Override
    public String toString() {
    	
    	return this.id+ ","+ this.name + ","+ this.price + ",";
    }
}
