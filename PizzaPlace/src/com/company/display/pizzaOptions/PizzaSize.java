package com.company.display.pizzaOptions;

import com.company.service.PizzaAction;

import javax.swing.*;

public class PizzaSize {

    JPanel sizePanel;
    JLabel pizzaLabel;
    JRadioButton small, medium, large;
    ButtonGroup pizzaSize;

    PizzaAction sizeAction;

    public PizzaSize() {
        this.sizePanel = new JPanel();
        this.pizzaLabel = new JLabel("Pizza Size:");
        this.small = new JRadioButton("Small");
        this.medium = new JRadioButton("Medium");
        this.large = new JRadioButton("Large");
        this.pizzaSize = new ButtonGroup();
    }

    public JPanel display() {
        sizePanel.add(pizzaLabel);

        pizzaSize.add(small);
        pizzaSize.add(medium);
        pizzaSize.add(large);

       // sizeAction = new PizzaAction(small, medium, large);

        sizePanel.add(small);
        sizePanel.add(medium);
        sizePanel.add(large);

        return sizePanel;
    }



}
