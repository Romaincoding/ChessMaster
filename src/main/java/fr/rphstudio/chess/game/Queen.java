package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess;
import fr.rphstudio.chess.interf.IMove;

import java.util.ArrayList;
import java.util.List;

public class Queen implements IMove {
    public List<IChess.ChessPosition> getPossibleMoves(IChess.ChessPosition pos, Board board) {
        System.out.println("test 1");
        List<IChess.ChessPosition> queenMoves = new ArrayList<>();
        IChess.ChessPosition posRef = new IChess.ChessPosition(pos.x, pos.y);
        //to the left
        while (posRef.x != 0) {
            System.out.println("test 2");
            posRef.x = posRef.x - 1;
            if (board.getPiece(posRef) == null) {
                System.out.println("ajout de x=" + posRef.x);
                queenMoves.add(posRef);
            } /* else if {
                while (posRef.x != 7) {
                    System.out.println("test 2");
                    posRef.x = posRef.x + 1;
                    if (board.getPiece(posRef) == null) {
                        System.out.println("ajout de x=" + posRef.x);
                        queenMoves.add(posRef);

                    }
                    break;
                }
            }

        } */


        }return queenMoves;
    }
}

