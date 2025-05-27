package org.example;

// 按两次 Shift 打开“随处搜索”对话框并输入 `show whitespaces`，
// 然后按 Enter 键。现在，您可以在代码中看到空格字符。
public class Main {

/*    static double pay(Fruit fruit){
       return  fruit.fun();
    }*/

    public static void main(String[] args) {
        // 当文本光标位于高亮显示的文本处时按 Alt+Enter，
        // 可查看 IntelliJ IDEA 对于如何修正该问题的建议。
        Apple apple = new Apple(8,10);
        Strawberry strawberry = new Strawberry(13,10);
        Mango mango = new Mango(20,10);
        StrawberryDiscount strawberryDiscount = new StrawberryDiscount(13,10,8);

/*
        System.out.printf("Hello and welcome!");
        double sum1 = pay(apple)+pay(strawberry);
        double sum2 = pay(apple)+pay(strawberry)+pay(mango);
        double sum3 = pay(apple)+pay(strawberryDiscount)+pay(mango);
*/

        BuyFruit buyFruit = new BuyFruit();
        double sum4 = buyFruit.fun(apple, strawberry);
        System.out.println("顾客A在超市购买了若干斤苹果和草莓，需要计算 " + sum4 +" 元");

        double sum5 = buyFruit.fun(apple, strawberry, mango);
        System.out.println("顾客 B 在超市购买了若干斤苹果、 草莓和芒果，需要计算 " + sum5 +" 元");

        double sum6 = buyFruit.fun(apple, strawberryDiscount, mango);
        System.out.println("顾客 C 在超市购买了若干斤苹果、 草莓和芒果，草莓限时打 8 折， 需要计算 " + sum6 +" 元");

        double sum7 = buyFruit.fun(100, 10, apple, strawberry, mango);
        System.out.println("顾客 D 在超市购买了若干斤苹果、 草莓和芒果，购物满 100 减 10 块，需要计算 " + sum7 +" 元");

        // 按 Shift+F10 或点击间距中的绿色箭头按钮以运行脚本。
/*        for (int i = 1; i <= 5; i++) {

            // 按 Shift+F9 开始调试代码。我们已为您设置了一个断点，
            // 但您始终可以通过按 Ctrl+F8 添加更多断点。
            System.out.println("i = " + i);
        }*/
    }
}
