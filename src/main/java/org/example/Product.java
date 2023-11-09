package org.example;

/**
 * Абстрактный класс продукта
 */
public abstract class Product {
    // Цена
    protected int price;
    // Количество проданных продуктов
    protected static int Sold = 0;

    // Описание товара
    protected String description;

    /**
     * Увеличиваем количество проданных продуктов, при переопределеннии, нужно вызват этот метод у суперкласса
     */
    public void buy() {
        Product.Sold++;
    }

    /**
     * Использовать купленный продукт
     */
    public abstract void use();

    public Product(int price, String description) {
        this.price = price;
        this.description = description;
    }

    public int getPrice() {
        return price;
    }


    public static int getSold() {
        return Sold;
    }


    @Override
    public String toString() {
        return  description + " - " + price;
    }
}
