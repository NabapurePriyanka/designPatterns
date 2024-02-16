package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class CarMain {


    public static void main(String[] args) {
        Tata c = new Tata(2, 1, 4);
        Hyundai h = new Hyundai(2,10,11);

        Tata c1 = new Tata();
        Tata c2 = new Tata();

        Hyundai h1 = new Hyundai();
        Hyundai h2 = new Hyundai();

        createCopies(c1, c);

    }

    public static void createCopies(Car c1, Car c){
        c1.clone((Car)c);
        System.out.println(c1.toString());
    }
}
