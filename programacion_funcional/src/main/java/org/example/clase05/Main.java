package org.example.clase05;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String mensaje = "Hello world";
        Persona p = new Persona("Jorge", (byte)20);
        JFrame ventana = new JFrame();
        ventana.setSize(500,500);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton b = new JButton("Soy un boton!!");
        b.addActionListener(e -> {
            System.out.println(p.getName()+" "+ p.getAge());
            System.out.println(p.getAge()+" Mensaje boton");
            p.setAge((byte)(p.getAge()+1));
        });
        ventana.add(b);

        ventana.setVisible(true);
    }
}
