package com.maplr.testhockeygame.mapper;

import com.maplr.testhockeygame.model.dto.TeamDTO;
import com.maplr.testhockeygame.model.entity.Team;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", uses=PlayerMapper.class, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface TeamMapper {

    @Mapping(source = "team.players", target = "players")
    TeamDTO teamToTeamDTO(Team team);

    @Mapping(source = "teamDTO.players", target = "players")
    Team teamDTOToTeam(TeamDTO teamDTO);
}
