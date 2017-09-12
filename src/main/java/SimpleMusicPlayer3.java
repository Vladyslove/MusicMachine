import javax.sound.midi.*;
import javax.swing.*;
import java.awt.*;

/**
 * Created by User on 12.09.2017.
 */
public class SimpleMusicPlayer3 implements ControllerEventListener {

    public static void main(String[] args) {
        SimpleMusicPlayer3 musicPlayer2 = new SimpleMusicPlayer3();
        musicPlayer2.go();
    }

    private void go() {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();

            int[] eventIWant = {127};
            sequencer.addControllerEventListener(this, eventIWant);

            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();

            for (int i = 5; i < 66; i+=5) {

                track.add(makeEvent(144,1, i, 100,i));
                track.add(makeEvent(176,1, 127, 0,i));
            }

            sequencer.setSequence(seq);
            sequencer.setTempoInBPM(222);
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

    @Override
    public void controlChange(ShortMessage event) {
        System.out.print("bang ");
    }

    class MyDrawPanel extends JPanel {
        public void paintComponent(Graphics g) {

            Graphics2D g2d = (Graphics2D) g;
            int red = (int) (Math.random() * 250);
            int green = (int) (Math.random() * 250);
            int blue = (int) (Math.random() * 250);
        }
    }

}


