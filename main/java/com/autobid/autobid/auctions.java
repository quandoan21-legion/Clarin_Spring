package com.autobid.autobid;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "auctions")
public class auctions {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "car_id")
    private int car_id;
    @Column(name = "start_time")
    private Date start_time;
    @Column(name = "end_time")
    private Date end_time;
    @Column(name = "owner_id")
    private int owner_id;
}
