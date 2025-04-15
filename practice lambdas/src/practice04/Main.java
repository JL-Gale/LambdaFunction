package practice04;

import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;

public class Main {
    public static void main(String[] args) {

//        List<String> nombres = Arrays.asList();

//        List<String> lista = List.of("Diana", "Fernando", "Jorge", "Mariana");
//
//        for (int i = 0; i < lista.size(); i++) {
//            System.out.print(" " + lista.get(i));
//        }
//        System.out.println();
//        for (String s : lista) {
//            System.out.print(" "+s);
//        }
//        System.out.println();
//        lista.forEach(s -> System.out.print(" "+s));


        NuevaCollections<String> names = new NuevaCollections<>();
        names.add("1");
        names.add("2");
        names.add("3");
        names.add("4");
        names.add("5");
        names.add("6");
        names.add("7");
        names.add("8");
        names.add("9");
        names.add("10");
        names.add("11");
        names.add("12");
        for (Object name : names) {
            System.out.println(name);
        }


    }
}
