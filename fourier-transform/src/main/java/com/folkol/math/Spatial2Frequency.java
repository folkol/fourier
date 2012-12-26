package com.folkol.math;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * Hello world!
 *
 */
public class Spatial2Frequency
{
    public static void main( String[] args )
    {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(args[0]));
            Graphics g = img.getGraphics();
            g.drawLine(0, 0, 100, 100);
            ImageIO.write(img, "png", new File(args[1]));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
