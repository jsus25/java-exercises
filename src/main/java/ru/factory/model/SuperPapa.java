package ru.factory.model;

public class SuperPapa extends Pizza{

  @Override
  public void collectIngredients() {
    super.collectIngredients();
    System.out.println("Сыр и все остальное, что есть на кухне");
  }
}
