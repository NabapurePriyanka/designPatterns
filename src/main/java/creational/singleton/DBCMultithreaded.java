package creational.singleton;
// The below code is for multithreaded environment
// This way is called Early Initialisation/Loading
public class DBCMultithreaded {
    private static DBCMultithreaded instance = new DBCMultithreaded();

    private DBCMultithreaded(){

    }

    public static DBCMultithreaded getInstance(){
        return instance;
    }

}
