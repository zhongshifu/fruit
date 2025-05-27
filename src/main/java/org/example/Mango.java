package org.example;

public class Mango implements Fruit {

    int price;
    int kilogram;

    public Mango(int price, int kilogram){
        this.price = price;
        this.kilogram = kilogram;
    }

    @Override
    public double fun( ) {
        return kilogram*price;
    }
}
