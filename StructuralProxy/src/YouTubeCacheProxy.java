import java.util.HashMap;

/**
 * 4
 * Proxy
 */

public class YouTubeCacheProxy implements ThirdPartyYouTubeLib{

    private ThirdPartyYouTubeLib youtubeService;
    private HashMap<String,Video> cachePopular = new HashMap<String,Video>();
    private HashMap<String,Video> cacheAll = new HashMap<String, Video>();


    public YouTubeCacheProxy() {
        this.youtubeService = new ThirdPartyYouTubeClass();
    }


    @Override
    public HashMap<String, Video> popularVideos() {
        // TODO Auto-generated method stub


        if(cachePopular.isEmpty()) {
            cachePopular = youtubeService.popularVideos();
        } else {
            System.out.println("List Retrived from CACHE");
        }

        return cachePopular;
    }

    @Override
    public Video getVideo(String videoId) {
        // TODO Auto-generated method stub

        Video video = cacheAll.get(videoId);
        if(video==null) {
            video = youtubeService.getVideo(videoId);
            cacheAll.put(videoId,video);
        } else {
            System.out.println("Retrieved Video '" + videoId + "' from CACHE.");
        }
        return video;
    }
    

    public void reset() {
        cachePopular.clear();
        cacheAll.clear();
    }

}
