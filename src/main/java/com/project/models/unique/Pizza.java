package com.project.models.unique;

import com.project.models.lookup.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Table(name = "pizza_toppings")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)


public class Pizza {
    @Id
    @GeneratedValue(generator = "auto_increment", strategy = GenerationType.IDENTITY)
    int pizzaID;

    String orderNumber;

    @OneToOne(cascade = CascadeType.ALL)
    PizzaSize pizzaSize;

    @OneToOne(cascade = CascadeType.ALL)
    CheeseType cheeseType;

    @OneToOne(cascade = CascadeType.ALL)
    SauceType sauceType;

    @OneToOne(cascade = CascadeType.ALL)
    MeatType meatType;

    @OneToOne(cascade = CascadeType.ALL)
    SideItems sideItems;
}
