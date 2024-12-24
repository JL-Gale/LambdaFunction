package org.example.clase08;

import java.util.function.Consumer;

public class ConsumidorDeCadenas implements Consumer<String> {
    @Override
    public void accept(String t) {
        System.out.println(t);
    }
}
