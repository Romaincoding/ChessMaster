package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess;
import fr.rphstudio.chess.interf.IMove;

import java.util.ArrayList;
import java.util.List;

public class Pawn implements IMove {

    /*
    public List<IChess.ChessPosition> getPossibleMoves(IChess.ChessPosition pos, Board board) {
        System.out.println("test 1");
        List<IChess.ChessPosition> pawnMoves = new ArrayList<>();
        ChessUtility.addXYMove(pos,board,pawnMoves,0, 0, IChess.ChessColor.CLR_BLACK);
        ChessUtility.addXYMove(pos,board,pawnMoves,0, 0, IChess.ChessColor.CLR_WHITE);

        return pawnMoves;
    }

     */



    public List<IChess.ChessPosition> getPossibleMoves(IChess.ChessPosition pos, Board board) {
        List<IChess.ChessPosition> pawnMoves = new ArrayList<>();

        Piece myPawn = board.getPiece(pos);
        IChess.ChessColor colorofPawn = myPawn.getColor();


        if (colorofPawn == IChess.ChessColor.CLR_WHITE) {
            if(pos.y == 6){
                ChessUtility.addXYMove(pos, board, pawnMoves, 0, -1,2);
            }
            else { ChessUtility.addXYMove(pos, board, pawnMoves, 0, -1,1); }

        }
        else {
            if(pos.y == 1){
                ChessUtility.addXYMove(pos, board, pawnMoves, 0, 1,2);
            }
            else {ChessUtility.addXYMove(pos,board,pawnMoves,0, 1, 1);}

        }

        return pawnMoves;
    }

}
