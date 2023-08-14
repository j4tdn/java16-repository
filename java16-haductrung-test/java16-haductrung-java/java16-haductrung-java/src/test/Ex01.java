package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Ex01 {
	public static void main(String[] args) {
        String inputFilePath = "D:\\Java16\\5. FrontEnd\\java16-haductrung-test\\java16-haductrung-java\\java16-haductrung-java\\input.txt";
        String outputFilePath = "D:\\Java16\\5. FrontEnd\\java16-haductrung-test\\java16-haductrung-java\\java16-haductrung-java\\output.txt";
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
            StringBuilder inputBuilder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                inputBuilder.append(line);
            }
            reader.close();
            
            String input = inputBuilder.toString();
            
            List<Integer> result = extractNumbers(input);
            
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));
            
            for (Integer number : result) {
                writer.write(number.toString());
                writer.newLine();
            }
            
            writer.close();
            
            System.out.println("successful " + outputFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
    public static List<Integer> extractNumbers(String input) {
        List<Integer> numbers = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            String numberString = matcher.group();
            int maxNumber = findMaxNumber(numberString);
            numbers.add(maxNumber);
        }
        Collections.sort(numbers);
        numbers.removeIf(num -> num == 0);
        
        return numbers;
    }
    
    private static int findMaxNumber(String numberString) {
    	Pattern pattern = Pattern.compile("\\D+");
		List<Integer> numbers = pattern.splitAsStream(numberString)
                					   .filter(s -> !s.isEmpty())
                					   .map(Integer::parseInt)
                					   .collect(Collectors.toList());
		return Collections.max(numbers);
    }
    
   
}