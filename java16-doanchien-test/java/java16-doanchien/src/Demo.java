import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Tốt
// Nhớ tạo class phải đặt trong package

public class Demo {
	public static void main(String[] args) {
		try {
            // Đọc dữ liệu từ file input.txt
            BufferedReader reader = new BufferedReader(new FileReader("src/input.txt"));
            int n = Integer.parseInt(reader.readLine());
            System.out.println(n);
            List<String> strings = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                strings.add(reader.readLine());
            }
            reader.close();

            // Trích xuất và sắp xếp các số từ xâu
            List<Integer> numbers = result(strings);

            // Ghi dãy số đã sắp xếp vào file output.txt
            BufferedWriter writer = new BufferedWriter(new FileWriter("src/output.txt"));
            for (int number : numbers) {
                writer.write(String.valueOf(number));
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	 private static List<Integer> result(List<String> strings) {
	        List<Integer> numbers = new ArrayList<>();
	        for (String str : strings) {
	            String[] numberAsStr = str.split("[^0-9]+");
	            for (String number : numberAsStr) {
	                try {
	                    Integer value = Integer.parseInt(number);
	                    numbers.add(value);
	                } catch (Exception e) {
                        // Chỗ này bị exception vì có trường hợp ví dụ
                        // "abb56nn5" --> cắt abb đầu tiên phía bên trái sẽ return chuỗi rỗng
                        // mà chuỗi rỗng thì ko thể Integer.parseInt được
                        // Để sửa thì e có thể if thêm phát như phía dưới chứ k cần try catch

                        /*
                         for (String number : numberAsStr) {
                            if (!number.isEmpty()) {
                                numbers.add(Integer.parseInt(number));
                            }
                         } 

                         */

                    }
	            }
	        }
	        System.out.println(numbers);
	        Collections.sort(numbers);
	        System.out.println(numbers);
	        return numbers;
	    }
}
