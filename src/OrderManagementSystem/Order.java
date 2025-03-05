package OrderManagementSystem;

import java.time.LocalDate;

public class Order {
    private Integer totalAmmount;
    private LocalDate localdate;

    public Order(Integer totalAmmount, LocalDate ld) {
        this.totalAmmount = totalAmmount;
        this.localdate = ld;
    }

    public LocalDate getLocaldate() {
        return localdate;
    }
}
