package bean;

public class Item {
 public int id ;
 public String name ;
 public double price;
	public Item( int pID,String pName,double pPrice) {
		id = pID;
		name=pName;
		price=pPrice;
	}
	public Item() {
	}
	
  @Override
	public String toString() {
	  return this.id+ " " + this.name+" "+this.price;
  }
 
 
	}


