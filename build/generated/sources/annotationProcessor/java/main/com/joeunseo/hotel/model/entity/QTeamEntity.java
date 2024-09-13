package com.joeunseo.hotel.model.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTeamEntity is a Querydsl query type for TeamEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTeamEntity extends EntityPathBase<TeamEntity> {

    private static final long serialVersionUID = 1292385775L;

    public static final QTeamEntity teamEntity = new QTeamEntity("teamEntity");

    public final StringPath address = createString("address");

    public final StringPath ddd = createString("ddd");

    public final StringPath eTeamName = createString("eTeamName");

    public final StringPath fax = createString("fax");

    public final StringPath homepage = createString("homepage");

    public final StringPath origYyyy = createString("origYyyy");

    public final StringPath owner = createString("owner");

    public final StringPath regionName = createString("regionName");

    public final StringPath stadiumId = createString("stadiumId");

    public final StringPath teamId = createString("teamId");

    public final StringPath teamName = createString("teamName");

    public final StringPath tel = createString("tel");

    public final StringPath zipCode1 = createString("zipCode1");

    public final StringPath zipCode2 = createString("zipCode2");

    public QTeamEntity(String variable) {
        super(TeamEntity.class, forVariable(variable));
    }

    public QTeamEntity(Path<? extends TeamEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTeamEntity(PathMetadata metadata) {
        super(TeamEntity.class, metadata);
    }

}

