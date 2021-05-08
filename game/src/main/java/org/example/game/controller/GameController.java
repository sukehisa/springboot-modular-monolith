package org.example.game.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {
    @GetMapping("/game")
    public String game() {
        return "Game!";
    }
}
