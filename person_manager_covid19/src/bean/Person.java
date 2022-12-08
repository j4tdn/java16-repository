package bean;

import java.util.Date;

public class Person {
	private int id;
	private String name;
	private String date;
	private String firtDate;
	private String idPhong;
	private boolean tinhtrang;
	private int songaycachly;
	
	
	
	
	private Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(int id, String name, String string, String string2, String idPhong, boolean tinhtrang, int songaycachly) {
		super();
		this.id = id;
		this.name = name;
		this.date = string;
		this.firtDate = string2;
		this.idPhong = idPhong;
		this.tinhtrang = tinhtrang;
		this.songaycachly = songaycachly;
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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getFirtDate() {
		return firtDate;
	}

	public void setFirtDate(String firtDate) {
		this.firtDate = firtDate;
	}

	public String getIdPhong() {
		return idPhong;
	}

	public void setIdPhong(String idPhong) {
		this.idPhong = idPhong;
	}

	public boolean isTinhtrang() {
		return tinhtrang;
	}

	public void setTinhtrang(boolean tinhtrang) {
		this.tinhtrang = tinhtrang;
	}

	public int getSongaycachly() {
		return songaycachly;
	}

	public void setSongaycachly(int songaycachly) {
		this.songaycachly = songaycachly;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", date=" + date + ", firtDate=" + firtDate + ", idPhong="
				+ idPhong + ", tinhtrang=" + tinhtrang + ", songaycachly=" + songaycachly + "]" + "\n";
	}

	
	
	
	

}
