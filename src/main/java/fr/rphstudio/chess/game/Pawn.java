package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess;
import fr.rphstudio.chess.interf.IMove;

import java.util.ArrayList;
import java.util.List;

public class Pawn implements IMove {


    /**
     * All the possible moves of the bihop
     * @param pos the pos of the piece
     * @param board the board where are the pieces
     * @param rookMoves the move of the piece
     * @param varX the variation of the position on the axis X
     * @param varY the variation of the position on the axis Y
     * @param eatAllowed allow to eat
     */
    public static void addPawnMove(IChess.ChessPosition pos, Board board, List<IChess.ChessPosition> rookMoves,int varX, int varY,boolean eatAllowed) {
        IChess.ChessPosition posDest;
        Piece piece;

        /* Mouvement manger */
        if (eatAllowed == true) {
            posDest = new IChess.ChessPosition(pos.x + varX, pos.y + varY);
            piece = board.getPiece(posDest);
            Piece mypiece = board.getPiece(pos);
            if (piece != null && piece.getColor() != mypiece.getColor()) {
                rookMoves.add(posDest);
            }
        }
        /* Mouvement avancer */
        else {
            /* On regarde en chemin si ya un obstacle.
            *  Si non, on rajoute dans la liste
            *  Si oui, on arrête le parcours, on ne peut pas sauter par dessus
            */
        for (int i = 1; i <= Math.abs(varY); i++) {
            if (varY >  0)
                posDest = new IChess.ChessPosition(pos.x , pos.y + i);
            else {
                posDest = new IChess.ChessPosition(pos.x , pos.y - i);
            }
            piece = board.getPiece(posDest);
            if (piece == null) {
                rookMoves.add(posDest);
            } else {
                break;
            }
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
