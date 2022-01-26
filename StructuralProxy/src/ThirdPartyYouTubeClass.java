/**
 * 2
 * Remote Service Implementation
 */

import java.util.HashMap;

public class ThirdPartyYouTubeClass implements ThirdPartyYouTubeLib {

    @Override
    public HashMap<String, Video> popularVideos() {
        // TODO Auto-generated method stub
        connectToServer("http://www.youtube.com");
        return getRandomVideos();
    }

    @Override
    public Video getVideo(String videoId) {
        // TODO Auto-generated method stub
        connectToServer( "http://www.youtube.com/" + videoId);
        return getSomeVideo(videoId);
    }
    

    //Fake Method that simulate network acitivit
    //It said that it slow as real life

    private Video getSomeVideo(String videoId) {
        System.out.println("Donwloading Video... ");

        experienceNetworkLatency();
        Video video = new Video(videoId, "Some video title");

        System.out.println("Done!");
        
        return video;
    }

    private int random(int min, int max) {
        return min+(int)(Math.random()*((max-min)+1));
    }


    private void experienceNetworkLatency() {
        int randomLatency = random(5,10);
        for(int i=0; i<randomLatency; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                //TODO: handle exception
                e.printStackTrace();
            }
        }
    }

    private void connectToServer(String server) {
        System.out.println("Connecting to " + server + "... ");
        experienceNetworkLatency();
        System.out.print("Connected!" + "\n");
    }

    private HashMap<String, Video> getRandomVideos() {
        System.out.print("Donwloading populars... ");

        experienceNetworkLatency();
        HashMap<String, Video> hmap = new HashMap<String,Video>();
        hmap.put("catVideo", new Video("id1", "Funny Cat.mp4"));
        hmap.put("dogVideo", new Video("id2", "Dog play with Cat.mp4"));
        hmap.put("dancingCat", new Video("id3", "Cats Dancing at university.mp4"));
        hmap.put("catPlayFootball", new Video("id4", "Cat look like Messi and CR7.avi"));
        hmap.put("catCode", new Video("id5", "Cat learn how to code"));

        System.out.print("Done!" + "\n");

        return hmap;
    }

}
