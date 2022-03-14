import java.io.*;

/**
 * 2
 * Simple data reader-writer
 * 
 */

public class FileDataSource implements DataSource {

    public String name;

    public FileDataSource(String name) {
        this.name = name;
    }

    @Override
    public void writeData(String data) {
        // TODO Auto-generated method stub
        File file = new File(name);
        try (OutputStream fos = new FileOutputStream(file)) {
            fos.write(data.getBytes(),0,data.length());
        } catch (IOException ex) {
            //TODO: handle exception
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public String readData() {
        // TODO Auto-generated method stub
        
        char[] buffer = null;
        File file = new File(name);
        try(FileReader reader = new FileReader(file)) {
            buffer = new char[(int) file.length()];
            reader.read(buffer);
        } catch (IOException exIO) {
            //TODO: handle exception
            System.out.println(exIO.getMessage());
        }
        return new String(buffer);
    }
    
}
