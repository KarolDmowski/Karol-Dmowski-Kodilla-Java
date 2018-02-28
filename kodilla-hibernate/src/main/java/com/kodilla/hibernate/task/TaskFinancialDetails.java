package com.kodilla.hibernate.task;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "TASK_FINACIALS")
public class TaskFinancialDetails {
    private int id;
    private BigDecimal price;
    private boolean pasi;

    public TaskFinancialDetails(){
    }

    public TaskFinancialDetails(BigDecimal price, boolean pasi) {
        this.price = price;
        this.pasi = pasi;
    }
}
