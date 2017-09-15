package forTraining.archive3.lightVersionGUI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by User on 09.09.2017.
 */

public class MyDrawPanel extends JPanel {
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);
        Color startColor = new Color(red, green, blue);

        red = (int) (Math.random() * 255);
        green = (int) (Math.random() * 255);
        blue = (int) (Math.random() * 255);
        Color endColor = new Color(red, green, blue);

        GradientPaint gradient = new GradientPaint(66, 66, startColor, 146, 146, endColor);
        g2d.setPaint(gradient);
        g2d.fillOval(66, 66, 96, 96);
    }
}
