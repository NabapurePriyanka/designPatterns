package creational.singleton;

// The below code is a singleton design pattern
// for single threaded environment

public class DBC {
    // private: To restrict the access
    // static: To provide access without the creation of class
    private static DBC instance;

    // private constructor to restrict the object creation from outside the class
    private DBC(){

    }

    public static DBC getInstance(){
        if(instance == null){
            instance = new DBC();
        }

        return instance;

    }
}
