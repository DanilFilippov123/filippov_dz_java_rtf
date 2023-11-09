package org.example;

import java.util.Random;
import java.util.stream.Stream;

public abstract class ProductGenerator {
    protected static Random random = new Random();
    public static Product oneProductGenerator() {
        if(random.nextDouble() > 0.5) {
            return new Telephone(random.nextInt(1000));
        } else {
            return new Chair(random.nextInt(500));
        }
    }

    /**
     * Поток случайных элементов, решил сделать именно потоком, они мне нравятся <3
     * @param count Количество продуктов
     * @return Stream продуктов
     */
    public static Stream<Product> generate(int count) {
        return Stream.generate(ProductGenerator::oneProductGenerator).limit(count);
    }
}
