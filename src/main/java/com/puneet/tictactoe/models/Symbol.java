package com.puneet.tictactoe.models;

public class Symbol {
    private Character sym;

    public Symbol(Character sym) {
        this.sym = sym;
    }

    public Character getSym() {
        return sym;
    }

    public void setSym(Character sym) {
        this.sym = sym;
    }
}