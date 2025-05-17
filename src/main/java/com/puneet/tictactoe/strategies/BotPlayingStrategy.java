package com.puneet.tictactoe.strategies;

import com.puneet.tictactoe.models.Board;
import com.puneet.tictactoe.models.Move;
import com.puneet.tictactoe.models.Player;

public interface BotPlayingStrategy {
    public Move makeMove(Board board, Player player);
}