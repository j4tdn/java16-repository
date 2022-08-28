package inheritance.finterface;

public class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Rectangle --> draw ...");
    }

    @Override
    public void calS() {
        System.out.println("Rectangle --> cals ...");
    }
}
