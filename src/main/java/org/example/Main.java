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
        ProductGenerator.generate(count).forEach(Product::buy);
        System.out.println("Купленно "+Product.getSold()+" товаров\nИз них "+Telephone.getSoldTelephone()+" телефонов и "+Chair.getSoldChair()+" стульев.");
    }
}