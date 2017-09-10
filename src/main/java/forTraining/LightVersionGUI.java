package forTraining;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by User on 07.09.2017.
 */
public class LightVersionGUI implements ActionListener{
    JFrame frame;

    public static void main(String[] args) {
        LightVersionGUI LVgui = new LightVersionGUI();
        LVgui.go();
    }

    private void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Change colors");
        button.addActionListener(this); // add the listener (this) to the button

        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.setSize(333,333);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        frame.repaint();
    }
}

class MyDrawPanel extends JPanel {
    public void paintComponent (Graphics g) {
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
