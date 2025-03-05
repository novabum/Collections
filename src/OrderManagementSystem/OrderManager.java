package OrderManagementSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//ha a felhasználó a kulcs, aminek egyedinek kell lennie,
//akkor kéne egy lista a vásárlásairól, és az lesz a value
//*cracking fingers*
public class OrderManager {

    private final List<Order> listOfOrders = new ArrayList<>();
    private final Map<Customer, List<Order>> customerOrders = new HashMap<>();

    //
    public void placeOrder(Customer customer, Order... order) {
        for (Order anOrder : order) {
            listOfOrders.add(anOrder); //nem hallgatunk a javara, e-loop gyakorlás van
        }
        customerOrders.put(customer, listOfOrders);
    }

    //most meg kellene találni emailcím alapján a usert
    //majd a user alapján a vásálásokon végigmenni
    //
    public Order getLatestOrderOfUser(String email) {
        List<Customer> customersInMap = new ArrayList<>();
        List<Order> foundOrders = new ArrayList<>();
        customersInMap.addAll(customerOrders.keySet());
        for (Customer customer : customersInMap) {
            if (customer.getEmail().equals(email)) {
                foundOrders = customerOrders.get(customer);
            }
        }
        return getLatestOrder(foundOrders); //getLatestOrder of orders method eredménye
    }

    // privi,mert csak classom belül használom
    private Order getLatestOrder(List<Order> orders) {
        Order latestorder = orders.get(0);
        for (Order order : orders) {
            if (order.getLocaldate().isAfter(latestorder.getLocaldate())) {
                latestorder = order;
            }
        }
        return latestorder;

    }
}
//        for (Customer customer : customerOrders.keySet() {
//            if (customer)
//        }


//    private void findUserByEmail(String email){
//        for (User user : )
//    }


