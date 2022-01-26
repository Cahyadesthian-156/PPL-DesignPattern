/**
 * 3
 * Abstract Base Decorator
 * 
 */

public class DataSourceDecorator implements DataSource {

    private DataSource wrappee;

    DataSourceDecorator(DataSource dataSource) {
        this.wrappee = dataSource;
    }

    @Override
    public void writeData(String data) {
        // TODO Auto-generated method stub
        
        wrappee.writeData(data);
    }

    @Override
    public String readData() {
        // TODO Auto-generated method stub
        return wrappee.readData();
    }
    
}
