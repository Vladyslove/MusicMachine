import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.Track;
import javax.swing.*;
import java.util.ArrayList;

/**
 * Created by User on 15.09.2017.
 */
public class SimpleMusicPlayer4 {

    JPanel mainPanel;
    ArrayList<JCheckBox> chechBoxList;
    Sequencer sequencer;
    Sequence sequence;
    Track track;
    JFrame frame;

    String[] instrumentNames = {"Bass Drum", "Closed Hi-Bat", "Open Hi-Hat",
            "Acoustic Snare", "Crash Cymbal", "Band Clap",
            "H1gh Tom", "Hi Bongo", "Maxacas", "Whistle", "Low Conga",
            "Cowbell", "Vibraslap", "Low-mid Tom", "High Aqoqo" , "0pQn Hi Conga"};

    int[] instruments = {35,42,46,38,49,39,50,60,70,72,64,56,58,47,67,63};
}
