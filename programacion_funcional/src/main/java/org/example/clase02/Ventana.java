package org.example.clase02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {

    public Ventana(String title) throws HeadlessException {
        super(title);
        setVisible(true);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        JButton b1 = new JButton("Click!");
        b1.addActionListener(new ButtonListener());

        JButton b2 = new JButton("Clase anonima");
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hola Putos");
            }
        });

        var i = 0;
        JButton b3 = new JButton("Lambda");
        b3.addActionListener((e) -> {
            System.out.println("Hola desde lambda");
        });


        add(b1);
        add(b2);
        add(b3);
    }
}
