package bean;

import java.util.Objects;

public class Trader {
	private String name;
	private String city;
	
	public Trader() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Trader(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Trader [name=" + name + ", city=" + city + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(city, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trader other = (Trader) obj;
		return Objects.equals(city, other.city) && Objects.equals(name, other.name);
	}
	
	
}
