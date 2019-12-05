package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess;
import fr.rphstudio.chess.interf.IMove;

import java.util.ArrayList;
import java.util.List;

public class Pawn implements IMove {


    /**
     *
     * @param pos
     * @param board
     * @param rookMoves
     * @param varX
     * @param varY
     * @param eatAllowed
     */
    public static void addPawnMove(IChess.ChessPosition pos, Board board, List<IChess.ChessPosition> rookMoves,int varX, int varY,boolean eatAllowed) {
        IChess.ChessPosition posRef = new IChess.ChessPosition(pos.x, pos.y);
        
        IChess.ChessPosition posDest = new IChess.ChessPosition(pos.x + varX, pos.y + varY);
        Piece piece = board.getPiece(posDest);
        Piece mypiece = board.getPiece(pos);
        if (piece != null) {
            if (eatAllowed == true) {
                if (piece.getColor() != mypiece.getColor()) {
                    rookMoves.add(posDest);
                }
            }
        } else {
            if (eatAllowed == false) {
                rookMoves.add(posDest);
            }
        }
    }


    /**
     *
     * @param pos
     * @param board
     * @return
     */
    public List<IChess.ChessPosition> getPossibleMoves(IChess.ChessPosition pos, Board board) {
        List<IChess.ChessPosition> pawnMoves = new ArrayList<>();

        Piece myPawn = board.getPiece(pos);
        IChess.ChessColor colorofPawn = myPawn.getColor();



        if (colorofPawn == IChess.ChessColor.CLR_WHITE) {
            IChess.ChessPosition posRef = new IChess.ChessPosition(pos.x  ,pos.y);
            IChess.ChessPosition validpos = new IChess.ChessPosition(posRef.x ,posRef.y);

            /* Avancer */
            if(pos.y == 6){
                Pawn.addPawnMove(pos, board, pawnMoves, 0, -2,false);

            }
            else {
                Pawn.addPawnMove(pos, board, pawnMoves, 0, -1,false);
            }

            /* Manger */
            Pawn.addPawnMove(pos, board, pawnMoves, -1, -1,true);
            Pawn.addPawnMove(pos, board, pawnMoves, 1, -1,true);
        }
        else {
            if(pos.y == 1){
                Pawn.addPawnMove(pos, board, pawnMoves, 0, 2,false);
            }
            else {
                Pawn.addPawnMove(pos,board,pawnMoves,0, 1,false);
            }
            /* Manger */
            Pawn.addPawnMove(pos, board, pawnMoves, -1, 1,true);
            Pawn.addPawnMove(pos, board, pawnMoves, 1, 1,true);
        }


        //ChessUtility.addXYMove(pos,board,pawnMoves,1,-1,1);
        //ChessUtility.addXYMove(pos,board,pawnMoves,-1,-1,1);
        return pawnMoves;
    }

}
