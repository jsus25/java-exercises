package ru.standart;

import java.util.Scanner;

public class IvenOdd {
  public static void main(String[] args) {
    int number = getNumber();
    determineOdd(number);
  }

  private static int getNumber() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Введите целое число");
    if (scan.hasNextInt()) {
      return scan.nextInt();
    } else {
      System.out.println("Вы ввели не целое число. Повторите ввод");
      return getNumber();
    }
  }
  private static void determineOdd(int number) {
    if (number%2 == 1) {
      System.out.println("Нечетное");}
    else {
      System.out.println("Четное");}
  }


}
