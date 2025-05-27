package org.example;

public class Apple implements Fruit {
    int price;
    int kilogram;

    public Apple(int price, int kilogram){
        this.price = price;
        this.kilogram = kilogram;
    }

    @Override
    public double fun( ) {
        return kilogram*price;
    }
}
