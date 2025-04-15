package practice06_map;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // map()

        List<String> namesList = List.of("Jorge", "Carlos", "Juan", "Jean", "Ana");
        final List<String> newNamesList = namesList.stream()
                .map(s -> s.toUpperCase())
                .toList();


        String[] nameArray = {"Jorge", "Carlos", "Juan", "Jean", "Ana"};
        String[] newNameArray = Arrays.stream(nameArray)
                .map(s -> s.toUpperCase())
                .toArray(value -> new String[value]);



//        names.forEach(s -> {
//            newNames.add(s.toUpperCase());
//        });


        newNamesList.forEach(System.out::println);
        System.out.println("   ");
        for (String s : newNameArray) {
            System.out.println(s);
        }

    }
}
