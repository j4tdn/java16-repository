package bean;

public class Rectangle {
    // attributes
    public int width;
    public int height;
    // constructors
    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }
    // getters, setters
    public int getWidth(){
        return this.width;
    }

    public void setWidth(int width){
        this.width = width;
    }

    public int getHeight(){
        return this.height;
    }

    public void setHeight(int height){
        this.height = height;
    }
    // methods
    public String toString(){
        return this.width + ", " + height;
    }
}
