package practice10_Metodos_de_Referencia;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Metodos de Referencia

    // Referabcia a metodos static
    int[] arraysNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.stream(arraysNumbers)
                .map(MathUtils::square)
                .forEach(System.out::print);


        // Referencia a constructores
        String[] names = {"Sofia", "Mateo", "Isabella", "Leonardo", "Velentina"};
        List<Persona> listaPersona = Arrays.stream(names)
                .map(Persona::new)
                .toList();
        listaPersona.forEach(System.out::println);

        // Referencia de metodos de instancia
        String[] newNames = listaPersona.stream()
                .map(Persona::getName) // refencia a metodo de instancia
//                .toArray(value -> new String[value]);
                .toArray(String[]::new); // Referancia a constructor
        for (String newName : newNames) {
            System.out.println(newName);
        }

    }

    static void retardo(int i) {
        try {
            Thread.sleep( i * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
