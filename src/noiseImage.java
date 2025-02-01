package src;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.util.Random; 

public class noiseImage
{
    public static void main(String [] args)
    {
        long start = System.nanoTime(); 
        Random random = new Random(); 
        // image is a 640 x 480 // 1.5265
        int width = 1600; 
        int height = 900; // width*9/16 -> 16 x 9 ratio (?)

        File image = new File("image.png"); 
        BufferedImage buffer = new BufferedImage(width, height, BufferedImage.TYPE_3BYTE_BGR);

        for (int y = 0; y < height; y++)
        {
            for (int x = 0; x < width; x++)
            {
               buffer.setRGB(x, y, random.nextInt()); 
            }
        }

        try 
        {
            ImageIO.write(buffer, "PNG", image);    
        } catch (Exception e) {
            System.out.println("Could not print out image"); 
            e.printStackTrace();
            System.exit(1); 
        }

        long end = System.nanoTime();
        long duration = (end - start);
        double durationMilli = (double)duration / 1000000.0;
        System.out.println("Loop time: " + durationMilli); 
    }
}