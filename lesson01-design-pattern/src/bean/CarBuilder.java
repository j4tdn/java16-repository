package bean;

public class CarBuilder implements  ICarBuilder{
    private String id;
    private String name;
    private String color;
    private int weight;
    private double price;


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public CarBuilder withId(String id) {
        this.id = id;
        return this;
    }

    @Override
    public CarBuilder withName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public CarBuilder withColor(String color) {
        this.color = color;
        return this;
    }

    @Override
    public CarBuilder withPrice(double price) {
        this.price = price;
        return this;
    }

    @Override
    public CarBuilder withWeight(int weight) {
        this.weight = weight;
        return this;
    }


    @Override
    public Car build() {
        
        return new Car(this);
    }
}
