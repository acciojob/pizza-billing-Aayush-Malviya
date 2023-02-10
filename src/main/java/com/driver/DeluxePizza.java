package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
//        if(isVeg==true)
//            super.addPrice(150);
//        else
//            super.addPrice(200);
        addExtraToppings();
        addExtraCheese();
    }
}
