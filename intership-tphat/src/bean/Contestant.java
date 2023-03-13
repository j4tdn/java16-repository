package bean;

import java.util.ArrayList;
import java.util.List;

public class Contestant {
	private int id;
	private List<Integer> score;

	public Contestant() {
	}

	public Contestant(int id) {
		this.id = id;
		score = new ArrayList<Integer>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getScore() {
		int res = 0;
		for (int i = 0; i < score.size(); i++) {
			res += score.get(i);
		}
		return res;
	}

	public int numberOfFirstPosition() {
		int res = 0;
		for (int i = 0; i < score.size(); i++) {
			if (score.get(i) == 3)
				res++;
		}
		return res;
	}

	public int numberOfSecondPosition() {
		int res = 0;
		for (int i = 0; i < score.size(); i++) {
			if (score.get(i) == 2)
				res++;
		}
		return res;
	}

	public void pushScore(int x) {
		score.add(x);
	}
}
