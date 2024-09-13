package com.joeunseo.hotel.model.querydsl.impl;

import java.util.List;

import com.google.common.base.Optional;
import com.joeunseo.hotel.model.entity.QTeamEntity;
import com.joeunseo.hotel.model.entity.TeamEntity;
import com.joeunseo.hotel.model.querydsl.TeamQueryDSL;
import com.querydsl.jpa.impl.JPAQueryFactory;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TeamQueryDSLImpl implements TeamQueryDSL {

    private final JPAQueryFactory jpaQueryFactory;
    private QTeamEntity qTeam = QTeamEntity.teamEntity;
    
    
    @Override
    public List<TeamEntity> getList() {
        return jpaQueryFactory.selectFrom(qTeam).fetch();
    }

    @Override
    public TeamEntity getById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }

    @Override
    public Boolean existsTeam(Long id) {
        return false;
    }

    @Override
    public Long getRowCount() {
        return 0L;
    }

    @Override
    public Optional<TeamEntity> getByStadium(TeamEntity entity) {
        return null;
    }


    
    
}
