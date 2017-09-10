package forTesting;

import com.sun.prism.paint.Gradient;

import javax.swing.*;
import java.awt.*;

/**
 * Created by User on 09.09.2017.
 */
public class MyDrawPanel extends JPanel {
    public void paintComponent (Graphics g) {
        g.setColor(Color.blue);

        g.fillRect(25, 55, 95,95);
    }

    public void paintComponent2 (Graphics g) {
        Image image = new ImageIcon("example.jpg").getImage();

        g.drawImage(image, 2,3,this);
    }

    public void paintComponent3 (Graphics g) {

        g.fillRect(0,0,this.getWidth(),this.getHeight());

        int red = (int) (Math. random() * 255);
        int green = (int) (Math. random() * 255);
        int blue = (int) (Math. random() * 255);

        Color randomColor = new Color(red, green, blue);
        g.setColor(randomColor);
        g.fillOval(65,65, 96,96);
    }

    public void paintComponent4 (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        GradientPaint gradient = new GradientPaint(65, 65, Color.red, 145, 145, Color.green);

        g2d.setPaint(gradient);

        g2d.fillOval(65,65, 95,95);
    }

    public void paintComponent5 (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        int red = (int) (Math. random() * 255);
        int green = (int) (Math. random() * 255);
        int blue = (int) (Math. random() * 255);
        Color startColor = new Color(red, green, blue);

        red = (int) (Math. random() * 255);
        green = (int) (Math. random() * 255);
        blue = (int) (Math. random() * 255);
        Color endColor = new Color(red, green, blue);

        GradientPaint gradient = new GradientPaint(66,66,startColor, 146,146, endColor);
        g2d.setPaint(gradient);
        g2d.fillOval(66,66,96,96);
    }





    }
