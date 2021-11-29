public class SingleClass {

    //create object
    private static SingleClass singleInstance = new SingleClass();

    //make private instructor so this class can't be initiated
    private SingleClass(){}

    //get the objet avaliable attr
    public static SingleClass getInstance() {
        return singleInstance;
    }

    public void showGreetMEssage() {
        System.out.println("Hi, Nice To See ya :D");
    }

}