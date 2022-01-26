/**
 * 6
 * Client COde
 */

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        String salaryRecord = "Name\t\t|\tSalary\nCahyadesthian\t|\t10000000\nWidigda\t\t|\t15000000";
        DataSourceDecorator encoded = new CompressionDecorator(new EncryptionDecorator(new FileDataSource("OutputDemo.txt")));

        encoded.writeData(salaryRecord);
        DataSource plain = new FileDataSource("OutputDemo.txt");

        System.out.println("- Input ----------");
        System.out.println(salaryRecord);
        System.out.println("- Encoded -----------");
        System.out.println(plain.readData());
        System.out.println("- Decoded ----------");
        System.out.println(encoded.readData());

    }
}
