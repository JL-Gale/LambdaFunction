package org.example.clase11;

import java.time.Month;

public class venta {

    private Month month;
    private Double total;

    public venta(Month month, Double total) {
        this.month = month;
        this.total = total;
    }

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "venta{" +
                "month=" + month +
                ", total=" + total +
                '}';
    }
}
