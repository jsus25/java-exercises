package ru.standart;

/*
Задача:
Создайте массив из 12 случайных целых чисел из отрезка [-15;15].
Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
*/

public class MaxFromArray {

  public static void main(String[] args) {
    int elementsCount = 12;

    //заполнение массива
    int[] myArray = new int[elementsCount];
    for (int i=0; i<elementsCount; i++) {
      myArray[i] = (int) (Math.random() * 31 - 15);
    }

    //поиск максимального элемента
    int max = -15;
    int indexMax = elementsCount - 1;
    for (int i = elementsCount - 1; i>=0; i--) {
      if (myArray[i] > max) {
        max = myArray[i];
        indexMax = i;
      }
    }

    //Вывод ответа
    System.out.println("Сгенерированный массив:");
    System.out.print("[" + myArray[0]);
    for (int i = 1; i<elementsCount; i++) {
      System.out.print(", " + myArray[i]);
    }
    System.out.println("]");
    System.out.printf("Максимальный элемент массива %s. Последнее вхождение в массив - на %s-м месте", max, indexMax + 1);

  }
}
