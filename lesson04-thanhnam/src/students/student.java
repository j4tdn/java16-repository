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

	public float getTH() {
		return TH;
	}

	public void setTH(float TH) {
		this.TH = TH;
	}

	public float getLT() {
		return LT;
	}

	public void setLT(float LT) {
		this.LT = LT;
	}

	@Override
	public String toString() {
		return "Information [id=" + id + ", name=" + name + ", scoreTH=" + TH + ", scoreLT=" + LT + "]";
	}
}
