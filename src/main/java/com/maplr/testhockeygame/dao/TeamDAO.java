package com.maplr.testhockeygame.dao;

import com.maplr.testhockeygame.mapper.TeamMapper;
import com.maplr.testhockeygame.model.dto.TeamDTO;
import com.maplr.testhockeygame.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TeamDAO {

    @Autowired
    private TeamMapper teamMapper;

    @Autowired
    private TeamRepository teamRepository;

    public TeamDTO getTeamByYear(Long year)
    {
        return teamMapper.teamToTeamDTO(teamRepository.findTeamByYear(year));
    }
}
