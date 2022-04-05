package com.maplr.testhockeygame.model.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "team")
@Data
public class Team implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "coach", nullable = false)
    private String coach;

    @Column(name = "year", nullable = false, unique=true)
    private Long year;

    @OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL, mappedBy="team")
    private List<Player> players;

}
