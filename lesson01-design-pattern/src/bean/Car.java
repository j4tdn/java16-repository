package bean;

public class Car {
    private String id;
    private String name;
    private String color;
    private int weight;
    private double price;

    public Car(CarBuilder carBuilder){
        if(carBuilder.getId() == null){
            throw new IllegalStateException("Missing ID");
        }
        this.id = carBuilder.getId();
        this.name = carBuilder.getName();
        this.color = carBuilder.getColor();
        this.weight = carBuilder.getWeight();
        this.price = carBuilder.getPrice();
    }

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
    public String toString() {
        return "Car{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                '}';
    }
}
