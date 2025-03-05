package OrderManagementSystem;

import java.time.LocalDate;
import java.util.*;

public class OrderManager {

    private final Map<Order, String> placedOrder = new HashMap<>();

    /*public, hogy bárhonnan hozzáférhető legyen
    * void mert nem ad vissza semmit
    * beleputtolja a placedorderbe az ordert mint kucsot és az email címet, mint valuet
    * miért nem fordítva? mert a kulcs csak egyedi dolog lehet*/
    public void placeOrder(Order order, String email) {
        placedOrder.put(order, email);
    }

    /*public, hogy bárhonnan hozzáférhető legyen
    * localdate-et ad vissza
    * egy vásárlót (value vár paraméterként)
    * usert kap, végigiterál a placedordereken és a azonosítja a kulcsot (order),
    * majd abból kinyerem a dátumokat és belerakom egy ArrayLIstbe
    * Megkeresem közöttük a legfrissebbet.
    * insert -two hours later- picture here
    * */
    public LocalDate getLatestOrderOfUser(Customer customer) {
        ArrayList<LocalDate> dates = new ArrayList<>(); //új üres arraylist a dátumoknak
        for (Map.Entry<Order, String> entry : placedOrder.entrySet()) { //végigiterálunk a map-on
            if (entry.getValue().equals(customer.getEmail())) { //ha egy bejegyzés értéke megegyezik az emaillel
                dates.add(entry.getKey().getLocaldate()); //akkor a kulcsnak (order) megnézzük a tárolt dátumát
            }
        }
        if (!dates.isEmpty()) { //Ha találtunk dátumot kiírjuk a legfrissebbet
            return Collections.max(dates);
        }
        return null; // Ha nincs, null és kész
    }
}
