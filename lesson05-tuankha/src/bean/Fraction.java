package bean;

public class Fraction {
	int numerator;
	int denominator;
	
	public Fraction(double num) {
		this.numerator = Integer.parseInt(Double.toString(num).split("\\.")[0] + Double.toString(num).split("\\.")[1]);
		this.denominator= (int) Math.pow(10, Double.toString(num).split("\\.")[1].length());
			
	}
	
	public void minimal() {
		int gcd = gcd(this.numerator, this.denominator);
		this.numerator = this.numerator / gcd;
		this.denominator = this.denominator / gcd;
	}
	
	
	public int gcd(int a, int b) {
		if(a==b) return a;
		else if (a==0||b==0) return 1;
		else return a > b ? gcd(a-b,b) : gcd(a,b-a);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//return this.numerator + "/" + this.denominator;
		return this.numerator%this.denominator == 0 ? "" + (this.numerator/this.denominator) : this.numerator + "/" + this.denominator;
	}
}
