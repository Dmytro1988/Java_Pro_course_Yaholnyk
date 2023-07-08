package com.hillel.game;


import com.hillel.game.dto.Player;
import com.hillel.game.services.GameService;

import java.util.Scanner;

public class PlayGame {
    public static void main(String[] args) {

        System.out.println(" Welcome to Rock, Paper, Scissors game!");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        GameService game = new GameService();
        Player pl = new Player(name);
        System.out.println(" Hello " + pl.getName() + " welcome to game!\n Enter number of games [more then 0]: ");

        int gameCount = scan.nextInt();
        scan.nextLine();

        int startGame = 1;
        char exit = ' ';


        do {
            System.out.println("---------------------->>>>>");
            System.out.println("Game " + startGame + " from " + gameCount + " games");
            game.play();
            System.out.println("-----------------------------");
            if (startGame++ != gameCount) {
                System.out.println("Play again ? " + pl.getName() + " Press any key to continue, or 'E' to exit");
                exit = scan.nextLine().toUpperCase().charAt(0);
            } else {
                break;
            }
        }
        while (exit != 'E');
        scan.close();
        game.displayStatus();

    }
}

