package com.autobid.autobid;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "bids")
public class bids {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "user_id")
    private int user_id;
    @Column(name = "auction_id")
    private int auction_id;
    @Column(name = "bid_amount")
    private double bid_amount;
    @Column(name = "bid_time")
    private Date bid_time;
}
