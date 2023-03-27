package ru.factory.model;

public class Pizza {
  public void collectIngredients(){
    System.out.print("Собираем ингридиенты: ");
  }
  public void bakePizza(){
    System.out.println("Выпекаем...");
  }
  public void putIntoBox(){
    System.out.println("Раскладываем по коробочкам");
  }
}
