package forTraining.simpleAnimation;

import javax.swing.*;
import java.awt.*;

/**
 * Created by User on 11.09.2017.
 */
public class SimpleAnimation {

    int x = 25;
    int y = 25;

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

        for (int i = 0; i < 125; i++) {
            x++;
            y++;

            drawPanel.repaint();

            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    class MyDrawPanel extends JPanel {
        public void paintComponent (Graphics g) {
            g.setColor(Color.white);
            g.fillRect(0,0,this.getWidth(),this.getHeight());

            g.setColor(Color.blue);
            g.fillOval(x,y,33,33);
        }
    }
}


