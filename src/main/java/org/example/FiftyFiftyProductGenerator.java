package org.example;

import java.util.Random;
import java.util.function.Supplier;

public class FiftyFiftyProductGenerator implements Supplier<Product> {
    private final static Random random = new Random();

    @Override
    public Product get() {
        if(random.nextDouble() > 0.5) {
            return new Telephone(random.nextInt(1000));
        } else {
            return new Chair(random.nextInt(500));
        }
    }
}
