package ru.factory.model;

import java.util.Arrays;
import java.util.List;

public class Hawaiian extends Pizza{

  List<String> ingredients = Arrays.asList("Курица", "ананасы","сыр");

  @Override
  public void collectIngredients() {
    super.collectIngredients();
    System.out.println(ingredients);
  }
}
