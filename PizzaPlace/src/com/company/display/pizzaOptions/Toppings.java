package com.company.display.pizzaOptions;

import com.company.database.PizzaOptions;

import javax.swing.*;
import java.util.ArrayList;

public class Toppings {
    JPanel toppingPanel;
    JLabel toppingLabel;
    ArrayList<String> toppings;
    JList toppingList;
    JScrollPane scrollPanel;

    PizzaOptions pizzaOptions = new PizzaOptions();

    public Toppings() {
        this.toppingPanel = new JPanel();
        this.toppingLabel = new JLabel("Toppings");
        toppings = pizzaOptions.getToppings();
        this.toppingList = new JList(toppings.toArray());
        this.scrollPanel = new JScrollPane(toppingList);
    }

    public JPanel display() {
        toppingList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        toppingPanel.add(toppingLabel);
        toppingPanel.add(scrollPanel);

        return toppingPanel;
    }


}
