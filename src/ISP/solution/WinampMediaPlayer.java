package ISP.solution;

import ISP.violates.MediaPlayer;

public class WinampMediaPlayer implements AudioMediaPlayer {
    @Override
    public void playAudio() {
        System.out.println("ISP: WinampMediaPlayer Play Audio....");
    }
}
