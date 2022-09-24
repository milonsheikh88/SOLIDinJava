package ISP.violates;

public class WinampMediaPlayer implements MediaPlayer{
    @Override
    public void playAudio() {
        System.out.println("WinampMediaPlayer Play Audio....");
    }


    //This is violates ISP rolls .....
    // Client should be forced implant playVideo method.....
    @Override
    public void playVideo() {
        System.out.println("WinampMediaPlayer Not Supported Play Video....");
    }
}
