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
        
    }



    }
