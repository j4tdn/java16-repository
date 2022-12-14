package ex02vehicle;

public class Tax {
	private double dt;
	private int value;
	private double taxval;
	
	public Tax() {
	}
	
	public Tax(double dt, int value, double taxval) {
		this.dt = dt;
		this.value = value;
		this.taxval = taxval;
	}

	public double getDt() {
		return dt;
	}

	public void setDt(double dt) {
		this.dt = dt;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public double getTaxval() {
		return taxval;
	}

	public void setTaxval(double taxval) {
		this.taxval = taxval;
	}

	@Override
	public String toString() {
		return "Tax [dt=" + dt + ", value=" + value + ", taxval=" + taxval + "]";
	}

	public double taxmul() {
		double mul = 1;
		if(dt < 100) {
			mul = value * 0.01;
		} else if (dt >= 100 && dt <= 200){
			mul = value * 0.03;
		} else  {
			mul = value * 0.05;
		}
		return mul;
		
	}
	
}
