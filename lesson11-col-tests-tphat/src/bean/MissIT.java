package bean;

import java.util.Objects;

public class MissIT {
	private int id;
	private int sumPoint;
	private int indexPirst;
	private int indexSecond;
	private int indexThree;

	public MissIT() {

	}

	public MissIT(int id, int sumPoint, int indexPirst, int indexSecond, int indexThree) {
		this.id = id;
		this.sumPoint = sumPoint;
		this.indexPirst = indexPirst;
		this.indexSecond = indexSecond;
		this.indexThree = indexThree;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSumPoint() {
		return sumPoint;
	}

	public void setSumPoint(int sumPoint) {
		this.sumPoint = sumPoint;
	}

	public int getIndexPirst() {
		return indexPirst;
	}

	public void setIndexPirst(int indexPirst) {
		this.indexPirst = indexPirst;
	}

	public int getIndexSecond() {
		return indexSecond;
	}

	public void setIndexSecond(int indexSecond) {
		this.indexSecond = indexSecond;
	}

	public int getIndexThree() {
		return indexThree;
	}

	public void setIndexThree(int indexThree) {
		this.indexThree = indexThree;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof MissIT)) {
			return false;
		}
		MissIT that = (MissIT) o;
		return getId() == (that.getId());
	}

	@Override
	public String toString() {
		return "MissIT [id=" + id + ", sumPoint=" + sumPoint + ", indexPirst=" + indexPirst + ", indexSecond="
				+ indexSecond + ", indexThree=" + indexThree + "]";
	}

}
