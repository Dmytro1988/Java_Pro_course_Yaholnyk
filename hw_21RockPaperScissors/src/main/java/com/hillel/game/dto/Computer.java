package com.hillel.game.dto;

import com.hillel.game.services.PrintChoice;

import java.util.Random;

public class Computer extends GameItems {

    private final Random rand;

    public Computer() {
        super();
        rand = new Random();
    }
    public CHOICES getChoice(){
        int choice = 1 + rand.nextInt(3);
        return switch (choice) {
            case 1 -> {
                PrintChoice.printRock();
                yield  CHOICES.ROCK;
            }
            case 2 -> {
                PrintChoice.printPaper();
                yield CHOICES.PAPER;
            }
            default -> {
                PrintChoice.printScissors();
                yield CHOICES.SCISSORS;
            }
        };

    }


}
