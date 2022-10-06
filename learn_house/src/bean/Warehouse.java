package bean;

import java.util.Objects;

public class Warehouse {
	private String whID;
	private String address;
	public Warehouse() {
		// TODO Auto-generated constructor stub
	}
	public Warehouse(String whID, String address) {
		super();
		this.whID = whID;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Warehouse [whID=" + whID + ", address=" + address + "]";
	}
	public String getWhID() {
		return whID;
	}
	public void setWhID(String whID) {
		this.whID = whID;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
			
		}
		if(!(obj instanceof Warehouse)) {
			return false;
		}
		Warehouse that = (Warehouse)obj;
		
		return getWhID().equals(that.getWhID()) && getAddress().equals(that.getAddress()); 
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(getWhID(), getAddress());
	}

}
