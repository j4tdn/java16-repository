package live.demo;

public class Trader implements Comparable<Trader> {
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
	public int compareTo(Trader o) {
		if(name ==o.name) {
			return 0;}
		else if(name != o.name) {
			return 1;}
		else return -1;
	}
	


	@Override
	public String toString() {
		return "Trader [name=" + name + ", city=" + city + "]";
	}


}
