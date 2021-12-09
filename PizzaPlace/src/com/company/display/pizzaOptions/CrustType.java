package com.company.display.pizzaOptions;

import com.company.database.PizzaOptions;

import javax.swing.*;
import java.util.ArrayList;

public class CrustType {

    JPanel crustPanel = new JPanel();
    JLabel crustLabel = new JLabel("Crust Type");
    ArrayList<String> crustType;
    JComboBox comboBox;

    PizzaOptions pizzaOptions = new PizzaOptions();


    public CrustType() {
        this.crustPanel = new JPanel();
        this.crustLabel = new JLabel();
        crustType = pizzaOptions.getCrustTypes();
        comboBox = new JComboBox(crustType.toArray());
    }

    public JPanel display() {
        //myCombo.addActionListener(this);
        crustPanel.add(crustLabel);
        crustPanel.add(comboBox);

        return crustPanel;
    }


}
