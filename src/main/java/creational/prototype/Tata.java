package creational.prototype;

public class Tata implements Car<Tata>{

    private int wheels;
    private int brake;
    private int seatbelt;

    public int getWheels() {
        return wheels;
    }

    public Tata(int wheels, int brake, int seatbelt) {
        this.wheels = wheels;
        this.brake = brake;
        this.seatbelt = seatbelt;
    }

    public Tata() {
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getBrake() {
        return brake;
    }

    public void setBrake(int brake) {
        this.brake = brake;
    }

    public int getSeatbelt() {
        return seatbelt;
    }

    public void setSeatbelt(int seatbelt) {
        this.seatbelt = seatbelt;
    }

    @Override
    public void clone(Tata t) {
        this.wheels = t.getWheels();
        this.brake = t.getBrake();
        this.seatbelt = t.getBrake();
    }

    @Override
    public String toString() {
        return "Tata{" +
                "wheels=" + wheels +
                ", brake=" + brake +
                ", seatbelt=" + seatbelt +
                '}';
    }
}
