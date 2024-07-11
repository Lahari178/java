package Collections;

import java.util.ArrayList;

interface Playable {
    void play();
    void pause();
    void stop();
}

class MusicPlayer implements Playable {
  
    public void play() {
        System.out.println("Music is playing.");
    }

    public void pause() {
        System.out.println("Music is paused.");
    }

    public void stop() {
        System.out.println("Music is stopped.");
    }
}

class VideoPlayer implements Playable {
 
    public void play() {
        System.out.println("Video is playing.");
    }

    public void pause() {
        System.out.println("Video is paused.");
    }

    public void stop() {
        System.out.println("Video is stopped.");
    }
}

public class Main {
    public static void main(String[] args) {
       
        ArrayList<Playable> playableList = new ArrayList<>();

        playableList.add(new MusicPlayer());
        playableList.add(new VideoPlayer());

        
        for (Playable playable : playableList) {
            playable.play();
            playable.pause();
            playable.stop();
            System.out.println();
        }
    }
}
