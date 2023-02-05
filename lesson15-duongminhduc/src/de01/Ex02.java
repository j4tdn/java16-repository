
package de01;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Ex02{


    static void characterCount(String input)
    {
        HashMap<Character, Integer> eachCharCountMap = new HashMap<Character, Integer>();
 
        char[] charArray = input.toCharArray();



        for (char c : charArray)
        {
            if(eachCharCountMap.containsKey(c))
            {
      
                eachCharCountMap.put(c, eachCharCountMap.get(c)+1);
            }
            else
            {            

                eachCharCountMap.put(c, 1);
            }
        }
        int maxkey = getMaxKey(eachCharCountMap).getValue();
        List<Character> result = eachCharCountMap.entrySet()
        		.stream().filter(a -> a.getValue().equals(maxkey)).map(Map.Entry::getKey).collect(Collectors.toList());
        result.forEach(System.out::print);
    
    }
   
    public static <K extends Comparable<K>, V> Map.Entry<K, V>getMaxKey(Map<K, V> map)
    {
        Map.Entry<K, V> entryWithMaxKey = null;
 
        for (Map.Entry<K, V> currentEntry : map.entrySet()) {
 
            if ( entryWithMaxKey == null  || currentEntry.getKey().compareTo(entryWithMaxKey.getKey()) < 0) {
 
                entryWithMaxKey = currentEntry;
            }
        }
 
        return entryWithMaxKey;
    }
 
    public static void main(String[] args) {
       characterCount("aaaaccdcffc");
       
       
    }
    
}