package bean;

public class BookStudy extends  Book{
    private String condition;

    public BookStudy(){
        super();
    }
    public BookStudy(String id, double price,String publisher, String condition) {
        super("SGK"+id, price, publisher);
        this.condition = condition;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
}
