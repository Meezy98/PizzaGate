package com.company.models;

import java.util.ArrayList;
import java.util.Collections;

public class Pizza {

    String size;
    ArrayList<String> toppings;

    public Pizza(String size, String... toppings) {
        this.size = size;
        if(toppings == null){
            this.toppings.add("Plain");
        }
        Collections.addAll(this.toppings, toppings);

    }


}
