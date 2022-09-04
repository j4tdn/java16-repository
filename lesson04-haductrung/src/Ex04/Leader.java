package Ex04;

import java.time.LocalDate;

public class Leader {
	private String Fullname;
	private LocalDate birthday;
	private int HSL;
	private int NumberOfEmployee;
	
	public Leader() {
		// TODO Auto-generated constructor stub
	}
	public Leader(String Fullname, LocalDate birthday, int HSL, int NumberOfEmployee) {
		this.Fullname=Fullname;
		this.birthday=birthday;
		this.HSL=HSL;
		this.NumberOfEmployee=NumberOfEmployee;
	}
	public String getFullname() {
		return Fullname;
	}
	public void setFullname(String fullname) {
		Fullname = fullname;
	}
	public LocalDate getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	public int getHSL() {
		return HSL;
	}
	public void setHSL(int hSL) {
		HSL = hSL;
	}
	public int getNumberOfEmployee() {
		return NumberOfEmployee;
	}
	public void setNumberOfEmployee(int NumberOfEmployee) {
		NumberOfEmployee = NumberOfEmployee;
	}
	@Override
	public String toString() {
		return "director [Fullname=" + Fullname + ", birthday=" + birthday + ", HSL=" + HSL + ", HSCV=" + NumberOfEmployee + "]";
	}
	public double salary() {
		return this.HSL*2200000;
	}
	

}
