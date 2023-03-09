package ru.standart;

import java.util.Scanner;

public class HowMany {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Введите любую фразу");
    String phrase = scan.nextLine();
    String[] words = phrase.split(" ");
    System.out.printf("В вашей фразе %s слов%n", words.length);
  }

}
