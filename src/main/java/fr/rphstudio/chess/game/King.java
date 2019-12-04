package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess;
import fr.rphstudio.chess.interf.IMove;

import java.util.ArrayList;
import java.util.List;

public class King implements IMove {

    public List<IChess.ChessPosition> getPossibleMoves(IChess.ChessPosition pos, Board board) {
        List<IChess.ChessPosition> kingMoves = new ArrayList<>();

        ChessUtility.addXYMove(pos,board,kingMoves,1,0,1);
        ChessUtility.addXYMove(pos,board,kingMoves,0,-1,1);
        ChessUtility.addXYMove(pos,board,kingMoves,-1,-1,1);
        ChessUtility.addXYMove(pos,board,kingMoves,1,1,1);
        ChessUtility.addXYMove(pos,board,kingMoves,0,1,1);
        ChessUtility.addXYMove(pos,board,kingMoves,-1,0,1);
        ChessUtility.addXYMove(pos,board,kingMoves,1,-1,1);
        ChessUtility.addXYMove(pos,board,kingMoves,-1,1,1);

        return kingMoves;
    }
}