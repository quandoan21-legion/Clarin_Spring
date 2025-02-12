package com.autobid.autobid;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "orders")
public class orders {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "user_id")
    private int user_id;
    @Column(name = "auction_id")
    private int auction_id;
    @Column(name = "order_date")
    private Date order_date;
    @Column(name = "total_amount")
    private double total_amount;
}
