/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw16matrixfuctions;

import java.util.Scanner;

/**
 *
 * @author David V
 */
public class HW16MatrixFuctions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of rows of the matrix1");
        int f1 = RowsMatrix1(sc);
        
        System.out.println("Enter the number of columns of the matrix1 ");
        int c1 = ColumnsMatrix1(sc);
        
        System.out.println("Enter the number of rows of the matrix2 ");
        int f2 = RowsMatrix2(sc);
        
        System.out.println("Enter the number of columns of the matrix2 ");
        int c2 = ColumnsMatrix2(sc);
        
        System.out.println("---Dates---");
        DatesMatrixes(f1, c1, f2, c2);
        
        if (c1 == f2) {
            int[][] m1 = new int[f1][c1];
            int[][] m2 = new int[f2][c2];
            int[][] mR = new int[f1][c2];
            
           //Matrix1
            System.out.println("-> Start matrix1");
            StartMatrix1(f1, c1, m1, sc);
            
            System.out.println("Matrix1");
            Matrix1(f1, c1, m1);
            
            //Matrix2
            System.out.println("-> Start matrix2");
            StartMatrix2(f2, c2, m2, sc);
            
            System.out.println("Matrix2");
            Matrix2(f2, c2, m2);
            
            //ResultingMatrix
            System.out.println("-- Resulting Matrix--");
            ResultingMatrix (f1, c2, c1, mR, m1, m2);
     }
}

    private static int RowsMatrix1(Scanner sc) {
        int f1 = sc.nextInt();
        return f1;
    }

    private static int ColumnsMatrix1(Scanner sc) {
        int c1 = sc.nextInt();
        return c1;
    }

    private static int RowsMatrix2(Scanner sc) {
        int f2 = sc.nextInt();
        return f2;
    }

    private static int ColumnsMatrix2(Scanner sc) {
        int c2 = sc.nextInt();
        return c2;
    }

    private static void DatesMatrixes(int f1, int c1, int f2, int c2) {
        System.out.println("-- Matrix1 " + f1 + "x" + c1 + " --");
        System.out.println("-- Matrix2 " + f2 + "x" + c2 + " --");
        System.out.println("----------------------");
    }

    private static void StartMatrix1(int f1, int c1, int[][] m1, Scanner sc) {
        for (int i = 0; i < f1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.println("Enter the value" + i + "," + j + ": ");
                m1[i][j] = sc.nextInt();
            }
        }
    }

    private static void Matrix1(int f1, int c1, int[][] m1) {
        for (int i = 0; i < f1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print(m1[i][j] + " ");
            }
            System.out.println("");
        }
    }

    private static void StartMatrix2(int f2, int c2, int[][] m2, Scanner sc) {
        for (int i = 0; i < f2; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.println("Enter the value " + i + "," + j + ": ");
                m2[i][j] = sc.nextInt();
            }
        }
    }

    private static void Matrix2(int f2, int c2, int[][] m2) {
        for (int i = 0; i < f2; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(m2[i][j] + " ");
            }
            System.out.println("");
        }
    }

    private static void ResultingMatrix (int f1, int c2, int c1, int[][] mR, int[][] m1, int[][] m2) {
        for (int i = 0; i < f1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int h = 0; h < c1; h++) {
                    mR[i][j] += m1[i][h] * m2[h][j];
                }
                System.out.print(mR[i][j] + " ");
            }
            System.out.println("");
        }
    }
   }
