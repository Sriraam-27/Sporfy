package com.sriraam.sporfy.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="tournament_details")
@NoArgsConstructor
@Data
@AllArgsConstructor
public class Tournament {

    @Id
    @Column(name="tournament_id")
    @GeneratedValue
    private int tournamnet_id;

    @Column(name="sport_id")
    private int sport_id;

    @Column(name="t_name")
    private String t_name;

    @Column(name="t_venue")
    private String t_venue;

    @Column(name="name_organizer")
    private String name_organizer;

    @Column(name="t_sponsors")
    private String t_sponsors;
}
