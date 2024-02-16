package creational.prototype;

public class BottleMain {
    public static void main(String[] args) {
        Bottle b = new Bottle(20, 30, 10, "Red", "moneyPlant");

        try{
            Bottle b1 = (Bottle)b.clone();
            Bottle b2 = (Bottle)b.clone();
            Bottle b3 = (Bottle)b.clone();
            Bottle b4 = (Bottle)b.clone();
        } catch(Exception e){
            System.out.println(e.getMessage());
        }

        // Add first create object and then create copies method during revisit
    }
}
