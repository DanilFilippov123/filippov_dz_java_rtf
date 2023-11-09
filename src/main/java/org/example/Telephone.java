package org.example;

public class Telephone extends Product{

    private static int SoldTelephone = 0;

    public Telephone(int price) {
        super(price, "Телефон");
    }

    @Override
    public void use() {
        System.out.println("Телефон звонит");
    }

    @Override
    public void buy() {
        super.buy();
        SoldTelephone++;
    }

    public static int getSoldTelephone() {
        return SoldTelephone;
    }
}
