package view;

import java.util.ArrayList;
import java.util.Scanner;

class Point1 {
	private int x;
	private int y;

	public Point() {

	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point Index [x=" + x + ", y=" + y + "]";
	}

}

public class mgm1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int inputArr[][] = new int[3][3];
        // read array elements row wise.
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                inputArr[i][j] = scan.nextInt();
            }
        }

        // close the scanner
        scan.close();

		ArrayList<Point> listLoca = getZeroLocation(inputArr);
		inputArr = convertMatrix(inputArr, listLoca);
		printf(inputArr);
	}

	private static void printf(int[][] matrixs) {
		for (int i = 0; i < matrixs.length; i++) {
			for (int j = 0; j < matrixs[i].length; j++) {
				System.out.print(matrixs[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static ArrayList<Point> getZeroLocation(int[][] matrixs) {
		ArrayList<Point> listLoca = new ArrayList<>();
		for (int i = 0; i < matrixs.length; i++) {
			for (int j = 0; j < matrixs[i].length; j++) {
				if (matrixs[i][j] == 0) {
					listLoca.add(new Point(i, j));
				}
			}
		}
		return listLoca;
	}

	private static int[][] convertMatrix(int[][] matrixs, ArrayList<Point> listLoca) {
		for (Point point : listLoca) {
			int x = point.getX();
			int y = point.getY();
			for (int i = 0; i < matrixs.length; i++) {
				for (int j = 0; j < matrixs[i].length; j++) {
					if (i == x || j == y) {
						matrixs[i][j] = 0;
					}
				}

			}
		}

		return matrixs;

	}

}
