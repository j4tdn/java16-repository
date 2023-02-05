import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex03 {
    public static void main(String[] args) {
        String a = "aaaddbbccccc";
        Map<Character,Integer> map = new HashMap<>();
        for (int i= 0 ; i< a.length();i++){

            if (map.containsKey(a.charAt(i))){
                map.put(a.charAt(i), map.get(a.charAt(i))+1);//map.get(day[i]))
            }else {
                map.put(a.charAt(i),1);
           }


        }

        System.out.println("========");
        Set set = map.keySet();

        for (Object key : set) {
            if(map.get(key) > 4)

            System.out.println(key + " " + map.get(key));
        }

    }
}
