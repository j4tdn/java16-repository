package ex01MissIT;

public class Contestants {
	private Integer Id;
	private Integer Point;
	private Integer f;
	private Integer s;
	private Integer t;

	public Contestants() {
	}

	public Contestants(Integer id, Integer point, Integer f, Integer s, Integer t) {

		Id = id;
		Point = point;
		this.f = f;
		this.s = s;
		this.t = t;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Integer getPoint() {
		return Point;
	}

	public void setPoint(Integer point) {
		Point = point;
	}

	public Integer getF() {
		return f;
	}

	public void setF(Integer f) {
		this.f = f;
	}

	public Integer getS() {
		return s;
	}

	public void setS(Integer s) {
		this.s = s;
	}

	public Integer getT() {
		return t;
	}

	public void setT(Integer t) {
		this.t = t;
	}

	@Override
	public String toString() {
		return "Contestants [Id=" + Id + ", Point=" + Point + ", f=" + f + ", s=" + s + ", t=" + t + "]";
	}

}

