package shopping;

public class Item {
    private String id;
    private String color;
    private String OS;
    private double cost;

    public Item() {
    }

    public Item(String id, String color, String OS, double cost) {
        this.id = id;
        this.color = color;
        this.OS = OS;
        this.cost = cost;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id='" + id + '\'' +
                ", color='" + color + '\'' +
                ", OS='" + OS + '\'' +
                ", cost=" + cost +
                '}';
    }


}
