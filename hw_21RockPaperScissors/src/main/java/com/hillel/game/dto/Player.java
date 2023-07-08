package com.hillel.game.dto;



import com.hillel.game.PlayGame;
import com.hillel.game.services.PrintChoice;

import java.util.Scanner;



public class Player extends GameItems {

    private String name;

    static Scanner scan;
    public Player(){
        super();
        scan = new Scanner(System.in);
    }

    public Player(String name) {
        this.name = name;
    }


    public CHOICES getChoice() {

        System.out.println(" Make your choice: R = Rock, P = Paper, S = Scissors ");

        char playerChoice = scan.nextLine().toUpperCase().charAt(0);

        switch (playerChoice) {
            case 'R' -> {
                PrintChoice.printRock();
                return CHOICES.ROCK;
            }
            case 'P' -> {
                PrintChoice.printPaper();
                return CHOICES.PAPER;
            }
            case 'S' -> {
                PrintChoice.printScissors();
                return CHOICES.SCISSORS;
            }
        }

        System.out.println("Invalid input");
        return getChoice();

    }

    public String getName() {
        return name;
    }
}
