package com.maplr.testhockeygame.service;

import com.maplr.testhockeygame.model.dto.TeamDTO;
import com.maplr.testhockeygame.model.entity.Team;
import org.mapstruct.Mapping;

public interface TeamService {

    TeamDTO getTeamByYear(Long year);
}
