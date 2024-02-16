package creational.prototype;
// Approach-1
public class Main {
    public static void main(String[] args) {
        Pot p1 = new Pot(20, 30, 10, "Red", "moneyPlant");
        Pot p2 = new Pot();
        Pot p3 = new Pot();
        Pot p4 = new Pot();
        Pot p5 = new Pot();

        // Option 1
        createCopies(p1, p2);
        createCopies(p1, p3);
        createCopies(p1, p4);
        createCopies(p1, p5);

    }

    // Consider a developer adds a new attribute private plant to pot.
    // He misses getters and setters, hence, that attribute can't be initiated
    // This approach is Tighlty coupled with Class and hence high chances of failure
    public static void createCopies(Pot p1, Pot p2){
        p2.setHeight(p1.getHeight());
        p2.setWeight(p1.getWeight());
        p2.setWidth(p1.getWidth());
        p2.setColor("Pink");
    }
}
