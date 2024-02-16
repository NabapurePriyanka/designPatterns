package creational.singleton;

// The below code is for multithreaded environment and is called as , Lazy Initialisation/Loading

public class DBCMultithreaded2 {
    private static DBCMultithreaded2 instance;

    private static Object lock = 0;

    // To restrict the creation of object from outside the class
    private DBCMultithreaded2(){

    }

    public static DBCMultithreaded2 getInstance(){
        if(instance == null){
            synchronized (lock){
                // This is called double lock checking
                if(instance != null){
                    instance = new DBCMultithreaded2();
                }
            }
        }
        return instance;
    }
}
