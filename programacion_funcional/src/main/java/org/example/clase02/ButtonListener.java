package org.example.clase02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {
    Integer i = 0;
    @Override
    public void actionPerformed(ActionEvent e) {
        i++;
        System.out.println(i+") Hello world");
    }
}
