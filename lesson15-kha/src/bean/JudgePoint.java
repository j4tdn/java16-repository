package bean;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class JudgePoint implements Comparator<JudgePoint>{
	private Integer id;
	private Integer point = 0;
	private Map<Integer, Integer> stt;
	
	public JudgePoint(int id) {
		this.id = id;
		stt = new TreeMap<Integer, Integer>(Comparator.comparing(Integer::intValue));
	}
	
	

	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public Integer getPoint() {
		return point;
	}



	public void setPoint(Integer point) {
		this.point = point;
	}



	public Map<Integer, Integer> getStt() {
		return stt;
	}



	public void setStt(Map<Integer, Integer> stt) {
		this.stt = stt;
	}



	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JudgePoint other = (JudgePoint) obj;
		return Objects.equals(id, other.id);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + " " + point  + " " + stt.toString() + "\n";
	}



	@Override
	public int compare(JudgePoint o1, JudgePoint o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
}
