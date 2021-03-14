package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        JFrame window = new JFrame("Celsius to Fahrenheit");
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setSize(240, 250);
        window.setLocationRelativeTo(null);
        window.setLayout(null);

        JLabel cels = new JLabel("Celsius");
        cels.setBounds(130, 20, 100, 30);
        window.add(cels);

        JLabel conv = new JLabel("Fahrenheit");
        conv.setBounds(20, 120, 200, 30);
        window.add(conv);

        JTextField textCels = new JTextField();
        textCels.setBounds(20, 20, 100, 25);
        window.add(textCels);

        JButton convert = new JButton("Convert");
        convert.setBounds(20, 90, 100, 30);
        window.add(convert);

        convert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cels = textCels.getText();
                Integer.parseInt(cels);

                double fahr = (Integer.parseInt(cels) * 1.8) + 32;
                conv.setText( cels + " Celsius is " + fahr + " in Fahrenheit");
            }
        });
        window.setVisible(true);
    }
}
