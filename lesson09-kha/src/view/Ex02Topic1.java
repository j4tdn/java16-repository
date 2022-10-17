package view;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex02Topic1 {
	public static void main(String[] args) {
		String s = "ddasf2132dsfsdaas43dsfsf321";
		String s1 = "asd23213123123ddasf2132dsfsdaas43dsfsf321";
		String s2 = "2312321321323edffdsdda343243sf2132dsfsdaas43dsfsf321";
		String s3 = "dd3431asf2132dsrefsdadsfdsfas43dsfsf3232211";
		String s4 = "asdasdasdsaeweqwedsaqwe";
		String s5 = "234546766";
		String s6 = "";
		
		Arrays.asList(getLargestNumbers(s,s1,s2,s3,s4,s5,s6)).forEach(System.out::println);;
	}

	private static String[] getLargestNumbers(String... s) {
		String results[] = new String[s.length];
		for (int k = 0; k < s.length; k++) {
			String numberAsText[] = Arrays.asList(s[k].split("[A-Za-z]+")).stream().filter(o -> !o.equals(""))
					.toArray(String[]::new);
			if(numberAsText.length > 0) {
				System.out.println(Arrays.toString(numberAsText));
				BigInteger numbers[] = new BigInteger[numberAsText.length];
				for (int i = 0; i < numberAsText.length; i++) {
					numbers[i] = new BigInteger(numberAsText[i]);
				}
				List<BigInteger> tmp = new ArrayList<>();
				tmp = Arrays.asList(numbers);
				tmp.sort((o1, o2) -> (o1.compareTo(o2)));
				results[k] = tmp.get(tmp.size()-1).toString();
			}else {
				results[k] = "0";
			}
		}
		System.out.println();
		return results;
	}
}
