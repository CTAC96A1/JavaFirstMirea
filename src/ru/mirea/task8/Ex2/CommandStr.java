package ru.mirea.task8.Ex2;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class CommandStr extends JFrame
{
    private static String[] savedArgs;
    public CommandStr()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1920,1080);
        setVisible(true);
    }
        public void paint(Graphics g)
        {
            super.paint(g);
            try {
                Image img = ImageIO.read(new File(getArgs()[0]));
                g.drawImage(img, 0, 0, null);
            } catch(IOException e){
                e.printStackTrace();
            }
        }

        public static String[] getArgs()
        {
        return savedArgs;
    }

        public static void main(String[] args)
        {

            savedArgs = args;
            javax.swing.SwingUtilities.invokeLater(new Runnable() {
                public void run()
                {
                    CommandStr cstr = new CommandStr();
                }
            });
        }
}
