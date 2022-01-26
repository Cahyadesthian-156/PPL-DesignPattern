import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

/**
 * 5
 * COmpression
 */

public class CompressionDecorator extends DataSourceDecorator {

    private int compLevel = 6;

    CompressionDecorator(DataSource dataSource) {
        super(dataSource);
        //TODO Auto-generated constructor stub
    }
    
    public int getCompressionLevet() {
        return this.compLevel;
    }

    public void setCompressionLevel(int value) {
        this.compLevel = value;
    }

    @Override
    public void writeData(String data) {
        super.writeData(compress(data));
    }

    @Override
    public String readData() {
        return decompress(super.readData());
    }

    private String decompress(String readData) {

        byte[] data = Base64.getDecoder().decode(readData);
        try {
            InputStream in = new ByteArrayInputStream(data);
            InflaterInputStream iin = new InflaterInputStream(in);
            ByteArrayOutputStream bout = new ByteArrayOutputStream(512);
            int b;
            while( (b = iin.read()) != -1 ) {
                bout.write(b);
            }
            in.close();
            iin.close();
            bout.close();
            return new String(bout.toByteArray());
        } catch (IOException e) {
            //TODO: handle exception
            return null;
        }

       
    }

    private String compress(String theData) {
        byte[] data = theData.getBytes();
        try {
            ByteArrayOutputStream bout = new ByteArrayOutputStream(512);
            DeflaterOutputStream dos = new DeflaterOutputStream(bout, new Deflater(compLevel));
            dos.write(data);
            dos.close();
            bout.close();
            return Base64.getEncoder().encodeToString(bout.toByteArray());
        } catch (IOException e) {
            //TODO: handle exception

            return null;

        }
        
    }

}
