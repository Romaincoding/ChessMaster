package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess;
import fr.rphstudio.chess.interf.IMove;

import java.util.ArrayList;
import java.util.List;

public class Queen implements IMove {
    public List<IChess.ChessPosition> getPossibleMoves(IChess.ChessPosition pos, Board board) {
        List<IChess.ChessPosition> queenMoves = new ArrayList<>();
        ChessUtility.addXYMove(pos,board,queenMoves,1,0);
        ChessUtility.addXYMove(pos,board,queenMoves,0,-1);
        ChessUtility.addXYMove(pos,board,queenMoves,-1,-1);
        ChessUtility.addXYMove(pos,board,queenMoves,1,1);
        ChessUtility.addXYMove(pos,board,queenMoves,0,1);
        ChessUtility.addXYMove(pos,board,queenMoves,-1,0);
        ChessUtility.addXYMove(pos,board,queenMoves,1,-1);
        ChessUtility.addXYMove(pos,board,queenMoves,-1,1);

            return queenMoves;


        }
    }


