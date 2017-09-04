import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;

/**
 * Created by User on 05.09.2017.
 */
public class ShortMusicApp {
    public static void main(String[] args) {
        ShortMusicApp smp = new ShortMusicApp();
        smp.play();
    }

    public void play() {
        try {
            Sequencer player = MidiSystem.getSequencer();
            player.open();
        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        }
    }
}
