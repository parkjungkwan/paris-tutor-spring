package com.joeunseo.hotel.model.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QScheduleEntity is a Querydsl query type for ScheduleEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QScheduleEntity extends EntityPathBase<ScheduleEntity> {

    private static final long serialVersionUID = 19184425L;

    public static final QScheduleEntity scheduleEntity = new QScheduleEntity("scheduleEntity");

    public final NumberPath<Integer> awayScore = createNumber("awayScore", Integer.class);

    public final StringPath awayteamId = createString("awayteamId");

    public final StringPath gubun = createString("gubun");

    public final NumberPath<Integer> homeScore = createNumber("homeScore", Integer.class);

    public final StringPath hometeamId = createString("hometeamId");

    public final StringPath scheDate = createString("scheDate");

    public final StringPath stadiumId = createString("stadiumId");

    public QScheduleEntity(String variable) {
        super(ScheduleEntity.class, forVariable(variable));
    }

    public QScheduleEntity(Path<? extends ScheduleEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QScheduleEntity(PathMetadata metadata) {
        super(ScheduleEntity.class, metadata);
    }

}

