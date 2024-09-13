package com.joeunseo.hotel.model.querydsl;

import com.google.common.base.Optional;
import com.joeunseo.hotel.model.entity.TeamEntity;
import java.util.List;

import org.hibernate.internal.util.collections.ConcurrentReferenceHashMap.Option;

public interface TeamQueryDSL {

    List<TeamEntity> getList();
    TeamEntity getById(Long id);
    Boolean existsTeam(Long id);
    Long getRowCount(); 
    Optional<TeamEntity> getByStadium(TeamEntity entity);
    
}
