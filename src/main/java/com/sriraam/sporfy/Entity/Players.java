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
@Table(name="player_details")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Players {

    @GeneratedValue
    @Id
    @Column(name="player_id")
    private int player_id;

    @Column(name="player_name")
    private String player_name;

    @Column(name="user_id")
    private int user_id;

    @Column(name="player_email")
    private String player_email;

    @Column(name="jersey_number")
    private int jersey_number;

    @Column(name="team_id")
    private int team_id;


}
