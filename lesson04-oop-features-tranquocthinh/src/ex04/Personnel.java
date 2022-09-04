package ex04;

import java.time.LocalDate;

public class Personnel {
	protected String name;
	protected LocalDate dateOfBith;
	protected float hsl;
	
	public Personnel() {
		super();
	}

	public Personnel(String name, LocalDate dateOfBith, float hsl) {
		super();
		this.name = name;
		this.dateOfBith = dateOfBith;
		this.hsl = hsl;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateOfBith() {
		return dateOfBith;
	}

	public void setDateOfBith(LocalDate dateOfBith) {
		this.dateOfBith = dateOfBith;
	}

	public float getHsl() {
		return hsl;
	}

	public void setHsl(float hsl) {
		this.hsl = hsl;
	}
	public float salary() {
		return 0;
	}

	@Override
	public String toString() {
		return "Personnel [name=" + name + ", dateOfBith=" + dateOfBith + ", hsl=" + hsl + "]";
	}
	
}
