// Define the Playable interface
package Interface;

public interface Playable {
    void play();
    void pause();
    void stop();
}

// Implement the Playable interface in MusicPlayer
public class MusicPlayer implements Playable {

    public void play() {
        System.out.println("Music is playing.");
    }

    @Override
    public void pause() {
        System.out.println("Music is paused.");
    }

    @Override
    public void stop() {
        System.out.println("Music has stopped.");
    }
}

// Implement the Playable interface in VideoPlayer
public class VideoPlayer implements Playable {

    @Override
    public void play() {
        System.out.println("Video is playing.");
    }

    @Override
    public void pause() {
        System.out.println("Video is paused.");
    }

    @Override
    public void stop() {
        System.out.println("Video has stopped.");
    }
}

// Test class to demonstrate polymorphic behavior
import java.util.ArrayList;

public class TestPlayable {
    public static void main(String[] args) {
        // Create instances of MusicPlayer and VideoPlayer
        MusicPlayer musicPlayer = new MusicPlayer();
        VideoPlayer videoPlayer = new VideoPlayer();

        // Create an ArrayList of Playable objects
        ArrayList<Playable> playables = new ArrayList<>();
        playables.add(musicPlayer);
        playables.add(videoPlayer);

        // Test polymorphic behavior
        for (Playable playable : playables) {
            playable.play();
            playable.pause();
            playable.stop();
            System.out.println();
        }
    }
}
