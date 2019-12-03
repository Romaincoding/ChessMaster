package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess.*;

public class Board {
    private Piece [][] gameBoard ;

    public Board(){
        gameBoard = new Piece[8][8];

        Piece p1 = new Piece(ChessColor.CLR_BLACK,ChessType.TYP_BISHOP);
        gameBoard [1][5] = p1;
    }

    public Piece getPiece(ChessPosition position){
        return gameBoard [position.y][position.x];
    }

}
