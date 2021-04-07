package br.com.hmbrito.chess;

import br.com.hmbrito.boardgame.Board;

/**
 * Coracao do sistema de jogo de xadrez, nela estão as REGRAS do jogo
 *
 * @author hmbri
 */
public class ChessMatch {

    private final Board board;

    private static final int BOARD_LINES_CHESS = 8;
    private static final int BOARD_COLUMNS_CHESS = 8;

    public ChessMatch() {
        board = new Board(BOARD_LINES_CHESS, BOARD_COLUMNS_CHESS);
    }

    public ChessPiece[][] getPieces() {
        var toReturn = new ChessPiece[board.getRows()][board.getColumns()];

        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getColumns(); j++) {
                toReturn[i][j] = (ChessPiece) board.piece(i, j);
            }
        }

        return toReturn;
    }
}
