package ex01;
import java.util.Scanner;
import java.util.HashMap;

import java.util.*;

public class Ex01 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 5, 5, 3, 1};

        // Câu 1: Liệt kê các phần tử xuất hiện 1 lần
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for (int num : nums) {
            if (set.contains(num)) {
                set.remove(num);
                System.out.print(num + " ");
            }
        }
        System.out.println();

        // Câu 2: Liệt kê các phần tử xuất hiện nhiều hơn 1 lần
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : map.keySet()) {
            if (map.get(num) > 1) {
                System.out.print(num + " ");
            }
        }
    }
}



