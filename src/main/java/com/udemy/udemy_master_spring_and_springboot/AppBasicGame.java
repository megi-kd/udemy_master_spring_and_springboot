package com.udemy.udemy_master_spring_and_springboot;

import com.udemy.udemy_master_spring_and_springboot.game.GameRunner;
import com.udemy.udemy_master_spring_and_springboot.game.MarioGame;
import com.udemy.udemy_master_spring_and_springboot.game.SuperContraGame;

public class AppBasicGame {

    public static void main(String[] args) {
        //var game = new MarioGame();
        var game = new SuperContraGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
