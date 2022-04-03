package com.maplr.testhockeygame.repository;

import com.maplr.testhockeygame.model.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {

    Team findTeamByYear(Long year);
}
