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
}
