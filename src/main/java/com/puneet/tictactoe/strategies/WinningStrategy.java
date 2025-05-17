package com.puneet.tictactoe.strategies;

import com.puneet.tictactoe.models.Board;
import com.puneet.tictactoe.models.Move;

public interface WinningStrategy {
    boolean checkWinner(Board board , Move move);
    void handleUndo(Board board , Move move);
}