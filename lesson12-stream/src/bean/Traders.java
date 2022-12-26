package bean;

import java.util.ArrayList;
import java.util.List;

import predit.Trader;

public class Traders {
	private String name;
	private String city;
	
	public Traders(String name, String city) {
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
		return "Trader: name=" + name + ", city=" + city +"\n";
	}
}
