package bean;

import java.util.Objects;

public class contestants {
	private Integer Id;
	private Integer totalpoint;
	private Integer first;
	private Integer second;
	private Integer third;
	
	public contestants() {
	}

	public contestants(Integer id, Integer totalpoint, Integer first, Integer second, Integer third) {
		super();
		Id = id;
		this.totalpoint = totalpoint;
		this.first = first;
		this.second = second;
		this.third = third;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Integer getTotalpoint() {
		return totalpoint;
	}

	public void setTotalpoint(Integer totalpoint) {
		this.totalpoint = totalpoint;
	}

	public Integer getFirst() {
		return first;
	}

	public void setFirst(Integer first) {
		this.first = first;
	}

	public Integer getSecond() {
		return second;
	}

	public void setSecond(Integer second) {
		this.second = second;
	}

	public Integer getThird() {
		return third;
	}

	public void setThird(Integer third) {
		this.third = third;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Id, first, second, third, totalpoint);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		contestants other = (contestants) obj;
		return Objects.equals(Id, other.Id) && Objects.equals(first, other.first)
				&& Objects.equals(second, other.second) && Objects.equals(third, other.third)
				&& Objects.equals(totalpoint, other.totalpoint);
	}

	@Override
	public String toString() {
		return "contestants [Id=" + Id + ", totalpoint=" + totalpoint + ", first=" + first + ", second=" + second
				+ ", third=" + third + "]";
	}
	

}
