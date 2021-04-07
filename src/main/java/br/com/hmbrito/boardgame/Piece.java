package br.com.hmbrito.boardgame;

public class Piece {

    protected Position position;
    private final Board board;

    public Piece(Board board) {
        this.board = board;
        position = null;
    }

    //o tabuleiro (board) deverá ser acessado somente DENTRO do pacote "boardgame"
    //e por classes FILHAS de Piece
    protected Board getBoard() {
        return board;
    }
}
