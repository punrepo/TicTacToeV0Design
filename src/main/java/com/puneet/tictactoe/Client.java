package com.puneet.tictactoe;

import com.puneet.tictactoe.controller.GameController;
import com.puneet.tictactoe.models.*;
import com.puneet.tictactoe.strategies.RowWinningStrategy;
import com.puneet.tictactoe.models.*;

import java.util.Arrays;
import java.util.Scanner;
public class Client {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        GameController gameController = new GameController();
        System.out.println("Please enter your name:");
        String playerName  = scanner.next();
        Player player1 = new HumanPlayer(playerName , PlayerType.HUMAN , new Symbol('X'));
        Player player2 = new Bot("Botty", BotDifficultyLevel.EASY);
        Game game = gameController.startGame(
                3,
                Arrays.asList(player1, player2),
                Arrays.asList(new RowWinningStrategy())
        );
        for(Player player : game.getPlayers()) {
            player.setGame(game);
        }
        gameController.display(game);
        while(gameController.getGameState(game) == GameState.IN_PROGRESS){
            gameController.makeMove(game);
            gameController.display(game);
            System.out.println("Do you want to undo the move ? [Y/N]");
            String undoInput =  scanner.nextLine();
            if(undoInput.equals("Y")){
                gameController.undo(game);
                System.out.println("Successfully undone!");
                gameController.display(game);
            }
        }

        // check if there ia a winner or its draw
        if(gameController.getGameState(game) == GameState.SUCCESS){
            System.out.println("WE HAVE A WINNER!");
            System.out.println("And the winner is : " + gameController.getWinner(game).getName());
        } else if(gameController.getGameState(game) == GameState.DRAW){
            System.out.println("OOPS! The game ends in a DRAW!");
        }
    }
}

/* Board:
    |-||-||-|
    |-||-||-|
    |-||-||-|
*/
