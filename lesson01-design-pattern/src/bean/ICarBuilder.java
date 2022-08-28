package bean;

public interface ICarBuilder {
    public CarBuilder withId(String id);
    public CarBuilder withName(String name);
    public CarBuilder withColor(String color);
    public CarBuilder withPrice(double price);
    public CarBuilder withWeight(int weight);
    public Car build();
}
