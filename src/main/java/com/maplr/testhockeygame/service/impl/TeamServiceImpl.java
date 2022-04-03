package com.maplr.testhockeygame.service.impl;

import com.maplr.testhockeygame.dao.TeamDAO;
import com.maplr.testhockeygame.model.dto.TeamDTO;
import com.maplr.testhockeygame.model.entity.Team;
import com.maplr.testhockeygame.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamServiceImpl implements TeamService {

    @Autowired
    private TeamDAO teamDAO;

    @Override
    public TeamDTO getTeamByYear(Long year) {
        return teamDAO.getTeamByYear(year);
    }
}

