/**
 * 1
 * Data interface
 * define read and write operation
 * 
 */

 public interface DataSource {
     void writeData(String data);

     String readData();
 }