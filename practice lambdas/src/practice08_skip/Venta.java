package practice08_skip;

import java.time.Month;

public class Venta {
    private Double total;
    private Month month;

    public Venta(Double total, Month month) {
        this.total = total;
        this.month = month;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "total=" + total +
                ", month=" + month +
                '}';
    }
}
