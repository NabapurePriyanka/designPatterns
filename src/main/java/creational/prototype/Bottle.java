package creational.prototype;

// Approach - 2
public class Bottle {
    private int height;
    private int weight;
    private int width;
    private String color;
    private String plant;

    public Bottle() {
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Bottle b = new Bottle();
        b.setHeight(this.getHeight());
        b.setWeight(this.getWeight());
        b.setWidth(this.getWidth());
        b.setColor(this.getColor());
        b.setPlant(this.getPlant());
        return b;
    }

    public Bottle(int height, int weight, int width, String color, String plant) {
        this.height = height;
        this.weight = weight;
        this.width = width;
        this.color = color;
        this.plant = plant;
    }

    public Bottle(Bottle b){
        this.height = b.height;
        this.weight = b.weight;
        this.width = b.width;
        this.color = b.color;
        this.plant = b.plant;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlant() {
        return plant;
    }

    public void setPlant(String plant) {
        this.plant = plant;
    }
}
