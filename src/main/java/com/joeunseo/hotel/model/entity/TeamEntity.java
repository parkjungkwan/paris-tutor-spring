package com.joeunseo.hotel.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "team")
public class TeamEntity {

    @Id
    @Column(name = "team_id", length = 10)
    private String teamId;

    @Column(name = "region_name", length = 10)
    private String regionName;

    @Column(name = "team_name", length = 40)
    private String teamName;

    @Column(name = "e_team_name", length = 50)
    private String eTeamName;

    @Column(name = "orig_yyyy", length = 10)
    private String origYyyy;

    @Column(name = "stadium_id", length = 10)
    private String stadiumId;

    @Column(name = "zip_code1", length = 10)
    private String zipCode1;

    @Column(name = "zip_code2", length = 10)
    private String zipCode2;

    @Column(name = "address", length = 80)
    private String address;

    @Column(name = "ddd", length = 10)
    private String ddd;

    @Column(name = "tel", length = 10)
    private String tel;

    @Column(name = "fax", length = 10)
    private String fax;

    @Column(name = "homepage", length = 50)
    private String homepage;

    @Column(name = "OWNER", length = 10)
    private String owner;

}

