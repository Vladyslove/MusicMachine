package forTraining.simpleAnimation;

import javax.swing.*;
import java.awt.*;

/**
 * Created by User on 11.09.2017.
 */
public class SimpleAnimation {

    int x = 70;
    int y = 70;



    class MyDrawPanel extends JPanel {
        public void paintComponent (Graphics g) {
            g.setColor(Color.blue);
            g.fillOval(x,y,99,99);
        }
    }
}


