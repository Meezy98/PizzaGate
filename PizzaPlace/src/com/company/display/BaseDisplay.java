package com.company.display;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.company.display.pizzaOptions.CrustType;
import com.company.display.pizzaOptions.Extras;
import com.company.display.pizzaOptions.PizzaSize;
import com.company.display.pizzaOptions.Toppings;
import com.company.service.PizzaAction;

public class BaseDisplay {
    //Class scope variables used commonly, now given access to all methods
    JFrame Frame;
    JPanel mainPanel;

    PizzaSize pizzaSize = new PizzaSize();
    CrustType pizzaCrustType = new CrustType();
    Toppings pizzaToppings = new Toppings();
    Extras pizzaExtras = new Extras();
    CustomerApp customerInfo = new CustomerApp();
    PlaceOrder placeOrderButtons = new PlaceOrder();

    PizzaAction pizzaAction = new PizzaAction();

    public static void main(String[] args) {
        BaseDisplay bd = new BaseDisplay();
        bd.createWindow();

    }

    //Constructor creates the window, accessing the class variable to ensure methods always use the
    //same window contents
    public BaseDisplay() {
        this.Frame = new JFrame("Pizza Place");
        this.mainPanel = (JPanel) Frame.getContentPane();
    }

    public void createWindow() {

        // Solely for Window sizing and editing
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        //Customer Name input
        mainPanel.add(customerInfo.nameInput());

        // Pizza Windows
        // Size
        mainPanel.add(pizzaSize.display());
        // Crust Type
        mainPanel.add(pizzaCrustType.display());
        // toppings
        mainPanel.add(pizzaToppings.display());
        // Extras
        mainPanel.add(pizzaExtras.display());

        //Customer Comment Input
        mainPanel.add(customerInfo.commentInput());

        // Order Buttons
        mainPanel.add(placeOrderButtons.display());

        this.mainPanel = pizzaAction.enableInput(mainPanel);

        Frame.pack();
        Frame.setVisible(true);

    }




}
