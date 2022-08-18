package horsesaddle;

import java.awt.Point;
import java.util.Random;
import java.util.Scanner;

public class HorseSaddle {
	
	public static void main(String[] args) {
//		int row, colum;
//
//		Scanner scanner = new Scanner(System.in);
//
//		System.out.print("Nhập số dòng: ");
//		row = scanner.nextInt();
//		System.out.print("Nhập số cột : ");
//		colum = scanner.nextInt();
//		int[][] A = new int[row][colum];
//		for (int i = 0; i < row; i++) {
//			for (int j = 0; j < colum; j++) {
//				A[i][j] = new Random().nextInt(1, 99);
//			}
//		}
//
//		for (int i = 0; i < row; i++) {
//			for (int j = 0; j < colum; j++) {
//				System.out.print(A[i][j] + "\t");
//			}
//
//			System.out.println("\n");
//		}
	//	int A[][] = {{47, 47 , 36, 47},{23, 43 , 31, 47},{23, 47 , 31, 47},{46, 7 , 29, 47} };
		int A[][] = {{10 , 10}, {1,1}};
		for (int i = 0; i < A.length; i++) {
			
			for (int j = 0; j < A[i].length; j++) {
				System.out.print(A[i][j] + " ");
			}

			System.out.println("\n");
		}
		finPointSaddle(A);
	
		

	}

	
	public static void finPointSaddle(int A[][]) {
		int max = -99999;
		int min = 99999;
		int row = A.length;
		int colum = A[0].length;
		Point[] maxD = new Point[0];
		Point[] minD = new Point[0];
		System.out.println(row + " " + colum);
		
		for(int i = 0 ; i < row ; i++) {
			Point[] Point1 = new Point[0];
			Point[] Point2 = new Point[0];
			min = 9999;
			max = -9999;
			for( int j = 0 ; j < colum ; j ++) {
				if(A[i][j] < min)
				{
					Point1 = new Point[0];
					min = A[i][j];
					Point1 = addPoint(Point1, new Point(i, j) );
	 
				}
				else if(A[i][j] == min) {
					Point1 = addPoint(Point1, new Point(i, j) );
				}
				
				if(A[j][i] > max)
				{
					Point2 = new Point[0];
					max = A[j][i];
					Point2 = addPoint(Point2, new Point(j, i) );
	 
				}
				else if(A[j][i] == max) {
					Point2 = addPoint(Point2, new Point(j, i) );
				}
			}
			minD = addList(minD, Point1);
			maxD = addList(maxD, Point2);
		}
		for(int i = 0 ; i < minD.length ; i ++) {
			System.out.println(minD[i]);
			
			
		}
		System.out.println("================");
		for(int i = 0 ; i < maxD.length; i ++) {
			System.out.println(maxD[i]);
		}
		
		for(int i = 0 ; i < minD.length; i ++) {
			for(int j = 0 ; j < maxD.length; j ++) {
				if(maxD[j].x == minD[i].x && maxD[j].y == minD[i].y) {
					System.out.println(maxD[j].x + " " + maxD[j].y);
					System.out.println(A[maxD[j].x][maxD[j].y]);
					
				}
				
				
			}
		}
		System.out.println("khong co phan tu thoa");
	}
	
	public static Point[] addPoint(Point[] A, Point value) {
		Point[] tmp = new Point[A.length+1];
		for( int i = 0 ; i < A.length ; i ++) {
			tmp[i] = A[i];
		}
		tmp[tmp.length-1] = value;
		return tmp;
	}
	
	public static Point[]  addList(Point A[], Point B[]) {
		for(int i =0 ; i < B.length ; i ++) {
			A = addPoint(A, B[i]); 
		}
		return A;

	}
}
