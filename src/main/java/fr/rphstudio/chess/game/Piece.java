package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.EmptyCellException;
import fr.rphstudio.chess.interf.IChess.*;
import fr.rphstudio.chess.interf.IMove;
import fr.rphstudio.chess.interf.OutOfBoardException;

import java.util.List;

public class Piece {

    private ChessColor color;
    private ChessType type;
    private IMove move;


    /**
     *
     * @param color
     * @param type
     * @param move
     */
    public Piece(ChessColor color, ChessType type, IMove move) {
         this.color = color;
         this.type = type;
         this.move = move;

    }

    /**
     *
     * @return
     */
    public  ChessColor getColor() {
        return color;
    }


    /**
     *
     * @return
     */
    public ChessType getType() {

        return type;
    }

    /**
     *
     * @param pos
     * @param board
     * @return
     */
    public List<ChessPosition> getMoves(ChessPosition pos, Board board){

        return move.getPossibleMoves(pos, board);
    }


}


