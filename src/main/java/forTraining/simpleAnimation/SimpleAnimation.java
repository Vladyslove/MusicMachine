package forTraining.simpleAnimation;

import javax.swing.*;
import java.awt.*;

/**
 * Created by User on 11.09.2017.
 */
public class SimpleAnimation {

    int x = 70;
    int y = 70;

    public static void main(String[] args) {
        SimpleAnimation gui = new SimpleAnimation();
        gui.go();

    }

    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(drawPanel);
        frame.setSize(275, 275);
        frame.setVisible(true);
    }


    class MyDrawPanel extends JPanel {
        public void paintComponent (Graphics g) {
            g.setColor(Color.blue);
            g.fillOval(x,y,99,99);
        }
    }
}


