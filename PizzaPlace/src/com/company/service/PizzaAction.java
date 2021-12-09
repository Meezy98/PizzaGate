package com.company.service;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PizzaAction implements ActionListener {

    JPanel mainPanel;

    public PizzaAction(){
//        this.small = small;
//        this.medium = medium;
//        this.large = large;
//
//        small.addActionListener(this);
//        medium.addActionListener(this);
//        large.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

//        String smallSize = small.getText();
//        String mediumSize = medium.getText();
//        String largeSize = large.getText();


    }

    public JPanel enableInput(JPanel mainPanel) {
        this.mainPanel = mainPanel;
        Component[] components = mainPanel.getComponents();
        System.out.println(components.length);
        System.out.println(components[1].getClass());
        System.out.println(components[2].getClass());
        System.out.println(components[3].getClass());
        System.out.println(components[6].getClass());



        return mainPanel;
    }
}
