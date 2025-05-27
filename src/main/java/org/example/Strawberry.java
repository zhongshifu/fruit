package org.example;

public class Strawberry implements Fruit {
    int price;
    int kilogram;

    public Strawberry(int price, int kilogram){
        this.price = price;
        this.kilogram = kilogram;
    }

    @Override
    public double fun( ) {
        return kilogram*price;
    }

}
