package com.company.display;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomerApp {

    JPanel customerPanel, commentPanel;
    JLabel customerLabel, commentLabel;

    JTextField nameTextField;
    JTextArea commentTextArea;
    JScrollPane commentPane;

    public CustomerApp() {
        this.customerPanel = new JPanel();
        this.customerLabel = new JLabel("Customer Name: ");
        this.nameTextField = new JTextField(20);

        this.commentPanel = new JPanel();
        this.commentLabel = new JLabel("Order Comments");
        this.commentTextArea = new JTextArea(5, 20);
        this.commentPane = new JScrollPane(commentTextArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

    }

    public JPanel nameInput() {
        customerPanel.add(customerLabel);
        customerPanel.add(nameTextField);
        return customerPanel;
    }

    public JPanel commentInput() {
        commentTextArea.setLineWrap(true);
        commentPanel.add(commentLabel);
        commentPanel.add(commentPane);
        return commentPanel;
    }

}
