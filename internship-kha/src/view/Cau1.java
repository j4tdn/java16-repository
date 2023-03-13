package view;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

class JudgePoint implements Comparator<JudgePoint>{
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

public class Cau1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<JudgePoint> listResult = new ArrayList<JudgePoint>();
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			String line = sc.nextLine();
			String[] judge = line.split(" ");
			int length = Integer.parseInt(judge[0]);
			for (int j = 1; j <= length; j++) {
				int id = Integer.parseInt(judge[j]);
				JudgePoint tmp = new JudgePoint(id);

				if (listResult.contains(tmp)) {
					int index = listResult.indexOf(tmp);
					tmp = listResult.get(index);
					tmp.setPoint(tmp.getPoint() + (3 - j + 1));
					Map<Integer, Integer> loca = tmp.getStt();

					if (loca.containsKey(j)) {
						loca.put(j, loca.get(j) + 1);
					} else {
						loca.put(j, 1);
					}

					tmp.setStt(loca);
					listResult.set(index, tmp);
				} else {
					tmp.setPoint((3 - j + 1));
					tmp.getStt().put(j, 1);
					listResult.add(tmp);
				}
			}
		}
		
		
		listResult.sort(Comparator.comparing(JudgePoint::getPoint, Comparator.reverseOrder()).thenComparing(new Comparator<JudgePoint>() {
			@Override
			public int compare(JudgePoint o1, JudgePoint o2) {
				Map<Integer, Integer> map1 = o1.getStt();
				Map<Integer, Integer> map2 = o2.getStt();
				int sum1 = map1.values().stream().mapToInt(Integer::intValue).sum();
				int sum2 = map1.values().stream().mapToInt(Integer::intValue).sum();
				return sum1-sum2;
			}
		}));
	
		int MaxPoint = listResult.get(0).getPoint();
		listResult = listResult.stream().filter(o -> o.getPoint() == MaxPoint).collect(Collectors.toList());
		List<Integer> result = listResult.stream().map(JudgePoint::getId).sorted().collect(Collectors.toList());
		result.forEach(s -> System.out.print(s + " "));
	}
}
