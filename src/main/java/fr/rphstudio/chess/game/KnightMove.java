package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess;
import fr.rphstudio.chess.interf.IMove;

import java.util.ArrayList;
import java.util.List;

public class KnightMove implements IMove {

    /**
     * All the possible moves of the knight
     * @param pos the pos of the piece
     * @param board a board where are the pieces
     * @return the bishop position
     */
    public List<IChess.ChessPosition> getPossibleMoves(IChess.ChessPosition pos, Board board) {
        List<IChess.ChessPosition> knightMoves = new ArrayList<>();
        ChessUtility.addXYMove(pos,board,knightMoves,2,1,1);
        ChessUtility.addXYMove(pos,board,knightMoves,2,-1,1);
        ChessUtility.addXYMove(pos,board,knightMoves,-2,1,1);
        ChessUtility.addXYMove(pos,board,knightMoves,-2,-1,1);
        ChessUtility.addXYMove(pos,board,knightMoves,1,2,1);
        ChessUtility.addXYMove(pos,board,knightMoves,-1,2,1);
        ChessUtility.addXYMove(pos,board,knightMoves,1,-2,1);
        ChessUtility.addXYMove(pos,board,knightMoves,-1,-2,1);


        return knightMoves;

    }
}
