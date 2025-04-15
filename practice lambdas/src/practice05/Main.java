package practice05;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> names = List.of("Jorge", "Carlos", "Juan", "Jean", "Ana"); // Inmutables
        names.forEach(s -> {
            if (!s.toLowerCase().startsWith("j")) {
                System.out.println(s);
            }
        });


    }
}
