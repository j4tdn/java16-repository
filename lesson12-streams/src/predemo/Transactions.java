package predemo;

import java.util.Objects;

import designpatterns.strategy.Apple;

public class Transactions {
	private Trader trader;
	private int year;
	private int value;

	public Transactions() {
	}

	public Transactions(Trader trader, int year, int value) {
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
	public String toString() {
		return "Transactions [trader=" + trader + ", year=" + year + ", value=" + value + "]";
	}

}
