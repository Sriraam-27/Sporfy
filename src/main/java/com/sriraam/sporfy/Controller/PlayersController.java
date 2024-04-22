package com.sriraam.sporfy.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sriraam.sporfy.Entity.Players;
import com.sriraam.sporfy.Service.PlayersService;

@RestController
public class PlayersController {

    @Autowired
    private PlayersService playersService;

    @PostMapping("/addPlayer")
    public Players postDetails(@RequestBody Players players)
    {

        return playersService.saveDetails(players);
    }
}
