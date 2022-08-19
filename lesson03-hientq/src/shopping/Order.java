package shopping;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;

public class Order {
    private Customer customer;
    private ItemDetail[] itemDetails;
    private LocalDateTime orderDate;

    public Order() {

    }

    public Order(Customer customer, ItemDetail[] itemDetails, LocalDateTime orderDate) {
        this.customer = customer;
        this.itemDetails = itemDetails;
        this.orderDate = orderDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ItemDetail[] getItemDetails() {
        return itemDetails;
    }

    public void setItemDetails(ItemDetail[] itemDetails) {
        this.itemDetails = itemDetails;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    // export
    public double export(){
        double total = 0;
        ItemDetail[] ids =  this.getItemDetails();
        for(ItemDetail it : ids){
            double idCost = it.getItem().getCost() * it.getQuantity();
            if(it.getItem().getCost() > 590 && LocalDate.of(2022, Month.APRIL, 22).isEqual(this.getOrderDate().toLocalDate())){
                idCost *= 0.9;
            }

            total += idCost;
        }
        return total;
    }
    @Override
    public String toString() {
        return "Order{" +
                "customer=" + customer +
                ", itemDetails=" + Arrays.toString(itemDetails) +
                ", orderDate=" + orderDate +
                '}';
    }
}
