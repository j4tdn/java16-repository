package view;

import java.util.Arrays;

public class Ex08ReverseString {
public static void main(String[] args) {
	String a = "Today is rain";
	String[] b = a.split(" ");
	System.out.println(Arrays.toString(b));
	String c = "";
	for (int i = b.length - 1; i >= 0; i--) {
		c = c + b[i] + " ";
	}
	System.out.println(c);
}
}
