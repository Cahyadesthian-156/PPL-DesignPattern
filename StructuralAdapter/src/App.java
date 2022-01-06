public class App {

    //for adapter pattern demo

    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        
        FilePlayer myFilePlayer = new FilePlayer();

        myFilePlayer.play("mp3", "Stay.mp3");
        myFilePlayer.play("vlc", "Man Jadda Wa Jadda.vlc");
        myFilePlayer.play("mp4", "nkcthi.mp4");
        myFilePlayer.play("exe", "virus.exe");
    
    }
}
