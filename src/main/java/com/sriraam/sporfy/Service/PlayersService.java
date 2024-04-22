package com.sriraam.sporfy.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sriraam.sporfy.Entity.Players;
import com.sriraam.sporfy.Repository.PlayersRepo;

@Service
public class PlayersService {


    @Autowired
    private PlayersRepo playersRepo;

    public Players saveDetails(Players players){


        return playersRepo.save(players);
    }
}
