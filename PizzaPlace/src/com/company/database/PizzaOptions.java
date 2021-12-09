package com.company.database;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PizzaOptions {


    public ArrayList<String> getCrustTypes() {

        String[] crustType = {"Thin", "Thick","Deep Dish"};
        ArrayList<String> crustTypes = new ArrayList<>();
        crustTypes.add("Thin");
        crustTypes.add("Thick");
        crustTypes.add("Deep Dish");
        crustTypes.add("Raw");
        crustTypes.add("asdasda");

        return crustTypes;
    }


    public ArrayList<String> getToppings() {

        ArrayList<String> toppings = new ArrayList<>();

        toppings.add("Pepperoni");
        toppings.add("Sausage");
        toppings.add("Onions");
        toppings.add("Bacon");
        toppings.add("Olives");
        toppings.add("Cheese");
        toppings.add("Chicken");

        return toppings;
    }
}
