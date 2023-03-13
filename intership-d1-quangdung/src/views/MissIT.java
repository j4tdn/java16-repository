package views;

import java.util.HashMap;
import java.util.Scanner;

import bean.DataModel;

public class MissIT {

	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		printMissIt();
	}

	private static void printMissIt() {
		System.out.print("Enter N: ");
		int n = Integer.parseInt(ip.nextLine());
		System.out.println("Enter list Miss IT");
		int[][] numbers = input(n);
		print(numbers);
		HashMap<Integer, DataModel> contestants = new HashMap<Integer, DataModel>();
		for (int i = 0; i < n; i++) {
			int row = numbers[i][0];
			for (int j = 1; j <= row; i++) {
				DataModel tmp = new DataModel(numbers[i][j], 0, 0, 0);
				if (!contestants.containsKey(tmp.getId())) {
					contestants.put(tmp.getId(), tmp);
				}
				DataModel tpmDataModel = contestants.get(numbers[i][j]);
				switch (j) {
				case 1:
					tpmDataModel.setFirstPlaceCounter(tpmDataModel.getFirstPlaceCounter() + 1);
					break;
				case 2:
					tpmDataModel.setSecondPlaceCounter(tpmDataModel.getSecondPlaceCounter() + 1);
					break;
				case 3:
					tpmDataModel.setThirdPlaceCounter(tpmDataModel.getThirdPlaceCounter() + 1);
					break;
				default:
					break;
				}
			}
		}

	}

	private static int[][] input(int n) {
		int[][] result = new int[n][4];
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i][0]; j++) {
				result[i][j] = Integer.parseInt(ip.nextLine());
			}
		}
		return result;
	}

	private static void print(int[][] input) {
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(input[i][j] + " ");
			}
			System.out.println();
		}
	}

}
