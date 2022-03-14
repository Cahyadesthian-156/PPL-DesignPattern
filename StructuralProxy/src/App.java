public class App {
    
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        YouTubeDownloader naiveYouTubeDownloader = new YouTubeDownloader(new ThirdPartyYouTubeClass());
        YouTubeDownloader smartYouTubeDownloader = new YouTubeDownloader(new YouTubeCacheProxy());

        long naive = test(naiveYouTubeDownloader);
        long smart = test(smartYouTubeDownloader);
        System.out.println("TIme saved by caching proxy: " + (naive - smart) + "ms");
    }

    private static long test(YouTubeDownloader downloader) {
        long startTime = System.currentTimeMillis();

        //user behavior in our app
        downloader.renderPopularVideos();
        downloader.renderVideoPage("id1");

        downloader.renderPopularVideos();
        downloader.renderVideoPage("id2");

        downloader.renderPopularVideos();
        downloader.renderVideoPage("id3");
    

        //users might visit the same page quite often
        downloader.renderVideoPage("id4");
        downloader.renderVideoPage("id5");
        // downloader.renderVideoPage("id5");
        // downloader.renderVideoPage("id5");
        downloader.renderVideoPage("id3");
        downloader.renderVideoPage("id3");

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println("Time elapsed: " + estimatedTime + "ms\n");
        return estimatedTime;
    
    
    }



}
