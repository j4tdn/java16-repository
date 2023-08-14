package view;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import util.FileUtils;

public class NumberHandle {
	private static final String pathnameinput = "text\\input.txt";
	private static final String pathnameoutput = "text\\output.txt";

	public static void main(String[] args) {

		File file = new File(pathnameinput);
		List<String> lines = FileUtils.read(file);
		List<String> linesOutPut = new ArrayList<>();

		for (String line : lines) {
			String[] num = line.trim().split("[a-zA-Z0]+");
			int[] arr = getSortedNumbers(line);
			sortASC(arr);
			linesOutPut.add(line);
			System.out.println();
		}
		
		
		File fileOutPut = new File(pathnameoutput);
		FileUtils.writeLine(fileOutPut, linesOutPut);
	}

	private static int[] getSortedNumbers(String numbers) {
			String[] nums = numbers.split("[a-zA-Z0]+");
			int[] arr = {};
			for (String number : nums) {
				int i = 0;
				arr[i] = Integer.parseInt(number);
				i++;
			}
			return arr;
		}
	
	 public static void sortASC(int [] arr) {
	        int temp = arr[0];
	        for (int i = 0 ; i < arr.length - 1; i++) {
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[i] > arr[j]) {
	                    temp = arr[j];
	                    arr[j] = arr[i];
	                    arr[i] = temp;
	                }
	            }
	        }
	    }
	}
	
