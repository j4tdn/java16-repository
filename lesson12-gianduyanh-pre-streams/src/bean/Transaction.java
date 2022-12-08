package bean;

public class Transaction {
    private Trade traders;
    private int year;
    private int price;

    public Transaction(Trade traders, int year, int price) {
        this.traders = traders;
        this.year = year;
        this.price = price;
    }

    public Trade getTraders() {
        return traders;
    }

    public void setTraders(Trade traders) {
        this.traders = traders;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "traders=" + traders +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}