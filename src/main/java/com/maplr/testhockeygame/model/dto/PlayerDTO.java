package com.maplr.testhockeygame.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import lombok.Data;

@Data
public class PlayerDTO {

    @NotNull
    private Long number;

    @NotNull
    private String name;

    @NotNull
    private String lastname;

    @NotNull
    private String position;

    @NotNull
    private Boolean isCaptain;

    @JsonIgnore
    private TeamDTO team;

}
