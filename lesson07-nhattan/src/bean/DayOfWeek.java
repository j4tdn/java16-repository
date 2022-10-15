package bean;

public enum DayOfWeek {
	SUNDAY(1),
	MONDAY(2), 
	TUESDAY(3), 
	WEDNESDAY(4), 
	THURSDAY(5), 
	FRIDAY(6), 
	SATURDAY(7);
	
	private int value;
	
	private DayOfWeek(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
}
