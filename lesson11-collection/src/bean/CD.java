package bean;

public class CD {
	private int idCD;
	private String nameCD;
	private String singer;
	private int numberOfSong;
	private double price;
	
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
        if(! (o instanceof CD)) return false;
        CD that = (CD)o;
        return this.getidCD() == that.getidCD();
	}
	public int getidCD() {
		return idCD;
	}
	public CD withidCD(int idCD) {
		this.idCD = idCD;
		return this;
	}
	public String getnameCD() {
		return nameCD;
	}
	public CD withnameCD(String nameCD) {
		this.nameCD = nameCD;
		return this;
	}
	public String getsinger() {
		return singer;
	}
	public CD withsinger(String singer) {
		
		this.singer = singer;
		return this;
	}
	public int getnumberOfSong() {
		return numberOfSong;
	}
	public CD withnumberOfSong(int numberOfSong) {
		this.numberOfSong = numberOfSong;
		return this;
	}
	public double getPrice() {
		return price;
	}
	public CD withPrice(double price) {
		this.price = price;
		return this;
	}
	@Override
	public String toString() {
		return "CD [idCD=" + idCD + ", nameCD=" + nameCD + ", singer=" + singer + ", numberOfSong=" + numberOfSong
				+ ", price=" + price + "]" + "\n";
	}
	

}