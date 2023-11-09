package org.example;

public class Chair extends Product {
    private static int SoldChair = 0;

    public Chair(int price) {
        super(price, "Стул");
    }

    @Override
    public void use() {
        System.out.println("Сел на стул");
    }

    @Override
    public void buy() {
        super.buy();
        SoldChair++;
    }

    public static int getSoldChair() {
        return SoldChair;
    }
}
