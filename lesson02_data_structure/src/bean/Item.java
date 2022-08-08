package bean;
//Class -->Kiểu dữ liệu đối tượng
// chứa nhiều thông tin bên trong 
// Mỗi thông tin mình gọi là một thuộc tính , đặc điểm của Class này.
public class Item {
	// thuộc tính, attributes
	public int id;
	public String name;
	public double price;
	
	public Item() {
		
	}
	
	// Hàm : access_modifier [static] return_type function_name (parameters)
	//Hàm khởi tạo: [access_modifier] function_name(parameters) -->function_name =class_name 
	
	//this: đại diện cho địa chỉ, ô nhớ hiện tại đang gọi, đang khởi tạo
	
		public Item(int pId ,String pName,int pPrice) {
			id = pId;
			name = pName;
			price =pPrice;
		}
		public Item(int pId ,String pName) {
			id = pId;
			name = pName;
			
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return this.id +","+this.name +","+ this.price;
		}
	}

	
