package com.maplr.testhockeygame.mapper;

import com.maplr.testhockeygame.model.dto.PlayerDTO;
import com.maplr.testhockeygame.model.entity.Player;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", uses=TeamMapper.class, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PlayerMapper {

    @Mapping(target = "team.players", ignore = true)
    PlayerDTO playerToPlayerDTO(Player player);

    @Mapping(target = "team.players", ignore = true)
    Player playerDTOToPlayer(PlayerDTO playerDTO);

    List<Player> playersDTOToPlayers(List<PlayerDTO> playersDTO);

    List<PlayerDTO> playersToPlayersDTO(List<Player> players);

}
