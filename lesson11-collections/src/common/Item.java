package common;

public class Item implements Comparable<Item>{
	private int id;
	private String name;
	private double price;
	private int storeId;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(int id, String name, double price, int storeId) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.storeId = storeId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStoreId() {
		return storeId;
	}
	//i1.equals(i2)--> i1 là this; i2 là that
	//-->trùng địa chỉ thì true(trùng địa chỉ ở stack-->trỏ trùng ô nhớ ở heap)
	// -->bằng nhau
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}//nếu that lúc runtime không phải item thì false
		if (!(o instanceof Item)) {
			return false;
		}
		Item that = (Item) o;//convert sang item để lấy đc id của o
		return this.getId() == that.getId();
	}

	@Override
	public int compareTo(Item that) {
		Item i1 = this;
		Item i2 = that;

		return i2.getStoreId() - i1.getStoreId();
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	@Override
	public String toString() {
		return id + "," + name + ", " + price + "," + storeId;
	}
	

}
