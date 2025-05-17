package com.puneet.tictactoe.controller;

import com.puneet.tictactoe.models.Game;
import com.puneet.tictactoe.models.GameState;
import com.puneet.tictactoe.models.Player;
import com.puneet.tictactoe.strategies.WinningStrategy;

import java.util.List;

public class GameController {
    public Game startGame(
            int size,
            List<Player> players,
            List<WinningStrategy> winningStrategies
    ){

        return new Game(size , players , winningStrategies);
    }

    public void makeMove(Game game){
        game.makeMove();
    }

    public GameState getGameState(Game game){
        return game.getGameState();
    }

    public void display(Game game){
        game.display();
    }

    public Player getWinner(Game game){
        return game.getWinner();
    }

    public void undo(Game game){
        game.undo();
    }
}
/*
  Plan:Following methods gameApp will expose to the client in v0:
        1. startGame (size , players , winningStrategies)
        2. makeMove
        3. checkGameState
        4. display
        5. getWinner
        6. undo
 */