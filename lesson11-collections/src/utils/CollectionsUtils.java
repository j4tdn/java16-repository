package utils;

import java.util.List;
import java.util.Map;
import java.util.Set;

import bean.Employee;

import java.util.Map.Entry;

public class CollectionsUtils {

	private CollectionsUtils() {

	}

	public static void printf(Map<Integer, String> map) {

		Set<Entry<Integer, String>> entries = map.entrySet();
		for (Entry<Integer, String> entry : entries) {

			System.out.println(entry.getKey() + " --> " + entry.getValue());
		}
	}
}
