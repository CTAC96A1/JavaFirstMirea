package ru.mirea.task11;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ColorAndFont extends JFrame {

    JTextArea area = new JTextArea("Hello World");
    Font TNR = new Font("Times new roman", Font.BOLD, 15);
    Font SS = new Font("Sans Serif", Font.BOLD, 15);
    Font CN = new Font("Courier New", Font.BOLD, 15);
    JRadioButton Style1 = new JRadioButton("Times new roman");
    JRadioButton Style2 = new JRadioButton("Sans Serif");
    JRadioButton Style3 = new JRadioButton("Courier New");
    JRadioButton Color1 = new JRadioButton("Blue color");
    JRadioButton Color2 = new JRadioButton("Red color");
    JRadioButton Color3 = new JRadioButton("Green color");

    ColorAndFont() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(10, 30, 10, 30));

        panel.add(area);
        panel.add(Style1);
        panel.add(Style2);
        panel.add(Style3);
        panel.add(Color1);
        panel.add(Color2);
        panel.add(Color3);
        frame.setSize(800, 100);
        frame.setLocationRelativeTo(null);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        Style1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                area.setFont(TNR);
            }
        });
        Style2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                        area.setFont(SS);
            }
            });
        Style3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                        area.setFont(CN);
                    }
    });
        Color1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                area.setForeground(Color.blue);
            }
        });
        Color2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                area.setForeground(Color.red);
            }
        });
        Color3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                area.setForeground(Color.green);
            }
        });
    }
    public static void main(String[]args) {
        new ColorAndFont();
    }
}