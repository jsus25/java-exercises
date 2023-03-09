package ru.standart;

import java.util.Scanner;

public class Transpose {
  private static final Scanner scan = new Scanner(System.in);
  private static int dimension;

  public static void main(String[] args) {

    System.out.println("Введите размерность матрицы");
    readDimension();
    System.out.println("Введите числа матрицы через пробел");
    int[][] matrix = readMatrix(dimension);
    System.out.println("Исходная матрица");
    print(matrix);
    transpose(matrix);
    System.out.println("Транспонированная матрица");
    print(matrix);

  }

  private static void readDimension() {
    if (scan.hasNextInt()) {
      dimension = scan.nextInt();
    } else {
      System.out.println("Вы ввели не число, или оно слишком большое");
      System.exit(0);
    }
  }
  private static int[][] readMatrix(int dimension) {
    int[][] matrix = new int[dimension][dimension];
    for (int i=0; i<dimension; i++) {
      System.out.printf("Введите %s-ю строку матрицы%n", i+1);
      for (int j=0; j<dimension; j++) {
        if (scan.hasNextInt()) {
          matrix[i][j] = scan.nextInt();
        } else {
          System.out.println("Вы ввели не число, или оно слишком большое");
          System.exit(0);
        }
      }
    }
    return matrix;
  }

  private static void transpose(int[][] matrix) {
    for (int i=0; i< matrix.length; i++ ) {
      for (int j = i + 1; j < matrix.length; j++) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
      }
    }
  }

  private static void print(int[][] matrix) {
    for (int[] ints : matrix) {
      for (int j = 0; j < matrix.length; j++) {
        System.out.print(ints[j] + " ");
      }
      System.out.println();
    }
  }
}
