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
        ChessPosition posRef = new ChessPosition(pos.x  ,pos.y);
        // Vers la gauche
        int varX = -1;
        int varY = +0;
        while (posRef.x > 0){
            System.out.println("test 2");
            posRef.x = posRef.x + varX;
            posRef.y = posRef.y + varY;
            ChessPosition validpos = new ChessPosition(posRef.x  ,posRef.y);

            if(board.getPiece(validpos) == null){
                System.out.println("ajout de x=" + posRef.x);
                rookMoves.add(validpos);
            }
            else  {
                // recup ma pièce
                // recup la couleur de la piece sur la position destination
              Piece myRook =  board.getPiece(pos);
            Object colorofRook =  myRook.getColor();
               Piece otherPiece = board.getPiece(validpos);
               Object colorOtherPiece = otherPiece.getColor();
               if(colorofRook != colorOtherPiece && otherPiece.getType()!= ChessType.TYP_KING){
                   rookMoves.add(validpos);
               }




            }
        }
        //System.out.println(rookMoves);
        return rookMoves;
    }
}
