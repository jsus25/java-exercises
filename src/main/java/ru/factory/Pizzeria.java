package ru.factory;

import ru.factory.model.Pizza;

import java.util.Scanner;

public class Pizzeria {

  public static void main(String[] args) {
    PizzaFactory pizzaFactory = new PizzaFactory();
    Scanner scan = new Scanner(System.in);
    System.out.println("Выберите пиццу (PEPPERONI, HAWAIIAN, MARGARITA, SUPERPAPA)");
    PizzaType type = PizzaType.valueOf(scan.nextLine());
    Pizza pizza = pizzaFactory.createPizza(type);
    pizza.collectIngredients();
    pizza.bakePizza();
    pizza.putIntoBox();
    System.out.println("Ваша пицца готова, забирайте!");
    System.out.println("В подарок получите " + PizzaType.PEPPERONI);
    Pizza pepperoni = pizzaFactory.createPizza(PizzaType.PEPPERONI);
    pepperoni.collectIngredients();
    pepperoni.bakePizza();
    pepperoni.putIntoBox();
  }
}
