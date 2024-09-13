package com.joeunseo.hotel.model.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QPlayerEntity is a Querydsl query type for PlayerEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPlayerEntity extends EntityPathBase<PlayerEntity> {

    private static final long serialVersionUID = -1838085197L;

    public static final QPlayerEntity playerEntity = new QPlayerEntity("playerEntity");

    public final StringPath backNo = createString("backNo");

    public final StringPath birthDate = createString("birthDate");

    public final StringPath ePlayerName = createString("ePlayerName");

    public final StringPath height = createString("height");

    public final StringPath joinYyyy = createString("joinYyyy");

    public final StringPath nation = createString("nation");

    public final StringPath nickname = createString("nickname");

    public final StringPath playerId = createString("playerId");

    public final StringPath playerName = createString("playerName");

    public final StringPath position = createString("position");

    public final StringPath solar = createString("solar");

    public final StringPath teamId = createString("teamId");

    public final StringPath weight = createString("weight");

    public QPlayerEntity(String variable) {
        super(PlayerEntity.class, forVariable(variable));
    }

    public QPlayerEntity(Path<? extends PlayerEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPlayerEntity(PathMetadata metadata) {
        super(PlayerEntity.class, metadata);
    }

}

