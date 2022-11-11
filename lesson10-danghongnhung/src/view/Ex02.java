package view;

import java.util.ArrayList;

import bean.Point;

public class Ex02 {
	public static void main(String[] args) {
		// int[][] matrixs = {{1,2,3,4}, {5,6,7,8}, {1,9,0,9}, {2,9,6,5}, {1,2,4,5}};
		int[][] matrixs = { { 1, 2, 3, 4 }, { 5, 0, 8, 7 }, { 1, 9, 0, 9 }, { 2, 0, 6, 5 }, { 1, 2, 4, 5 } };

		printf(matrixs);
		ArrayList<Point> listLoca = getZeroLocation(matrixs);
		System.out.println(listLoca);
		matrixs = convertMatrix(matrixs, listLoca);
		printf(matrixs);
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
	
	private static int[][] convertMatrix(int[][] matrixs, ArrayList<Point> listLoca){
		for(Point point : listLoca) {
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
