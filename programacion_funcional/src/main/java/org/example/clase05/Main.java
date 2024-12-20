package org.example.clase05;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String mensaje = "Hello world";
        JFrame ventana = new JFrame();
        ventana.setSize(500,500);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton b = new JButton("Soy un boton!!");
        b.addActionListener(e -> System.out.println(mensaje));
        ventana.add(b);

        ventana.setVisible(true);
    }
}
