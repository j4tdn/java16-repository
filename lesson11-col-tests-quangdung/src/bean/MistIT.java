package bean;

import java.util.Objects;

public class MistIT {
	private Integer id;
	private int sum;
	private int resultOne;
	private int resultTwo;
	private int resultThree;
	
	public MistIT() {
		// TODO Auto-generated constructor stub
	}

	public MistIT(Integer id, int sum, int resultOne, int resultTwo, int resultThree) {
		super();
		this.id = id;
		this.sum = sum;
		this.resultOne = resultOne;
		this.resultTwo = resultTwo;
		this.resultThree = resultThree;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public int getResultOne() {
		return resultOne;
	}

	public void setResultOne(int resultOne) {
		this.resultOne = resultOne;
	}

	public int getResultTwo() {
		return resultTwo;
	}

	public void setResultTwo(int resultTwo) {
		this.resultTwo = resultTwo;
	}

	public int getResultThree() {
		return resultThree;
	}

	public void setResultThree(int resultThree) {
		this.resultThree = resultThree;
	}

	@Override
	public String toString() {
		return "MistIT [id=" + id + ", sum=" + sum + ", resultOne=" + resultOne + ", resultTwo=" + resultTwo
				+ ", resultThree=" + resultThree + "]";
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		
		if(!(o instanceof MistIT)) {
			return false;
		}
		
		MistIT that = (MistIT) o;
		return getId().equals(that.getId());
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
}
