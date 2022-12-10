package predemo;

import java.util.Objects;

import designpatterns.strategy.Apple;

public class Transaction {
	private Trader trader;
	private int year;
	private int value;
	
	public Transaction() {
		// TODO Auto-generated constructor stub
	}
	


	public Transaction(Trader trader, int year, int value) {
		super();
		this.trader = trader;
		this.year = year;
		this.value = value;
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


	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(o instanceof Apple) {
			return false;
		}
		Transaction that = (Transaction)o;
		return getTrader().equals(that.getTrader());
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(getTrader());
	}



	@Override
	public String toString() {
		return "Transaction [trader" + trader + ", year=" + year + ", value=" + value + "]";
	}
	
	

}
