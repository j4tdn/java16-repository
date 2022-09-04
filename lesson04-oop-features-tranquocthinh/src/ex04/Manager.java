package ex04;

import java.time.LocalDate;

public class Manager extends Personnel {
	private int quantityStaffManagement;

	public Manager() {
		super();
	}

	public Manager(String name, LocalDate dateOfBith, float hsl ,int quantityStaffManagement) {
		super(name, dateOfBith, hsl);
		this.quantityStaffManagement = quantityStaffManagement;
	}

	public int getQuantityStaffManagement() {
		return quantityStaffManagement;
	}

	public void setQuantityStaffManagement(int quantityStaffManagement) {
		this.quantityStaffManagement = quantityStaffManagement;
	}
	@Override
	public float salary() {
		return (super.hsl * 220000);
	}
	@Override
	public String toString() {
		return super.toString() + " quantityStaffManagement:  " + this.quantityStaffManagement + " salary of department head: " + this.salary();
	}
	
	

}
