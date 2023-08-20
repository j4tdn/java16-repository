package test;

import java.io.*;
import java.util.*;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        int n = Integer.parseInt(br.readLine());
        // Luôn code theo style đa hình trong đối tượng
        // List<?> list = new ArrayList<>() e nha
        ArrayList<Integer> allNumbers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            ArrayList<Integer> numbers = extractNumbers(s);
            allNumbers.addAll(numbers);
        }
        br.close();

        Collections.sort(allNumbers);
        BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
        for (int num : allNumbers) {
            bw.write(num + "\n");
        }
        bw.close();
    }

    // Chỗ này cũng ok
    // Nhưng thay vì viết hàm này em có thể lấy s.split("[^0-9]") để cắt lấy số
    // Anway --> Tạm ổn
    public static ArrayList<Integer> extractNumbers(String s) {
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
