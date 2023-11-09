package org.example;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface ProductGenerator {
    /**
     * @param count Количество продуктов
     * @param generator Функция вызываемая для генерации продуктов
     * @return Stream продуктов
     */
    static List<Product> generate(Supplier<Product> generator, int count) {
        if(count <= 0) {
            throw new IllegalArgumentException("Count меньше либо равен нулю");
        }
        return Stream.generate(generator).limit(count).collect(Collectors.toList());
    }

    /**
     * Дефолтный случайный (50/50) генератор для Стульев и Телефонов
     * @param count Количество элементов
     * @return List сгенерированных элементов
     */
    static List<Product> generate(int count) {
        return ProductGenerator.generate(new FiftyFiftyProductGenerator(), count);
    }
}
