package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess;
import fr.rphstudio.chess.interf.IChess.*;
import fr.rphstudio.chess.interf.IMove;

import java.util.ArrayList;
import java.util.List;

public class Rook implements IMove {

    public List<ChessPosition> getPossibleMoves(ChessPosition pos, Board board) {
        System.out.println("test 1");
        List<ChessPosition> rookMoves = new ArrayList<>();

        ChessUtility.addXYMove( pos, board,  rookMoves,-1, 0);
        ChessUtility.addXYMove( pos, board,  rookMoves,1, 0);
        ChessUtility.addXYMove( pos, board,  rookMoves,0, -1);
        ChessUtility.addXYMove( pos, board,  rookMoves,0, 1);

        //System.out.println(rookMoves);
        return rookMoves;
    }
}
