package com.maplr.testhockeygame.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import lombok.Data;
import lombok.ToString;

@Data
public class PlayerDTO {

    @JsonIgnore
    private Long id;

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
