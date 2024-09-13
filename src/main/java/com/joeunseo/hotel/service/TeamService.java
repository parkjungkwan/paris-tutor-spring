
package com.joeunseo.hotel.service;

import com.joeunseo.hotel.model.entity.TeamEntity;

import java.util.List;

public interface TeamService {
    List<TeamEntity> findAll();
    TeamEntity findById(Long id);
    Boolean existsById(Long id);
    Long count();
    Boolean deleteById(Long id);
    Boolean save(TeamEntity entity);
}

