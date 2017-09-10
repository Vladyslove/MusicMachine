package forTraining;

import oracle.jrockit.jfr.JFR;

import javax.swing.*;
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
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        frame.repaint(); 
    }
}
