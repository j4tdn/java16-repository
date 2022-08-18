package view;

import java.util.Random;
import java.util.Scanner;

import bean.MinMaxOfMatrix;
import bean.Point;
import bean.PointOfMatrix;

public class Ex03 {
	public static void main(String[] args) {
		//int[][] matrix = {{47,47,36,47}, {23,43,31,47}, {23,47,31,47}, {46,7,29,47}};
		//int[][] matrix = {{10,10}, {1,1}};
		//int[][] matrix = {{2,1}, {23,3}};
		
		int[][] matrix = createRandomArray();
		printMatrix(matrix);
		matrix = normalizeMatrix(matrix);
		
		System.out.println("=========================================");
		isHaveSaddlePoint(matrix);
		System.out.println("=========================================");
		for (Point point : getAllSaddlePoint(matrix)) {
			System.out.print(point + " | ");
		}		
	}
	
	private static int[][] createRandomArray(){
		int row = 0 ,col = 0;
		Random rd = new Random();
		// Create random matrix from [1-99]
		Scanner ip = new Scanner(System.in);
		String rowAsText = "";
		do{
			System.out.print("Nhập vào số hàng : ");
			rowAsText = ip.nextLine();
		}while(!rowAsText.matches("\\d+"));
		row =  Integer.parseInt(rowAsText);

		String colAsText = "";
		do{
			System.out.print("Nhập vào số cột : ");
			colAsText = ip.nextLine();
		}while(!rowAsText.matches("\\d+"));
		col =  Integer.parseInt(colAsText);

		int[][] matrix = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrix[i][j] = rd.nextInt(99) + 1;
			}
		}
		return matrix;
	}
	
	private static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static int[][] normalizeMatrix(int[][] matrix){
		int row = matrix.length;
		int col = matrix[0].length;
		if(row < col) {
			row += col-row;
			int[][] tmp = new int[row][col];
			for (int i = 0; i < tmp.length; i++) {
				for (int j = 0; j < tmp[i].length; j++) {
					
					if(i > matrix.length-1) {
						tmp[i][j] = 0;
					}
					else
						tmp[i][j] = matrix[i][j];
				}
			}
			return tmp;
		}else if(row > col) {
			col += row-col;
			int[][] tmp = new int[row][col];
			for (int i = 0; i < tmp.length; i++) {
				for (int j = 0; j < tmp[i].length; j++) {
					
					if(j > matrix[0].length-1) {
						tmp[i][j] = 100;
					}
					else
						tmp[i][j] = matrix[i][j];
				}
			}
			return tmp;
		}else {
			return matrix;
		}
	}
	
	public static MinMaxOfMatrix getMinMaxSaddlePoint(int[][] matrix) {
		PointOfMatrix maxPoint = new PointOfMatrix();
		PointOfMatrix minPoint = new PointOfMatrix();
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < matrix.length; i++) {
			PointOfMatrix minArr = new PointOfMatrix();
			PointOfMatrix maxArr = new PointOfMatrix();
			min = Integer.MAX_VALUE;
			max = Integer.MIN_VALUE;
			for (int j = 0; j < matrix[i].length; j++) {
				//a[i][j]
				if(matrix[i][j]<min) {
					minArr = new PointOfMatrix();
					minArr.addPoint(new Point(i, j, matrix[i][j]));
					min = matrix[i][j];
				}
				else if(matrix[i][j] == min) {
					minArr.addPoint(new Point(i, j, matrix[i][j]));
				}
				
				//a[j][i]
				if(matrix[j][i]>max) {
					maxArr = new PointOfMatrix();
					maxArr.addPoint(new Point(j, i, matrix[j][i]));
					max = matrix[j][i];
				}
				else if(matrix[j][i] == max) {
					maxArr.addPoint(new Point(j, i, matrix[j][i]));
				}
			}
			maxPoint.addListPoints(maxArr.listpoints);
			minPoint.addListPoints(minArr.listpoints);
		}
//		for (Point point : minPoint.listpoints) {
//			System.out.println(point);
//		}
//		System.out.println("+============");
//		for (Point point : maxPoint.listpoints) {
//			System.out.println(point);
//		}
		return new MinMaxOfMatrix(maxPoint, minPoint);
		
	}
	
	public static void isHaveSaddlePoint(int[][] matrix) {
		MinMaxOfMatrix listP = getMinMaxSaddlePoint(matrix);
		if(listP.maxpoints.isContain(listP.minpoints.listpoints)) {
			System.out.printf("%20s","YES");
			System.out.println();
		}else {
			System.out.printf("%20s","NO");
			System.out.println();
		}
	}
	
	public static Point[] addArray(Point[] array, Point val) {
		Point[] tmp = new Point[array.length+1];
		for (int i = 0; i < array.length; i++) {
			tmp[i] = array[i];
		}
		tmp[tmp.length-1] = val;
		return tmp;
	}
	
	public static Point[] getAllSaddlePoint(int[][] matrix) {
		Point[] rs = new Point[0];
		MinMaxOfMatrix listP = getMinMaxSaddlePoint(matrix);
		for (Point p : listP.maxpoints.listpoints) {
			for (Point p1 : listP.minpoints.listpoints) {
				if(p.x == p1.x && p.y == p1.y && p1.value == p.value) {
					rs = addArray(rs, p);
				}
			}
		}
		return rs;
	}
}
