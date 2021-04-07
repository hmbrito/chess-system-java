package br.com.hmbrito.application;

import br.com.hmbrito.chess.ChessMatch;

public class Program {

    public static void main(String[] args) {

        var chessMatch = new ChessMatch();

        UI.printBoard(chessMatch.getPieces());
    }

}
