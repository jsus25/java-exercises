package ru.standart;

public class BubbleSort2 {

  public static int[] bubbleSort(int[] array) {
    boolean sorted = false;
    while (!sorted) {
      sorted = true;
      for (int i = 0; i<array.length-1; i++) {
        if (array[i] > array[i+1]) {
          int temp = array[i];
          array[i] = array[i+1];
          array[i+1] = temp;
          sorted = false;
        }
      }
    }
    return array;
  }
}
