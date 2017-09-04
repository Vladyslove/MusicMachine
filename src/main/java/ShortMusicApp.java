import javax.sound.midi.*;

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
            /*The Sequencer is the thing that actually causes a song to be played (Let's imagine it like music CD player)*/
            Sequencer player = MidiSystem.getSequencer();
            player.open();

            /*The Sequence is the song, the musical piece that the Sequencer will play.
            (Let's imagine it like a CD, but it plays only one song)*/
            Sequence seq = new Sequence(Sequence.PPQ, 4);

            /* Track is the place, where all the songs lives*/
            Track track = seq.createTrack();


        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }
    }
}
