package org.example;

public class BuyFruit {
    double fun(Fruit ...fruits) {
        double sum = 0.0;
        for (Fruit fruit : fruits) {
            sum += fruit.fun();
        }
        return sum;
    }

    double fun(int money, int reduce, Fruit ...fruits){
        double sum = 0.0;
        for (Fruit fruit : fruits) {
            sum +=fruit.fun();
        }

        if(sum>=money) {
           sum -=reduce;
        }
        return sum;
    };
}
