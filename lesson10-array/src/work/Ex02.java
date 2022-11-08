package work;
import java.util.ArrayList;

import work.Point;

public class Ex02 {

    public static void main(String[] args) {
        int[][] matrix1 = {{1,2,3,4}, {5,0,7,8}, {1,9,0,9},{2,0,6,5},{1,2,4,5}};
        printMatrix(matrix1);
        System.out.println();
        System.out.println(getZeroLocation(matrix1));
        matrix1 = convertMatrix(matrix1, getZeroLocation(matrix1));
        printMatrix(matrix1);



    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static ArrayList<Point> getZeroLocation(int[][] matrix){
        ArrayList<Point> Locations = new ArrayList<Point>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == 0) {
                    Locations.add(new Point(i, j));
                }
            }
        }
        return Locations;
    }

    private static int[][] convertMatrix(int[][] matrix, ArrayList<Point> locations) {
        for (Point point : locations) {
            int x = point.x;
            int y = point.y;
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if(j == y || i == x)
                        matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }

}
