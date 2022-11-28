package missit;

public class contestant {
	private int id;
	private int point;
	private int first;
	private int second;
	private int third;
	
	public contestant() {
		// TODO Auto-generated constructor stub
	}	
	
	public contestant(int id, int point, int first, int second, int third) {
		super();
		this.id = id;
		this.point = point;
		this.first = first;
		this.second = second;
		this.third = third;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public int getFirst() {
		return first;
	}

	public void setFirst(int first) {
		this.first = first;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public int getThird() {
		return third;
	}

	public void setThird(int third) {
		this.third = third;
	}

	@Override
	public String toString() {
		return "contestant [id=" + id + ", point=" + point + ", first=" + first + ", second=" + second + ", third="
				+ third + "]";
	}
	
}
