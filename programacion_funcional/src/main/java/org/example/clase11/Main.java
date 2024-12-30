package org.example.clase11;

import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<venta> list = Arrays.stream(Month.values())
                .map(month -> new venta(month, generarVentaRamdon()))
                .toList();


        List<venta> list1 = list.stream()
                .skip(9)
                .toList();

        list1.forEach(venta -> System.out.println(venta.getTotal()));
    }

    static double generarVentaRamdon(){
        return new Random().nextDouble(1000,2000);
    }
}
