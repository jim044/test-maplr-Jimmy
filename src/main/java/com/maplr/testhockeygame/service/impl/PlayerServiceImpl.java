package com.maplr.testhockeygame.service.impl;

import com.maplr.testhockeygame.dao.PlayerDAO;
import com.maplr.testhockeygame.dao.TeamDAO;
import com.maplr.testhockeygame.exception.CustomException;
import com.maplr.testhockeygame.model.dto.PlayerDTO;
import com.maplr.testhockeygame.model.dto.TeamDTO;
import com.maplr.testhockeygame.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    private TeamDAO teamDAO;

    @Autowired
    private PlayerDAO playerDAO;

    @Override
    public PlayerDTO savePlayerByTeamYear(Long year, PlayerDTO playerDTO) throws Exception {
        TeamDTO teamDTO = teamDAO.getTeamByYear(year);

        if(teamDTO != null){
            playerDTO.setTeam(teamDTO);
        }else{
            throw new Exception("No available Team");
        }
        
        return playerDAO.savePlayer(playerDTO);
    }

    @Override
    public PlayerDTO updateCaptainPlayer(Long id) {
        PlayerDTO playerDTO = playerDAO.getPlayerByID(id);
        playerDTO.setIsCaptain(true);
        playerDTO = playerDAO.savePlayer(playerDTO);
        return playerDTO;
    }
}
