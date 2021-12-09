package com.company.display;

import javax.swing.*;

public class PlaceOrder {

    JPanel buttonPanel;
    JButton placeOrderButton;
    JButton resetOrderButton;

    public PlaceOrder(){
        this.buttonPanel = new JPanel();
        this.placeOrderButton = new JButton("Place Order");
        this.resetOrderButton = new JButton("Reset Order");

    }

    public JPanel display(){

        //placeOrder.addActionListener(this);
        buttonPanel.add(placeOrderButton);
        buttonPanel.add(resetOrderButton);

        return buttonPanel;
    }
}
