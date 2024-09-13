
package com.joeunseo.hotel.model.repository;

import com.joeunseo.hotel.model.entity.TeamEntity;
import com.joeunseo.hotel.model.querydsl.TeamQueryDSL;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.lang.Long;

@Repository
public interface TeamRepository extends JpaRepository<TeamEntity, String>, TeamQueryDSL{

}

