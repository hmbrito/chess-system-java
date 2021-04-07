package br.com.hmbrito.chess;

import br.com.hmbrito.boardgame.Board;
import br.com.hmbrito.boardgame.Piece;

public class ChessPiece extends Piece {

    private final Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
