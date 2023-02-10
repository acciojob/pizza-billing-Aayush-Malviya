package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int topping = 0, cheese = 0, paper = 0;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg){
            price = 300;
        }
        else
            price = 400;
        bill = "";
        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }
    public void addPrice(int price){
        this.price += price;
    }

    public void addExtraCheese(){
        cheese = cheese + 80;
        // your code goes here
    }

    public void addExtraToppings(){
        if(isVeg)
            topping = topping + 70;
        else
            topping = topping + 120;
        // your code goes here
    }

    public void addTakeaway(){
        paper = paper + 20;
        // your code goes here
    }

    public String getBill(){
        // your code goes here
        bill = "Base Price Of The Pizza: " + price;
        if(cheese != 0)
            bill = bill + "\nExtra Cheese Added: " + cheese;
        if(topping != 0)
            bill = bill + "\nExtra Toppings Added: " + topping;
        if(paper != 0)
            bill = bill + "\nPaperbag Added: " + paper;
        price = price + cheese + topping + paper;
        bill = bill + "\nTotal Price: " + price;
        return this.bill;
    }
}