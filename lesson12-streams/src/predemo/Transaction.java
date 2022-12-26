package predemo;

public class Transaction {
	private Trader Trader;
	private double year;
	private double value;
	
	public Transaction() {
		// TODO Auto-generated constructor stub
	}

	public Transaction(predemo.Trader trader, double year, double value) {
		super();
		Trader = trader;
		this.year = year;
		this.value = value;
	}

	public Trader getTrader() {
		return Trader;
	}

	public void setTrader(Trader trader) {
		Trader = trader;
	}

	public double getYear() {
		return year;
	}

	public void setYear(double year) {
		this.year = year;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Transaction [Trader=" + Trader + ", year=" + year + ", value=" + value + "]";
	}

	
	
	
}