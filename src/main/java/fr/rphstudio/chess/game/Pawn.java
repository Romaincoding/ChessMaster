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
     * @param dist
     */
    public static void addPawnMove(IChess.ChessPosition pos, Board board, List<IChess.ChessPosition> rookMoves,int varX, int varY,int dist) {
        IChess.ChessPosition posRef = new IChess.ChessPosition(pos.x, pos.y);
        //List<IChess.ChessPosition> pawnMoves = new ArrayList<>();
        for (int i = 0; i < dist; i++) {
            posRef.x = posRef.x + varX;
            posRef.y = posRef.y + varY;
            IChess.ChessPosition validpos = new IChess.ChessPosition(posRef.x, posRef.y);
            if (validpos.x >= 0 && validpos.x <= 7 && validpos.y >= 0 && validpos.y <= 7) {
                if (board.getPiece(validpos) == null) {
                    rookMoves.add(validpos);
                }
                else {
                    Piece myPawn = board.getPiece(pos);
                    IChess.ChessColor colorofPawn = myPawn.getColor();
                    Piece otherPiece = board.getPiece(validpos);
                    IChess.ChessColor colorOtherPiece = otherPiece.getColor();
                    posRef.x = posRef.x + 1;
                    posRef.y = posRef.y - 1;
                    IChess.ChessPosition validpos1 = new IChess.ChessPosition(posRef.x, posRef.y);
                        if (board.getPiece(validpos1) != null && colorOtherPiece != colorofPawn) {
                            System.out.println("ca marche");
                            rookMoves.add(validpos);

                        }
                    /*

                    if (colorofRook != colorOtherPiece) {
                        rookMoves.add(validpos);
                    }

                     */
                        break;
                    }
                }
            }
        }

    /*
    public List<IChess.ChessPosition> getPossibleMoves(IChess.ChessPosition pos, Board board) {
        System.out.println("test 1");
        List<IChess.ChessPosition> pawnMoves = new ArrayList<>();
        ChessUtility.addXYMove(pos,board,pawnMoves,0, 0, IChess.ChessColor.CLR_BLACK);
        ChessUtility.addXYMove(pos,board,pawnMoves,0, 0, IChess.ChessColor.CLR_WHITE);

        return pawnMoves;
    }

     */


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

            if(pos.y == 6){
                Pawn.addPawnMove(pos, board, pawnMoves, 0, -1,2);
            }

            else { Pawn.addPawnMove(pos, board, pawnMoves, 0, -1,1); }
        }
        else {
            if(pos.y == 1){
                Pawn.addPawnMove(pos, board, pawnMoves, 0, 1,2);
            }
            else {Pawn.addPawnMove(pos,board,pawnMoves,0, 1, 1);}
        }

        //ChessUtility.addXYMove(pos,board,pawnMoves,1,-1,1);
        //ChessUtility.addXYMove(pos,board,pawnMoves,-1,-1,1);
        return pawnMoves;
    }

}
