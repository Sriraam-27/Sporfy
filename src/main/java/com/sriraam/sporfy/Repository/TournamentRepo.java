package com.sriraam.sporfy.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sriraam.sporfy.Entity.Tournament;

public interface TournamentRepo extends JpaRepository<Tournament,Integer>{
    
    }

