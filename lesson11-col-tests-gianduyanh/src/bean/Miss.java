package bean;

public class Miss {
	private String name;
	private int point;
	private int st;
	private int nd;
	private int rd;
	public Miss() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public int getSt() {
		return st;
	}
	public void setSt(int st) {
		this.st = st;
	}
	public int getNd() {
		return nd;
	}
	public void setNd(int nd) {
		this.nd = nd;
	}
	public int getRd() {
		return rd;
	}
	public void setRd(int rd) {
		this.rd = rd;
	}
	public Miss(String name, int point, int st, int nd, int rd) {
		super();
		this.name = name;
		this.point = point;
		this.st = st;
		this.nd = nd;
		this.rd = rd;
	}
	@Override
	public String toString() {
		return "Miss [name=" + name + ", point=" + point + ", st=" + st + ", nd=" + nd + ", rd=" + rd + "]";
	}
	

}
