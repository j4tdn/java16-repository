package shopping;

import java.time.LocalDate;
import java.time.Month;

public class OrderUtils {

    private OrderUtils(){

    }
    public static double export(Order order){
        double total = 0;
        ItemDetail[] ids = order.getItemDetails();
        for(ItemDetail id : ids){
            double idCost = id.getItem().getCost() * id.getQuantity();
            if(id.getItem().getCost() > 590 && LocalDate.of(2022, Month.APRIL, 22).isEqual(order.getOrderDate().toLocalDate())){
                idCost *= 0.9;
            }
            total += idCost;
        }
        return total;
    }
}
