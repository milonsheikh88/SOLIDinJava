package ISP.violates;

public class VlcMediaPlayer implements MediaPlayer{
    @Override
    public void playAudio() {
        System.out.println("VlcMediaPlayer Play Audio....");
    }

    @Override
    public void playVideo() {
        System.out.println("VlcMediaPlayer Play Video....");
    }
}
