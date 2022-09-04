package Ex04;

import java.time.LocalDate;

public class director {
	private String Fullname;
	private LocalDate birthday;
	private int HSL;
	private int HSCV;
	
	public director() {
		// TODO Auto-generated constructor stub
	}
	public director(String Fullname, LocalDate birthday, int HSL, int HSCV) {
		this.Fullname=Fullname;
		this.birthday=birthday;
		this.HSL=HSL;
		this.HSCV=HSCV;
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
	public int getHSCV() {
		return HSCV;
	}
	public void setHSCV(int hSCV) {
		HSCV = hSCV;
	}
	@Override
	public String toString() {
		return "director [Fullname=" + Fullname + ", birthday=" + birthday + ", HSL=" + HSL + ", HSCV=" + HSCV + "]";
	}
	public double salary() {
		return(this.HSL+this.HSCV)*3000000;
	}
	

}
