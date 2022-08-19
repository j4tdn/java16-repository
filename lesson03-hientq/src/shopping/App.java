package shopping;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.MonthDay;

public class App {
    public static void main(String[] args){
        // Customers
        Customer c1 = new Customer("KH1","Tran Quang Hien","0909123134","Da Nang");
        Customer c2 = new Customer("KH2","Kim Kim","0909123321","Quang Ngai");

        // Items
        Item i1 = new Item("SS10+","Black","Android",260);
        Item i2 = new Item("SS20U","Green","Android",840);
        Item i3 = new Item("IP4","White","IOS",280);
        Item i4 = new Item("IP12","Black","IOS",880);
        Item i5 = new Item("WP8+","Blue","Window Phone",560);

        // Order
        Order o1 = new Order(c1,
                new ItemDetail[]{
                        new ItemDetail(i2, 2),
                        new ItemDetail(i1, 1),
                        new ItemDetail(i4, 2)
                }, LocalDateTime.of(2022,Month.APRIL, 22, 7, 1, 33));

        Order o2 = new Order(c1,
                new ItemDetail[]{
                        new ItemDetail(i1, 4),
                        new ItemDetail(i3, 3)
                }, LocalDateTime.of(2022,5,5, 10, 1, 20));

        Order o3 = new Order(c1,
                new ItemDetail[]{
                        new ItemDetail(i4, 1),
                }, LocalDateTime.of(2022, Month.APRIL,10, 7, 1, 10));

        // Using export function
        // expport function in Order class
        System.out.println("Total price of Order 1 = " + o1.export());
        // export function in another class
        System.out.println("Total price of Order 1 = " + OrderUtils.export(o1));


    }
}
