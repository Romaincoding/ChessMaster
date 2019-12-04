package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess;
import fr.rphstudio.chess.interf.IMove;

import java.util.ArrayList;
import java.util.List;

public class Bishop implements IMove {
    public List<IChess.ChessPosition> getPossibleMoves(IChess.ChessPosition pos, Board board) {
        System.out.println("test 1");
        List<IChess.ChessPosition> bishopMoves = new ArrayList<>();
        ChessUtility.addXYMove(pos,board,bishopMoves,1,1);
        ChessUtility.addXYMove(pos,board,bishopMoves,1,-1);
        ChessUtility.addXYMove(pos,board,bishopMoves,-1,1);
        ChessUtility.addXYMove(pos,board,bishopMoves,-1,-1);


        return bishopMoves;


    }
}
