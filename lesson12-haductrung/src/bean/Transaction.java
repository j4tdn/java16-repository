package bean;


public class Transaction implements Comparable<Transaction>{
	private Trader Trader;
	private Integer value;
	private Integer year;
	
	public Transaction() {
		// TODO Auto-generated constructor stub
	}

	public Transaction(Trader trader, Integer value, Integer year) {
		super();
		Trader = trader;
		this.value = value;
		this.year = year;
	}

	public Trader getTrader() {
		return Trader;
	}

	public void setTrader(Trader trader) {
		Trader = trader;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}
	public int compareTo(Transaction that) {
		Transaction t1 = this;
		Transaction t2 = that;
		return t2.getValue() - t1.getValue();
	}


	@Override
	public String toString() {
		return "Transaction [Trader=" + Trader + ", value=" + value + ", year=" + year + "]";
	}

	
	

}