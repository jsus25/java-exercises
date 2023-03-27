package ru.factory.model;

import java.util.Arrays;
import java.util.List;

public class Pepperoni extends Pizza{
  List<String> ingredients = Arrays.asList("Колбаса", "кетчуп", "сыр");

  @Override
  public void collectIngredients() {
    super.collectIngredients();
    System.out.println(ingredients);
  }
}
