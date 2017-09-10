package forTraining;

import javax.swing.*;

/**
 * Created by User on 11.09.2017.
 */
public class TwoButtons {
    JFrame frame;
    JLabel label;

    public static void main(String[] args) {
        TwoButtons gui = new TwoButtons();
        gui.go();
    }

    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton labelButton = new JButton("Cnange Label");
        labelButton.addActionListener(new LabelListener);
        
        JButton colorButton = new JButton("Change Circle");
        colorButton.addActionListener(new ColorListener);
    }
}
