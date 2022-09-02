package student;

public class Information {
	private int id;
	private String name;
	private float scoreTH;
	private float scoreLT;

	public Information() {
		// TODO Auto-generated constructor stub
	}

	public Information(int id, String name, float scoreTH, float scoreLT) {
		this.id = id;
		this.name = name;
		this.scoreTH = scoreTH;
		this.scoreLT = scoreLT;
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
		return scoreTH;
	}

	public void setScoreTH(float scoreTH) {
		this.scoreTH = scoreTH;
	}

	public float getScoreLT() {
		return scoreLT;
	}

	public void setScoreLT(float scoreLT) {
		this.scoreLT = scoreLT;
	}

	@Override
	public String toString() {
		return "Information [id=" + id + ", name=" + name + ", scoreTH=" + scoreTH + ", scoreLT=" + scoreLT + "]";
	}

}
