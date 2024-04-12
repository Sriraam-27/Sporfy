package com.sriraam.sporfy.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sriraam.sporfy.Entity.Tournament;
import com.sriraam.sporfy.Repository.TournamentRepo;

@Service
public class TournamentService {

    @Autowired
    private TournamentRepo tournamentRepo;
    
    public Tournament saveDetails(Tournament tournament){

            return tournamentRepo.save(tournament);
        }
    
}
