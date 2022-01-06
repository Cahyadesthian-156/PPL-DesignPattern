public class FilePlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    

    @Override
    public void play(String audioType, String fileName) {
        //inbuilt support to mp3 files
        if(audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 formatted file.");
            System.out.println("Name mp3 file : " + fileName);
            System.out.println();
        } else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            //mediaAdapter is providing support to play other formats
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Sorry invalid media 😢");
        }
    }
    
}
