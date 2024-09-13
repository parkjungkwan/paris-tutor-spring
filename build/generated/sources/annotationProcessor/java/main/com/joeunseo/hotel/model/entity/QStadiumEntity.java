package com.joeunseo.hotel.model.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QStadiumEntity is a Querydsl query type for StadiumEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QStadiumEntity extends EntityPathBase<StadiumEntity> {

    private static final long serialVersionUID = 1093172881L;

    public static final QStadiumEntity stadiumEntity = new QStadiumEntity("stadiumEntity");

    public final StringPath address = createString("address");

    public final StringPath ddd = createString("ddd");

    public final StringPath hometeamId = createString("hometeamId");

    public final NumberPath<Integer> seatCount = createNumber("seatCount", Integer.class);

    public final StringPath stadiumId = createString("stadiumId");

    public final StringPath stadiumName = createString("stadiumName");

    public final StringPath tel = createString("tel");

    public QStadiumEntity(String variable) {
        super(StadiumEntity.class, forVariable(variable));
    }

    public QStadiumEntity(Path<? extends StadiumEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QStadiumEntity(PathMetadata metadata) {
        super(StadiumEntity.class, metadata);
    }

}

