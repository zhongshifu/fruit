package org.example;

public class StrawberryDiscount extends Strawberry{

    int discount;

    public StrawberryDiscount(int price, int kilogram, int discount){
        super(price, kilogram);
        this.discount = discount;
    };

    @Override
    public double fun( ) {
        return super.fun( )*discount/10;
    }
}
