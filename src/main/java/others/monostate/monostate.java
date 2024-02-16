package others.monostate;

public class monostate {
    private static int sharedData;

    public monostate() {
    }

    public int getSharedData() {
        return sharedData;
    }

    public void setSharedData(int sharedData) {
        monostate.sharedData = sharedData;
    }

    public static void main(String[] args) {
        monostate instance1 = new monostate();
        System.out.println(instance1.getSharedData()); // prints 0

        monostate instance2 = new monostate();
        instance2.setSharedData(100);

        System.out.println(instance2.getSharedData()); // prints 100
        System.out.println(instance1.getSharedData()); // prints 100


    }
}
