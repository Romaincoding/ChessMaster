package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess;
import fr.rphstudio.chess.interf.IChess.*;
import fr.rphstudio.chess.interf.IMove;

import java.util.ArrayList;
import java.util.List;

public class Rook implements IMove {

    /**
     * All the possible moves of the rook
     * @param pos the pos of the piece
     * @param board a board where are the pieces
     * @return the bishop position
     */
    public List<ChessPosition> getPossibleMoves(ChessPosition pos, Board board) {
        List<ChessPosition> rookMoves = new ArrayList<>();

        ChessUtility.addXYMove( pos, board,  rookMoves,-1, 0);
        ChessUtility.addXYMove( pos, board,  rookMoves,1, 0);
        ChessUtility.addXYMove( pos, board,  rookMoves,0, -1);
        ChessUtility.addXYMove( pos, board,  rookMoves,0, 1);

        return rookMoves;
    }
}
