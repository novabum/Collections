package OrderManagementSystem;

import java.time.LocalDate;
import java.util.Date;

public class Order {
    private Integer totalAmmount;
    private LocalDate ld;

    public Order(Integer totalAmmount, LocalDate ld) {
        this.totalAmmount = totalAmmount;
        this.ld = ld;
    }

    public LocalDate getLd() {
        return ld;
    }
}
