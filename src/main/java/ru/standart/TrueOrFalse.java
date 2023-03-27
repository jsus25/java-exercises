package ru.standart;

import java.util.Scanner;

public class TrueOrFalse {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    float number = scan.nextFloat();
    boolean compare5 = (number > 5);
    System.out.printf("Число %s больше 5? - %s", number, compare5);
  }

}
