package collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex05LinkedList {
	static final int COUNT = 50000;
	public static void main(String[] args) {
		List<String> digits = new ArrayList<>();
		List<String> numbers = new LinkedList<>();
		// Add
        long start = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
        	digits.add("element # " + i);
        }
        System.out.println("Add " + COUNT + " elements: ArrayList took "
                + (System.currentTimeMillis() - start) + "ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
        	numbers.add("element # " + i);
        }
        System.out.println("Add " + COUNT + " elements: LikedList took "
                + (System.currentTimeMillis() - start) + "ms");

        // Add at index: 0 1000 40000
        for (int i = 0; i < COUNT; i++) {
        	digits.add(0, "element # " + i);
        }
        System.out.println("Add at index 0: " + COUNT
                + " elements: ArrayList took "
                + (System.currentTimeMillis() - start) + "ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
        	numbers.add(0, "element # " + i);
        }
        System.out.println("Add at index 0: " + COUNT
                + " elements: LinkedList took "
                + (System.currentTimeMillis() - start) + "ms");

        // Get
        start = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
        	digits.get(i);
        }
        System.out.println("Get element: ArrayList took "
                + (System.currentTimeMillis() - start) + "ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
        	numbers.get(i);
        }
        System.out.println("Get element: LinkedList took "
                + (System.currentTimeMillis() - start) + "ms");

        // Update
        start = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
        	digits.set(i, "modified element # " + i);
        }
        System.out.println("Update element: ArrayList took "
                + (System.currentTimeMillis() - start) + "ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
        	numbers.set(i, "modified element # " + i);
        }
        System.out.println("Update element: LinkedList took "
                + (System.currentTimeMillis() - start) + "ms");

        // Remove
        start = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
        	digits.remove(0);
        }
        System.out.println("Remove element: ArrayList took "
                + (System.currentTimeMillis() - start) + "ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
        	numbers.remove(0);
        }
        System.out.println("Remove element: LinkedList took "
                + (System.currentTimeMillis() - start) + "ms");

	}
}
