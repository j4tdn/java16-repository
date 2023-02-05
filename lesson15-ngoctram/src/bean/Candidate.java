package bean;

import java.util.Objects;

public class Candidate {
	private int id;
	private int first;
	private int second;
	private int third;
	private int totalMark;
	
	public Candidate() {
		// TODO Auto-generated constructor stub
	}
	
	public Candidate(int id) {
		this.id = id;
		this.first = 0;
		this.second = 0;
		this.third = 0;
		this.totalMark = 0;
	}

	public Candidate(int id, int first, int second, int third, int totalMark) {
		this.id = id;
		this.first = first;
		this.second = second;
		this.third = third;
		this.totalMark = totalMark;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getTotalMark() {
		return totalMark;
	}

	public void setTotalMark(int totalMark) {
		this.totalMark = totalMark;
	}

	@Override
	public int hashCode() {
		return Objects.hash(first, id, second, third, totalMark);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Candidate other = (Candidate) obj;
		return first == other.first && id == other.id && second == other.second && third == other.third
				&& totalMark == other.totalMark;
	}

	@Override
	public String toString() {
		return "Candidate [id=" + id + ", first=" + first + ", second=" + second + ", third=" + third + ", totalMark="
				+ totalMark + "]";
	}
	
}
