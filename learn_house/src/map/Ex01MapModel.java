package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex01MapModel {
	public static void main(String[] args) {
		Map<Integer, String> vnMotorBikeModel = new HashMap<Integer, String>();
		
		vnMotorBikeModel.put(43, "Da Nang");
		vnMotorBikeModel.put(92, "Quang Nam");
		vnMotorBikeModel.put(49, "Da Lat");
		vnMotorBikeModel.put(75, "Hue");
		
		loopByKey(vnMotorBikeModel);
		loopByValue(vnMotorBikeModel);
		
		
	}
	private static void loopByValue(Map<Integer, String> map) {
		Collection<String> values = map.values();
		
		for (String value : values) {
			System.out.println(value + " ");
		}
		System.out.println();
	}
	
	private static void loopByKey(Map<Integer, String> map) {
		Set<Integer> keyset = map.keySet();
		
		for (Integer key : keyset) {
			System.out.println(key + " ");
		}
		System.out.println();
	}

}
