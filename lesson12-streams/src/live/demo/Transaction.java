package live.demo;



public class Transaction implements Comparable<Transaction>{
	private Trader trader;
	private Integer value;
	private Integer year;
	
	public Transaction() {
		// TODO Auto-generated constructor stub
	}

	public Transaction(Trader trader, Integer value, Integer year) {
		this.trader = trader;
		this.value = value;
		this.year = year;
	}

	public Trader getTrader() {
		return trader;
	}

	public void setTrader(Trader trader) {
		this.trader = trader;
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
		return "Transaction [trader=" + trader + ", value=" + value + ", year=" + year + "]";
	}

	
	

}
