package com.v_stepanov.project.forTraining.archive3;

import javax.sound.midi.*;
import javax.swing.*;
import java.awt.*;

/**
 * Created by User on 12.09.2017.
 */
public class SimpleMusicPlayer3 {

    static JFrame f = new JFrame("My First Music Video");
    static MyDrawPanel ml;

    public static void main(String[] args) {
        SimpleMusicPlayer3 musicPlayer = new SimpleMusicPlayer3();
        musicPlayer.go();
    }

    public void setUpGUI() {
        ml = new MyDrawPanel();
        f.setContentPane(ml);
        f.setBounds(30,30,300,300);
        f.setVisible(true);
    }

        private void go() {
        setUpGUI();

            try {
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequencer.addControllerEventListener(ml, new int[] {127});
            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();

            int r = 0;
            for (int i = 0; i < 60; i+=4) {

                r = (int) ((Math.random() * 50) + 1);
                track.add(makeEvent(144,1, r, 100,i));
                track.add(makeEvent(176,1, 127, 0,i));
                track.add(makeEvent(128,1, r, 100,i + 2));
            }
            sequencer.setSequence(seq);
            sequencer.setTempoInBPM(120);
            sequencer.start();
        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }
    }
    private static MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
        MidiEvent event = null;
        try {
            ShortMessage a = new ShortMessage();
            a.setMessage(comd, chan, one, two);
            event = new MidiEvent(a, tick);
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        } return event;
    }

    class MyDrawPanel extends JPanel implements ControllerEventListener{

        boolean msg = false;

        @Override
        public void controlChange(ShortMessage event) {
            msg = true;
            repaint();
        }

        public void paintComponent(Graphics g) {
            if(msg) {
                Graphics2D g2d = (Graphics2D) g;
                int r = (int) (Math.random() * 250);
                int gr = (int) (Math.random() * 250);
                int b = (int) (Math.random() * 250);

                g.setColor(new Color(r,gr,b));

                int ht = (int) ((Math.random() * 222) + 10);
                int width = (int) ((Math.random() * 222) + 10);
                int x = (int) ((Math.random() * 111) + 10);
                int y = (int) ((Math.random() * 111) + 10);
                g.fillRect(x, y, width, ht);
                msg = false;
            }
        }
    }
}


