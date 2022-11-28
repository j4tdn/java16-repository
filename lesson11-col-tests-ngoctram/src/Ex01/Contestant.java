package Ex01;

public class Contestant implements Comparable<Contestant>{
	private int id;
	private int firstTimes;
	private int secondTimes;
	private int thirdTimes;
	private int score;
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public Contestant(int id, int firstTimes, int secondTimes, int thirdTimes, int score) {
		this.id = id;
		this.firstTimes = firstTimes;
		this.secondTimes = secondTimes;
		this.thirdTimes = thirdTimes;
		this.score = score;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getFirstTimes() {
		return firstTimes;
	}
	public void setFirstTimes(int firstTimes) {
		this.firstTimes = firstTimes;
	}
	public int getSecondTimes() {
		return secondTimes;
	}
	public void setSecondTimes(int secondTimes) {
		this.secondTimes = secondTimes;
	}
	public int getThirdTimes() {
		return thirdTimes;
	}
	public void setThirdTimes(int thirdTimes) {
		this.thirdTimes = thirdTimes;
	}
	@Override
	public int compareTo(Contestant o2) {
		Contestant o1 = this;
		if (o1.getScore() > o2.getScore()) return 1;
		else if (o1.getScore() > o2.getScore()) return -1;
		else {
			if  ((o1.getFirstTimes()+o1.getSecondTimes()) > (o2.getFirstTimes()+o2.getSecondTimes())) {
				return 1;
			}
			else if  ((o1.getFirstTimes()+o1.getSecondTimes()) < (o2.getFirstTimes()+o2.getSecondTimes())) {
				return -1;
			}
			else return 0;
		}
	}
	@Override
	public String toString() {
		return "Contestant [id=" + id + ", firstTimes=" + firstTimes + ", secondTimes=" + secondTimes + ", thirdTimes="
				+ thirdTimes + ", score=" + score + "]";
	}
	
}
