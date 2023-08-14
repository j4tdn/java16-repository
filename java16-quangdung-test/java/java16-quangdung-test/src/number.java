
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class number {
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("src/input.txt"));
			int n = Integer.parseInt(reader.readLine());
			List<String> strings = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				strings.add(reader.readLine());
			}
			reader.close();

			List<Integer> numbers = resultAfterSort(strings);

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

	private static List<Integer> resultAfterSort(List<String> strings) {
		List<Integer> numbers = new ArrayList<>();
		for (String str : strings) {
			String[] numberAsStr = str.split("[^0-9]+");
			for (String number : numberAsStr) {
				try {
					Integer value = Integer.parseInt(number);
					numbers.add(value);
				} catch (Exception e) {
				}
			}
		}
		Collections.sort(numbers);
		System.out.println(numbers);
		return numbers;
	}
}
