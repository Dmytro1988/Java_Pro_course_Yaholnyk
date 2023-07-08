package com.hillel.game.services;


import com.hillel.game.dto.Computer;
import com.hillel.game.dto.GameItems;
import com.hillel.game.dto.Player;


public class GameService extends GameItems {

    final Player player;
    final Computer computer;
    private CHOICES playerChoice;
    private CHOICES computerChoice;
    private RESULT result;
    private static int wins;
    private static int loses;
    private static int ties;


    public GameService() {
        this.player = new Player();
        this.computer = new Computer();
    }


    public void setPlayerChoice(CHOICES playerChoice) {
        this.playerChoice = playerChoice;
    }

    public void setComputerChoice(CHOICES computerChoice) {
        this.computerChoice = computerChoice;
    }

    public void play(){

        playerChoice = player.getChoice();
        computerChoice = computer.getChoice();
        result = getResult();
        displayResult();
        status();



    }

    public void displayStatus(){
        System.out.println("You have played: " + (wins + loses + ties) );
        System.out.println("You have won: " + wins + " times" );
        System.out.println("You have lost: " + loses + " times" );
        System.out.println("You have tie: " + ties + " times. \nGood Bye!" );
    }
    private void status(){
//        switch (result) {
//            case WIN -> {
//                result.equals(RESULT.WIN);
//                wins++;
//            }
//            case LOSE -> {
//                result.equals(RESULT.LOSE);
//                loses++;
//            }
//            case TIE -> {
//                RESULT.TIE.equals(result);
//                ties++;
//            }
//        }
        if (result.equals(RESULT.WIN)) {
            wins++;
        }else if (result.equals(RESULT.LOSE)){
            loses++;
        }else {
            ties++;
        }


    }
    private void displayResult(){
        switch (result){
            case WIN -> System.out.println(playerChoice + " beats " + computerChoice + ". Player WINS!");
            case LOSE -> System.out.println(playerChoice + " loses to " + computerChoice + ". Computer WINS!");
            case TIE ->  System.out.println(playerChoice + " equals to " + computerChoice + ". It is a TIE!");
        }

    }
    RESULT getResult() {
        if (playerChoice.equals(computerChoice)) {
            return RESULT.TIE;
        }
        return switch (playerChoice) {
            case ROCK -> computerChoice.equals(CHOICES.SCISSORS) ? RESULT.WIN : RESULT.LOSE;

            case PAPER -> computerChoice.equals(CHOICES.ROCK) ? RESULT.WIN : RESULT.LOSE;

            case SCISSORS -> computerChoice.equals(CHOICES.PAPER) ? RESULT.WIN : RESULT.LOSE;
        };

    }

}
