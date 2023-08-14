package test;

import java.io.*;
import java.util.*;

public class XauKiTu {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\TIENTHU\\Documents\\input.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\TIENTHU\\Documents\\output.txt"));
            
            int n = Integer.parseInt(br.readLine());
            List<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                String s = br.readLine();
                int num = 0;
                boolean isNumber = false;
                for (int j = 0; j < s.length(); j++) {
                    char c = s.charAt(j);
                    if (Character.isDigit(c)) {
                        num = num * 10 + (c - '0');
                        isNumber = true;
                    } else if (isNumber) {
                        numbers.add(num);
                        num = 0;
                        isNumber = false;
                    }
                }
                if (isNumber) {
                    numbers.add(num);
                }
            }
            
            br.close();

            Collections.sort(numbers);
            
            for (int num : numbers) {
                bw.write(num + "\n");
            }
            
            bw.close();
            System.out.println("Thanh cong !");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
