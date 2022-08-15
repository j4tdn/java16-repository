package bean;

public class Car {
    public int serial;
    public static String model = "Audi";
    public String color;

    public Car(){

    }

    public Car(int serial, String color){
        this.serial = serial;
        this.color = color;
    }

    public static String getModel(){
        return Car.model;
    }

    public static void setModel(String model){
        Car.model = model;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return Car.model + " " + this.getColor();
    }
}
