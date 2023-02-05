import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex01 {
    public static void main(String[] args) {
        int[] day ={1,2,4,5,4,7,5,8};
        Map<Integer,Integer> map = new HashMap<>();
        for (int i= 0 ; i< day.length;i++){

            if (map.containsKey(day[i])){
                map.put(day[i], 2);//map.get(day[i]))
            }else {
                map.put(day[i],1);
            }
        }
//
        System.out.println(" cac phan tu xuat hieen 1 lan");
        Set set = map.keySet();
        for (Object key : set) {
            if(map.get(key) == 1)
            System.out.println(key);
        }
        System.out.println(" cac phan tu xuat hieen nhieu lan");
        Set set2 = map.keySet();
        for (Object key : set2) {
            if(map.get(key) > 1)
                System.out.println(key);
        }
    }
}
