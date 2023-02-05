package model;

public class Transaction implements Comparable<Transaction> {
	private Trader Trader;
	private Integer year;
	private Integer value;

	public Transaction() {
		// TODO Auto-generated constructor stub
	}

	public Trader getTrader() {
		return Trader;
	}

	public void setTrader(Trader trader) {
		Trader = trader;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public Transaction(model.Trader trader, Integer year, Integer value) {
		super();
		Trader = trader;
		this.year = year;
		this.value = value;
	}

	public int compareTo(Transaction that) {
		Transaction t1 = this;
		Transaction t2 = that;
		return t2.getValue() - t1.getValue();
	}

	@Override
	public String toString() {
		return "Transaction [Trader=" + Trader + ", year=" + year + ", value=" + value + "]";
	}

}
