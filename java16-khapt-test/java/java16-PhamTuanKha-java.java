package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("src\\input.txt"));
        int n = Integer.parseInt(reader.readLine().trim());
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String tmp = reader.readLine().trim();
            strings.add(tmp);
        }
        List<Integer> allNumbers = new ArrayList<>();
        for (String string : strings) {
            List<Integer> numbers = extractNumbers(string);
            allNumbers.addAll(numbers);
        }
        List<Integer> extractNumbers = new ArrayList<>(allNumbers);
        extractNumbers.sort(Integer::compareTo);
        BufferedWriter writer = new BufferedWriter(new FileWriter("src\\output.txt"));
        for (int number : extractNumbers) {
            writer.write(number + "\n");
        }
        writer.close();
    }

    public static List<Integer> extractNumbers(String s) {
        ArrayList<Integer> numbers = new ArrayList<>();
        StringBuilder currentNumber = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                currentNumber.append(c);
            } else if (currentNumber.length() > 0) {
                numbers.add(Integer.parseInt(currentNumber.toString()));
                currentNumber = new StringBuilder();
            }
        }
        if (currentNumber.length() > 0) {
            numbers.add(Integer.parseInt(currentNumber.toString()));
        }
        return numbers;
    }
}