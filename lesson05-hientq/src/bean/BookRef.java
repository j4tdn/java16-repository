package bean;

public class BookRef  extends Book{
    private float tax;


    public BookRef(String id, double price, String publisher, float tax) {
        super("STK"+id, price, publisher);
        this.tax = tax;
    }

    public float getTax() {
        return tax;
    }

    public void setTax(float tax) {
        this.tax = tax;
    }
}
