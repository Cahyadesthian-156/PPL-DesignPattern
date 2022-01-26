import java.util.Base64;

/**
 * 4
 * Encryption Decorator
 * 
 */
public class EncryptionDecorator extends DataSourceDecorator {

    EncryptionDecorator(DataSource dataSource) {
        super(dataSource);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void writeData(String data) {
        super.writeData(encode(data));
    }
    
    private String encode(String data) {
        byte[] result = data.getBytes();
        for(int i=0; i<result.length; i++) {
            result[i] += (byte) 1;
        }
        
        return Base64.getEncoder().encodeToString(result);
    }

    @Override
    public String readData() {
        return decode(super.readData());
    }

    private String decode(String theData) {
        byte[] result = Base64.getDecoder().decode(theData);
        for(int i=0; i<result.length; i++) {
            result[i] -= (byte)1;
        }
        return new String(result);
    }


}
