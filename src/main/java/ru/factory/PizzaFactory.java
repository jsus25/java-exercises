package ru.factory;

import ru.factory.model.*;

public class PizzaFactory {

  public Pizza createPizza(PizzaType pizzaType) {
    Pizza pizza = null;
    switch (pizzaType) {
      case PEPPERONI -> pizza = new Pepperoni();
      case HAWAIIAN -> pizza = new Hawaiian();
      case SUPERPAPA -> pizza = new SuperPapa();
      case MARGARITA -> pizza = new Margarita();
      default -> System.out.println("Неправильно указан тип пиццы");
    }
    return pizza;
  }
}
