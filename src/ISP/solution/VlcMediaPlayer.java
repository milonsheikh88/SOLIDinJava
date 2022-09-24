package ISP.solution;


public class VlcMediaPlayer implements AudioMediaPlayer,VideoMediaPlayer{
    @Override
    public void playAudio() {
        System.out.println("ISP: VlcMediaPlayer Play Audio....");
    }

    @Override
    public void playVideo() {
        System.out.println("ISP: VlcMediaPlayer Play Video....");
    }
}
