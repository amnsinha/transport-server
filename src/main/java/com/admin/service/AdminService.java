package com.admin.service;

import com.admin.repository.GameRepository;
import com.transport.entitiy.Games;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    GameRepository gameRepository;

    public List<Games> saveGame(List<Games> game) {
        return (List<Games>) gameRepository.saveAll(game);
    }

    public Boolean login(String username, String password) {
        return true;
    }
    //apko thode hi na karna hai
    // 
    //aapko karna kya hai..
}