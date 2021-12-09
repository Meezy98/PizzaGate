package com.company.display.pizzaOptions;

import javax.swing.*;
import java.awt.*;

public class Extras {
    JPanel extrasPanel;
    JLabel extrasLabel;
    JCheckBox breadSticks, salad, soda;

    public Extras() {
        this.extrasPanel = new JPanel();
        this.extrasLabel = new JLabel("Extras: ");
        this.breadSticks = new JCheckBox("Bread Sticks");
        this.salad = new JCheckBox("Salad");
        this.soda = new JCheckBox("Soda");

    }

    public JPanel display() {
        extrasPanel.add(extrasLabel);
        extrasPanel.add(breadSticks);
        extrasPanel.add(salad);
        extrasPanel.add(soda);

        //breadSticks.addActionListener(this);
        //salad.addActionListener(this);
        //soda.addActionListener(this);

        return extrasPanel;
    }

}
