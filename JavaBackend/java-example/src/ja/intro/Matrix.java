package ja.intro;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        // int[][] matrix = inputIntMatrix(5);
        int[][] matrix = {
                {1, 2, 3, 4, 11},
                {12, 1, 5, 7, 8}
        };
        showMatrix(matrix);
        int max = getMaxValueOfMatrix(matrix);
        System.out.println("Max of matrix is: " + max);
    }

    public static int[][] inputIntMatrix(int size) {
        Scanner scanner = new Scanner(System.in);
        int [][] matrix = new int[size][size];
        for (int i = 0; i < 2; i ++) {
            for (int j = 0; j < size; j ++) {
                System.out.print("Nhập vào giá trị cho phần tử thứ " + i + " - " + j);
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    public static int getMaxValueOfMatrix(int [][] matrix) {
        int max = matrix[0][0];
        for (int i = 0 ; i < 2; i ++ ) {
            for (int j = 0; j < matrix[1].length; j ++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }

    public static void showMatrix(int[][] matrix) {
        for (int i = 0 ; i < 2; i ++ ) {
            for (int j = 0; j < matrix[1].length; j ++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println("");
        }
    }

}
