package com.joeunseo.hotel.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Data
@Table(name = "stadium")
public class StadiumEntity {

    @Id
    @Column(name = "stadium_id", length = 10)
    private String stadiumId;

    @Column(name = "stadium_name", length = 40)
    private String stadiumName;

    @Column(name = "hometeam_id", length = 10)
    private String hometeamId;

    @Column(name = "seat_count")
    private Integer seatCount;

    @Column(name = "address", length = 60)
    private String address;

    @Column(name = "ddd", length = 10)
    private String ddd;

    @Column(name = "tel", length = 10)
    private String tel;
}

