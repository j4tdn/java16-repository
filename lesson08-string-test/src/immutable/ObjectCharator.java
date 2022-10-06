package immutable;

public class ObjectCharator {
	private int NumberOfUptower;
	private int NumberOfLowtower;
	private int isDigit;
	
	public ObjectCharator(int numberOfUptower, int numberOfLowtower, int isDigit) {
		super();
		NumberOfUptower = numberOfUptower;
		NumberOfLowtower = numberOfLowtower;
		this.isDigit = isDigit;
	}
	public ObjectCharator() {
		// TODO Auto-generated constructor stub
	}
	public int getNumberOfUptower() {
		return NumberOfUptower;
	}
	public void setNumberOfUptower(int numberOfUptower) {
		NumberOfUptower = numberOfUptower;
	}
	public int getNumberOfLowtower() {
		return NumberOfLowtower;
	}
	public void setNumberOfLowtower(int numberOfLowtower) {
		NumberOfLowtower = numberOfLowtower;
	}
	public int getIsDigit() {
		return isDigit;
	}
	public void setIsDigit(int isDigit) {
		this.isDigit = isDigit;
	}
	@Override
	public String toString() {
		return "ObjectCharator [NumberOfUptower=" + NumberOfUptower + ", NumberOfLowtower=" + NumberOfLowtower
				+ ", isDigit=" + isDigit + "]";
	}

}
