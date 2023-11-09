package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество продуктов: ");
        int count = 0;
        try {
            count = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Введено некоректное значение!");
            System.exit(1);
        }
        if(count <= 0) {
            System.out.println("Введено некоректное значение!");
            System.exit(1);
        }


        var products = ProductGenerator.generate(count);
        products.forEach(Product::buy);
        System.out.println("Купленно "+Product.getSold()+" товаров\nИз них "+Telephone.getSoldTelephone()+" телефонов и "+Chair.getSoldChair()+" стульев.");
        System.out.println("Нажмите любую клавишу для использованния");
        scanner.next();
        products.forEach(Product::use);
        for(Product product : products) {
            System.out.println("Цена товара: "+product);
        }
        int commonPrice = products.stream().mapToInt(Product::getPrice).sum();
        System.out.println("Общая цена: "+commonPrice);
    }
}