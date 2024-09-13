package com.joeunseo.hotel.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "player")
public class PlayerEntity {
    @Id
    @Column(name = "player_id", length = 200)
    private String playerId;

    @Column(name = "player_name", length = 200)
    private String playerName;

    @Column(name = "team_id", length = 200)
    private String teamId;

    @Column(name = "e_player_name", length = 200)
    private String ePlayerName;

    @Column(name = "nickname", length = 200)
    private String nickname;

    @Column(name = "join_yyyy", length = 200)
    private String joinYyyy;

    @Column(name = "POSITION", length = 200)
    private String position;

    @Column(name = "back_no", length = 200)
    private String backNo;

    @Column(name = "nation", length = 200)
    private String nation;

    @Column(name = "birth_date", length = 200)
    private String birthDate;

    @Column(name = "solar", length = 200)
    private String solar;

    @Column(name = "height", length = 200)
    private String height;

    @Column(name = "weight", length = 200)
    private String weight;
}

