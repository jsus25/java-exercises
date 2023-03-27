package ru.standart;

import java.util.ArrayList;
import java.util.Scanner;

public class BubbleSort {

  public static void main(String[] args) {
    ArrayList<Integer> array = getList();
    sortList(array);
    System.out.println(array);
  }

  private static ArrayList<Integer> getList() {
    Scanner scan = new Scanner(System.in);
    ArrayList<Integer> array = new ArrayList<>();
    while (scan.hasNextInt()) {
      array.add(scan.nextInt());
    }
    return array;
  }

  private static void sortList(ArrayList<Integer> array) {
    boolean sorted = false;
    while (!sorted) {
      sorted = true;
      for (int i = 0; i < array.size() - 1; i++) {
        if (array.get(i) > array.get(i+1)) {
          int temp = array.get(i);
          array.set(i, array.get(i+1));
          array.set(i+1, temp);
          sorted = false;
        }
      }
    }
   }
}
