package bean;

import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class Judge implements Comparator<Judge> {
	private int id;
	private int point = 0;
	private Map<Integer, Integer> stt;

	public Judge(int id) {
		this.id = id;
		stt = new TreeMap<Integer, Integer>(Comparator.comparing(Integer::intValue));
	}

	public Judge(int id, int point) {
		super();
		this.id = id;
		this.point = point;
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

	public Map<Integer, Integer> getStt() {
		return stt;
	}

	public void setStt(Map<Integer, Integer> stt) {
		this.stt = stt;
	}

	@Override
	public int compare(Judge o1, Judge o2) {
		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Judge other = (Judge) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Jugde [id=" + id + ", point=" + point + ", stt=" + stt + "]";
	}
}
