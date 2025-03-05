package OrderManagementSystem;

import java.time.LocalDate;
//rendelések osztaálya.
//A propertijei private, mert csak itt használatosak, és final, mert nem változnak
public class Order {
    private final Integer totalAmount;
    private final LocalDate localdate;

    public Order(Integer totalAmmount, LocalDate ld) {
        this.totalAmount = totalAmmount;
        this.localdate = ld;
    }

    public LocalDate getLocaldate() {
        return localdate;
    }
}
