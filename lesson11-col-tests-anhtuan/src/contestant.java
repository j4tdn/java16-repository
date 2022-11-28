
public class contestant {
	private int id;
	private int totalPoint;
	private int stPoint;
	private int ndPoindt;
	private int rdPoint;
	
	public contestant() {
		// TODO Auto-generated constructor stub
	}

	public contestant(int id, int totalPoint, int stPoint, int ndPoindt, int rdPoint) {
		super();
		this.id = id;
		this.totalPoint = totalPoint;
		this.stPoint = stPoint;
		this.ndPoindt = ndPoindt;
		this.rdPoint = rdPoint;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTotalPoint() {
		return totalPoint;
	}

	public void setTotalPoint(int totalPoint) {
		this.totalPoint = totalPoint;
	}

	public int getStPoint() {
		return stPoint;
	}

	public void setStPoint(int stPoint) {
		this.stPoint = stPoint;
	}

	public int getNdPoindt() {
		return ndPoindt;
	}

	public void setNdPoindt(int ndPoindt) {
		this.ndPoindt = ndPoindt;
	}

	public int getRdPoint() {
		return rdPoint;
	}

	public void setRdPoint(int rdPoint) {
		this.rdPoint = rdPoint;
	}

	@Override
	public String toString() {
		return "contestant [id=" + id + ", totalPoint=" + totalPoint + ", stPoint=" + stPoint + ", ndPoindt=" + ndPoindt
				+ ", rdPoint=" + rdPoint + "]";
	}
	

}
