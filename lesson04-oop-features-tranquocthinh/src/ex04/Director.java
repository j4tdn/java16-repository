package ex04;

import java.time.LocalDate;

public class Director extends Personnel {
	private float hscv;

	public Director() {
		super();
	}

	public Director(String name, LocalDate dateOfBith, float hsl ,float hscv) {
		super(name, dateOfBith, hsl);
		this.hscv = hscv;
	}

	public float getHscv() {
		return hscv;
	}

	public void setHscv(float hscv) {
		this.hscv = hscv;
	}
	@Override
	public float salary() {
		return (super.hsl + hscv) * 300000;
	}

	@Override
	public String toString() {
		return super.toString() +  "Director [hscv=" + hscv + " director's salary: " + this.salary() + "]";
	}
	

}
