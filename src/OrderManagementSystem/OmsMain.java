package OrderManagementSystem;

import java.time.LocalDate;

public class OmsMain {
    public static void main(String[] args) {

        OrderManager orderManager = new OrderManager();

        //készítsünk pár vásárlót
        Customer customer1 = new Customer("sdgjg", "asfkg@asjbg.ss");
        Customer customer2 = new Customer("sdgsdfg4jg", "as44fkg@asjbg.ss");
        Customer customer3 = new Customer("s34dgjg", "asfk66g@a66sjbg.ss");

        //legyen pár rendelés is
        Order order1 = new Order(2455, LocalDate.of(2020, 1, 8));
        Order order2 = new Order(245455, LocalDate.of(2024, 12, 11));
        Order order3 = new Order(2433355, LocalDate.of(1990, 4, 22));

        orderManager.placeOrder(order1, customer1.getEmail());
        orderManager.placeOrder(order2, customer1.getEmail());
        orderManager.placeOrder(order3, customer1.getEmail());
//        orderManager.printOrders();

        System.out.println(orderManager.getLatestOrderOfUser(customer1).toString());
    }
}
