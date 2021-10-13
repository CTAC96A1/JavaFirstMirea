package ru.mirea.task8.Ex3;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Cinema extends JFrame {
    protected static Image image;
    private static JFrame jFrame;
    private static String text;
    protected static ArrayList<Image> framlist = new ArrayList<>();

    Cinema(){
        setLayout(new FlowLayout());
        setSize(1920,1080);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D gr2d = (Graphics2D) g;
        gr2d.drawImage(image,0,0, 960, 580, null);
    }


    public static void main(String[] args) {
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_00_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_01_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_02_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_03_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_04_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_05_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_06_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_07_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_08_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_09_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_10_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_11_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_12_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_13_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_14_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_15_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_16_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_17_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_18_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_19_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_20_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_21_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_22_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_23_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_24_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_25_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_26_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_27_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_28_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_29_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_30_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_31_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_32_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_33_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_34_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_35_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_36_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_37_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_38_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_39_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_40_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_41_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_42_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_43_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_44_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_45_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_46_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_47_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_48_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_49_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_50_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_51_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_52_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_53_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_54_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_55_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_56_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_57_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_58_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_59_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_60_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_61_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_62_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_63_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_64_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_65_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_66_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_67_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_68_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_69_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_70_delay-0.11s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_71_delay-0.11s.gif").getImage());

            Cinema animImg = new Cinema();
            while (true) {
                for (int i = 0; i < 72; i++) {
                    image = framlist.get(i);
                    animImg.repaint();
                    try {
                        Thread.sleep(85);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
    }

}
