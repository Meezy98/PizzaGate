package com.company.display.pizzaOptions;

import com.company.service.PizzaAction;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PizzaInfo implements ActionListener {
    JPanel mainPizzaPanel;

    JPanel customerPanel, commentPanel;
    JLabel customerLabel, commentLabel;

    JTextField nameTextField;
    JTextArea commentTextArea;
    JScrollPane commentPane;


    JPanel pizzaSizePanel;
    JLabel pizzaSizeLabel;
    JRadioButton small, medium, large;
    ButtonGroup pizzaSizeButtons;

    PizzaAction sizeAction;

    public PizzaInfo() {

        this.customerPanel = new JPanel();
        this.customerLabel = new JLabel("Customer Name: ");
        this.nameTextField = new JTextField(20);

        this.commentPanel = new JPanel();
        this.commentLabel = new JLabel("Order Comments");
        this.commentTextArea = new JTextArea(5, 20);
        this.commentPane = new JScrollPane(commentTextArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);


        this.pizzaSizePanel = new JPanel();
        this.pizzaSizeLabel = new JLabel("Pizza Size:");
        this.small = new JRadioButton("Small");
        this.medium = new JRadioButton("Medium");
        this.large = new JRadioButton("Large");
        this.pizzaSizeButtons = new ButtonGroup();
    }

    public JPanel display() {
        pizzaSizePanel.add(pizzaSizeLabel);

        pizzaSizeButtons.add(small);
        pizzaSizeButtons.add(medium);
        pizzaSizeButtons.add(large);

        small.addActionListener(this);
        medium.addActionListener(this);
        large.addActionListener(this);

        pizzaSizePanel.add(small);
        pizzaSizePanel.add(medium);
        pizzaSizePanel.add(large);

        mainPizzaPanel.add(pizzaSizePanel);


        return mainPizzaPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
