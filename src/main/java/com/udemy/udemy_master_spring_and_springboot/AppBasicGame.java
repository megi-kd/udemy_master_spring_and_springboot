package com.udemy.udemy_master_spring_and_springboot;

import com.udemy.udemy_master_spring_and_springboot.game.GameRunner;
import com.udemy.udemy_master_spring_and_springboot.game.MarioGame;

public class AppBasicGame {

    public static void main(String[] args) {
        var marioGame = new MarioGame();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();
    }
}
