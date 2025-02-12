package com.autobid.autobid;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "car_infomation")
public class car_infomation {

    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "user_id")
    private int user_id;
    @Column(name = "year_model")
    private byte year_model;
    @Column(name = "make")
    private String make;
    @Column(name = "model")
    private String model;
    @Lob
    @Column(name = "description")
    private String description;
    @Column(name = "starting_bid")
    private int starting_bid;
    @Column(name = "image_id")
    private int image_id;
    @Column(name = "created_at")
    private Date created_at;
}
