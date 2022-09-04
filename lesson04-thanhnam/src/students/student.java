package students;

public class student {
	private int id;
	private String name;
	private float TH;
	private float LT;

	public student() {
	}

	public student(int id, String name, float TH, float LT) {
		this.id = id;
		this.name = name;
		this.TH = TH;
		this.LT = LT;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getScoreTH() {
		return TH;
	}

	public void setScoreTH(float scoreTH) {
		this.TH = TH;
	}

	public float getScoreLT() {
		return LT;
	}

	public void setScoreLT(float scoreLT) {
		this.LT = LT;
	}

	@Override
	public String toString() {
		return "Information [id=" + id + ", name=" + name + ", scoreTH=" + TH + ", scoreLT=" + LT + "]";
	}
}
