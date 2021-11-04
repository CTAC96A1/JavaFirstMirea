package ru.mirea.task11;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class ColorAndFont extends JFrame {
    final Random random = new Random();

    JTextArea area = new JTextArea("Hello World");
    Font TNR = new Font("Times new roman", Font.BOLD, 15);
    Font SS = new Font("Sans Serif", Font.BOLD, 15);
    Font CN = new Font("Courier New", Font.BOLD, 15);
    JRadioButton r1 = new JRadioButton("Times new roman");
    JRadioButton r2 = new JRadioButton("Sans Serif");
    JRadioButton r3 = new JRadioButton("Courier New");
    JRadioButton r4 = new JRadioButton("Blue color");
    JRadioButton r5 = new JRadioButton("Red color");
    JRadioButton r6 = new JRadioButton("Green color");

    ColorAndFont() {
        super("Choose options");

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        panel.setBorder(BorderFactory.createEmptyBorder(10, 30, 10, 30));

        panel.add(area);
        panel.add(r1);
        panel.add(r2);
        panel.add(r3);
        panel.add(r4);
        panel.add(r5);
        panel.add(r6);
        frame.setSize(1000, 400);
        frame.setLocationRelativeTo(null);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        r1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                area.setFont(TNR);
            }
        });
        r2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                        area.setFont(SS);
            }
            });
        r3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                        area.setFont(CN);
                    }
    });
        r4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                area.setForeground(Color.blue);
            }
        });
        r5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                area.setForeground(Color.red);
            }
        });
        r6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                area.setForeground(Color.green);
            }
        });
    }
    public static void main(String[]args) {
        new ColorAndFont();
    }
}