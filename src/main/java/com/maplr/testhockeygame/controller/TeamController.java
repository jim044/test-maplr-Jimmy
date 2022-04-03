package com.maplr.testhockeygame.controller;


import com.maplr.testhockeygame.model.dto.PlayerDTO;
import com.maplr.testhockeygame.model.dto.TeamDTO;
import com.maplr.testhockeygame.service.PlayerService;
import com.maplr.testhockeygame.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TeamController {

    @Autowired
    private TeamService teamService;

    @Autowired
    private PlayerService playerService;

    @GetMapping(path = "/team/{year}")
    public TeamDTO getTeamByYear(@PathVariable Long year){
        return teamService.getTeamByYear(year);
    }

    @PostMapping(path = "/team/{year}", consumes="application/json")
    public ResponseEntity<PlayerDTO> savePlayer(@PathVariable long year, @RequestBody PlayerDTO playerDTO) throws Exception {
        return new ResponseEntity(playerService.savePlayerByTeamYear(year, playerDTO), HttpStatus.CREATED);

    }

    @PutMapping(path = "/player/captain/{id}")
    public PlayerDTO updateCaptainPlayer(@PathVariable Long id){
        return playerService.updateCaptainPlayer(id);
    }
}
