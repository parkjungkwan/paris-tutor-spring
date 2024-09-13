package com.joeunseo.hotel.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "schedule")
public class ScheduleEntity {
    @Id
    @Column(name = "stadium_id", length = 10)
    private String stadiumId;

    @Id
    @Column(name = "sche_date", length = 10)
    private String scheDate;

    @Column(name = "gubun", length = 10)
    private String gubun;

    @Column(name = "hometeam_id", length = 10)
    private String hometeamId;

    @Column(name = "awayteam_id", length = 10)
    private String awayteamId;

    @Column(name = "home_score")
    private Integer homeScore;

    @Column(name = "away_score")
    private Integer awayScore;

}

