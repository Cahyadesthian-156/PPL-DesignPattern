import java.io.File;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("cahya.ogg", "mp4");
    }
}
