package creational.prototype;

public class Hyundai implements Car<Hyundai> {
    private int wheels;
    private int brake;
    private int seatbelt;

    public int getWheels() {
        return wheels;
    }

    public Hyundai(int wheels, int brake, int seatbelt) {
        this.wheels = wheels;
        this.brake = brake;
        this.seatbelt = seatbelt;
    }

    public Hyundai() {
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
    public void clone(Hyundai h) {
        this.wheels = h.getWheels();
        this.brake = h.getBrake();
        this.seatbelt = h.getBrake();
    }

    @Override
    public String toString() {
        return "Hyundai{" +
                "wheels=" + wheels +
                ", brake=" + brake +
                ", seatbelt=" + seatbelt +
                '}';
    }
}
