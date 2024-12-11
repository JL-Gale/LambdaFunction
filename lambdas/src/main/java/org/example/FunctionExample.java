package org.example;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        /*
        * Funtion
        * Resive un valor y retorna un resultado
        * */
        Function<Byte, String> function = (param) -> "Tu edad es: ".concat(String.valueOf(param));
        System.out.println(function.apply((byte)15));

        Function<Byte, String> function2 = (param) -> (param < 18) ? "Eres menor de edad" : "Ya estas viejo en tu casa ya lledes";
        System.out.println(function2.apply((byte)18));

    }
}
