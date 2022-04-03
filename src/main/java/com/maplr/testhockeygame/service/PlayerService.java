package com.maplr.testhockeygame.service;

import com.maplr.testhockeygame.exception.CustomException;
import com.maplr.testhockeygame.model.dto.PlayerDTO;

public interface PlayerService {

    PlayerDTO savePlayerByTeamYear(Long year, PlayerDTO playerDTO) throws Exception;

    PlayerDTO updateCaptainPlayer(Long id);
}
