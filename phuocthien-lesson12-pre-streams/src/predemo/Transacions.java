package predemo;

public class Transacions {

	private Trader trader;
	private int year;
	private int value;

	public Transacions(Trader trader, int year, int value) {

		this.trader = trader;
		this.year = year;
		this.value = value;
	}

	public Transacions() {

	}

	@Override
	public String toString() {
		return "Transacions [trader=" + trader + ", year=" + year + ", value=" + value + "]";
	}

	public Trader getTrader() {
		return trader;
	}

	public void setTrader(Trader trader) {
		this.trader = trader;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
