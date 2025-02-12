package com.autobid.autobid;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "comments")
public class comments {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "user_id")
    private int user_id;
    @Column(name = "car_id")
    private int car_id;
    @Column(name = "created_at")
    private Date created_at;
    @Column(name = "auction_id")
    private int auction_id;
}
