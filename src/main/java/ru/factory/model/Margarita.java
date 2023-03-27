package ru.factory.model;

import java.util.Arrays;
import java.util.List;

public class Margarita extends Pizza{

  List<String> ingredients = Arrays.asList("Помидоры", "оливки", "сыр");

  @Override
  public void collectIngredients() {
    super.collectIngredients();
    System.out.println(ingredients);
  }
}
