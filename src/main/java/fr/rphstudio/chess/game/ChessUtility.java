package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess;

import java.util.List;

public class ChessUtility {

    public static void addXYMove(IChess.ChessPosition pos, Board board, List<IChess.ChessPosition> rookMoves,int varX, int varY){
        ChessUtility.addXYMove(pos,board,rookMoves,varX,varY,7);
    }


    public static void addXYMove(IChess.ChessPosition pos, Board board, List<IChess.ChessPosition> rookMoves,int varX, int varY,int dist){
        IChess.ChessPosition posRef = new IChess.ChessPosition(pos.x  ,pos.y);
        // Vers la gauche

        for (int i = 0; i < dist;i++){


            System.out.println("test 2");
            posRef.x = posRef.x + varX;
            posRef.y = posRef.y + varY;
            IChess.ChessPosition validpos = new IChess.ChessPosition(posRef.x  ,posRef.y);
            if (validpos.x >= 0 && validpos.x <=7 && validpos.y >= 0 && validpos.y <=7) {
                if (board.getPiece(validpos) == null) {
                    System.out.println("ajout de x=" + posRef.x);
                    rookMoves.add(validpos);
                } else {
                    // recup ma pièce
                    // recup la couleur de la piece sur la position destination
                    Piece myRook = board.getPiece(pos);
                    IChess.ChessColor colorofRook = myRook.getColor();
                    Piece otherPiece = board.getPiece(validpos);
                    IChess.ChessColor colorOtherPiece = otherPiece.getColor();
                    if (colorofRook != colorOtherPiece) {
                        rookMoves.add(validpos);

                    }
                    break;


                }
            }
        }
    }
}
