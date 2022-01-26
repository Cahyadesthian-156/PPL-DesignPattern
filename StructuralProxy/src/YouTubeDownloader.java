/**
 * 5
 * Media downloader app
 */

import java.util.HashMap;

public class YouTubeDownloader {
    private ThirdPartyYouTubeLib api;

    public YouTubeDownloader(ThirdPartyYouTubeLib api) {
        this.api = api;
    }

    public void renderVideoPage(String videoId) {
        Video vid = api.getVideo(videoId);
        System.out.println("\n-------------------------");
        System.out.println("Video page (imagine fancy HTML)");
        System.out.println("ID: " + vid.id);
        System.out.println("Title: " + vid.title);
        System.out.println("Video: " + vid.data);
        System.out.println("\n-------------------------");
    }

    public void renderPopularVideos() {
        HashMap<String, Video> list = api.popularVideos();
        System.out.println("\n-------------------------");
        System.out.println("Most popular videos on YouTube(imagine fancy HTML)");
        for(Video video: list.values()) {
            System.out.println("ID: " + video.id + " | Title: " + video.title);
        }
        System.out.println("\n-------------------------");
    }

}
