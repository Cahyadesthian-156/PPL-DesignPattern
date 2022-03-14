import java.io.File;

/**
 * 9 The Facade
 * provide simple interface of video conversion
 */
public class VideoConversionFacade {
    
    public File convertVideo(String fileName, String format) {
        
        System.out.println("VideoConversionFacade: [CONVERSION STARTED.]");
        VideoFile file = new VideoFile(fileName);
        Codec sourceCodec = CodecFactory.extract(file);
        Codec destinationCodec;

        if(format.equals("mp4")) {
            destinationCodec = new OggCompressionCodec();
        } else {
            destinationCodec = new MPEG4CompressionCodec();
        }

        VideoFile buffer = BitrateReader.read(file, sourceCodec);
        VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);

        File result = (new AudioMixer()).fix(intermediateResult);
        System.out.println("VideoConversionFacade: [CONVERSION COMPLETED.]");
        
        return result;
        
    }


}
