package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int topping = 0, cheese = 0, paper = 0;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(this.isVeg==true){
            price = 300;
        }
        else
            price = 400;
        this.bill = "Base Price Of The Pizza: " + price;
        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(cheese==0)
            cheese = cheese + 80;
        // your code goes here
    }

    public void addExtraToppings(){
        if(topping==0){
            if(isVeg)
                topping = topping + 70;
            else
                topping = topping + 120;
        }
        // your code goes here
    }

    public void addTakeaway(){
        if(paper==0)
            paper = paper + 20;
        // your code goes here
    }

    public String getBill(){
        // your code goes here

        if(cheese != 0)
            bill = bill + "\nExtra Cheese Added: " + cheese;
        if(topping == 70)
            bill = bill + "\nExtra Toppings Added: " + 70;
        if(topping == 120)
            bill = bill + "\nExtra Toppings Added: " + 120;
        if(paper != 0)
            bill = bill + "\nPaperbag Added: " + 20;
        price = price + cheese + topping + paper;
        bill = bill + "\nTotal Price: " + price;
        return this.bill;
    }
}