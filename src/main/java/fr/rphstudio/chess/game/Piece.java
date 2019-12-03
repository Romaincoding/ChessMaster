package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.EmptyCellException;
import fr.rphstudio.chess.interf.IChess.*;
import fr.rphstudio.chess.interf.OutOfBoardException;

import java.util.List;

public class Piece {

    private ChessColor color;
    private ChessType type;


    public Piece(ChessColor color, ChessType type) {
     this.color = color;
     this.type = type;

    }

    public  ChessColor getColor() {
        return color;
    }


    public ChessType getType() {

        return type;
    }

}


