package lesson23AnhTuan;


import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	 try {
    		 
             File file = new File("input.txt");
             FileWriter fw = new FileWriter("input.txt");
             fw.write("01a2b3456cde478");
             fw.close();
             if (file.createNewFile()) {
                 System.out.println("File is created!");
             } else {
                 System.out.println("File already exists.");
             }
  
         } catch (IOException e) {
             e.printStackTrace();
         }

        // Đọc dữ liệu từ file input.txt
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        int n = Integer.parseInt(br.readLine());
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = br.readLine();
        }
        br.close();

        // Tạo danh sách các số từ các xâu đã cho
        List<Integer> numbers = new ArrayList<>();
        for (String s : strings) {
            String[] parts = s.split("\\D+"); // Tách 
            for (String part : parts) {
                if (!part.equals("")) {
                    numbers.add(Integer.parseInt(part));
                }
            }
        }

        // Sắp xếp danh sách số
        Collections.sort(numbers);

        // Ghi kết quả vào file output.txt
        PrintWriter pw = new PrintWriter(new FileWriter("output.txt"));
        for (int num : numbers) {
            pw.println(num);
        }
        pw.close();
    }
}



