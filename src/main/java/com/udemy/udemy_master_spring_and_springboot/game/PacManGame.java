package com.udemy.udemy_master_spring_and_springboot.game;

public class PacManGame implements GamingConsole {

    @Override
    public void up() {
        System.out.println("Going up");
    }

    @Override
    public void down() {
        System.out.println("Going down");
    }

    @Override
    public void left() {
        System.out.println("Going left");
    }

    @Override
    public void right() {
        System.out.println("Going right");
    }
}
