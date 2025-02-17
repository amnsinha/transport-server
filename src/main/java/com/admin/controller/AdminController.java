package com.admin.controller;

import com.admin.service.AdminService;
import com.transport.entitiy.Games;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    AdminService adminService;

    @PostMapping("/add-games")
    public List<Games> register(List<Games> games) {
        return adminService.saveGame(games);
    }

    
    @PostMapping("/login")
    public Boolean login(String username, String password) {
        return adminService.login(username, password);
    }

}
