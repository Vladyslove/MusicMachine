import javax.sound.midi.*;

/**
 * Created by User on 05.09.2017.
 */
public class ShortMusicApp {
    public static void main(String[] args) {
        ShortMusicApp smp = new ShortMusicApp();
        if(args.length < 2) {
            System.out.println("Don't forget the instrument and note args");
        } else {
            int instrument = Integer.parseInt(args[0]);
            int note = Integer.parseInt(args[1]);
            smp.play(instrument,note);
        }
    }

    public void play(int instrument, int note) {
        try {
            /*The Sequencer is the thing that actually causes a song to be played (Let's imagine it like music CD player)*/
            Sequencer player = MidiSystem.getSequencer();
            player.open();

            /*The Sequence is the song, the musical piece that the Sequencer will play.
            (Let's imagine it like a CD, but it plays only one song)*/
            Sequence seq = new Sequence(Sequence.PPQ, 4);

            /* Track is the place, where all the songs lives*/
            Track track = seq.createTrack();

            MidiEvent event = null;

            ShortMessage shm0 = new ShortMessage();
            shm0.setMessage(192,1,instrument,0);
            MidiEvent changeInstrument = new MidiEvent(shm0, 1);
            track.add(changeInstrument);

            ShortMessage shm1 = new ShortMessage();
            shm1.setMessage(144,1, note,75); // start playing note 3.
            // Also see setMessage parameters explanation in resources
            MidiEvent noteOn = new MidiEvent(shm1, 1); // to trigger message shm1 at the first beat
            track.add(noteOn); // Track hold all the MidiEvent objects.

            ShortMessage shm2 = new ShortMessage();
            shm2.setMessage(128,1,3,75);
            MidiEvent noteOff = new MidiEvent(shm2, 12);
            track.add(noteOff);

            /* Give the Sequence to the Sequencer (like putting the CD in the CD player)*/
            player.setSequence(seq);

            player.start(); // start the Sequencer (like pushing play)


        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }
    }
}
