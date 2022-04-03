package com.maplr.testhockeygame.dao;

import com.maplr.testhockeygame.mapper.PlayerMapper;
import com.maplr.testhockeygame.model.dto.PlayerDTO;
import com.maplr.testhockeygame.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PlayerDAO {

    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private PlayerMapper playerMapper;

    public PlayerDTO savePlayer(PlayerDTO playerDTO) {
        return playerMapper.playerToPlayerDTO(playerRepository.save(playerMapper.playerDTOToPlayer(playerDTO)));
    }

    public PlayerDTO getPlayerByID(Long id) {
        return playerMapper.playerToPlayerDTO(playerRepository.findById(id).get());
    }
}
