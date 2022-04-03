package com.maplr.testhockeygame.model.dto;

import com.sun.istack.NotNull;
import lombok.Data;
import java.util.List;

@Data
public class TeamDTO {

    @NotNull
    private Long id;

    @NotNull
    private String coach;

    @NotNull
    private Long year;

    @NotNull
    private List<PlayerDTO> players;

}
