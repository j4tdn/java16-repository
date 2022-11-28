package colection.map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import utils.ColectionUtills;

public class Ex03MapSorting {
    public static void main(String[] args) {
		Map<Integer, String> map = getModel();
		
		sort(map);
		ColectionUtills.printf(map);
	} 
    private static Map<Integer, String> sort(Map<Integer, String> map){
    	Set<Entry<Integer, String>> set = map.entrySet();
    	
    	List<Entry<Integer, String>> list = new LinkedList<>(set);
    	list.sort((e1, e2) -> e1.getValue().compareTo(e2.getValue()));
    	
    	Map<Integer, String > sortedMap = new LinkedHashMap<>();
    	
        for(Entry<Integer, String> entry : list) {
        	sortedMap.put(entry.getKey(), entry.getValue());
        }
		return sortedMap;
    	
    }
    
    private static Map<Integer, String> getModel(){
    	Map<Integer,String> map = new HashMap<>();
    	map.put(92, "Quang Nam");
    	map.put(43, "Da Nang");
    	map.put(59, "Sai Gon");
    	map.put(49, "Da Lat");
    	map.put(75, "Hue");
    	return map;
    }
}
