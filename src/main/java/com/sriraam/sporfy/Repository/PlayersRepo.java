package com.sriraam.sporfy.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sriraam.sporfy.Entity.Players;

public interface PlayersRepo extends JpaRepository<Players,Integer>{

}
