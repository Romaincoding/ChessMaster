package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess;

import java.util.List;

public class ChessUtility {


    /**
     *
     * @param pos
     * @param board
     * @param rookMoves
     * @param varX
     * @param varY
     * @param color
     */
    public static void addXYMove(IChess.ChessPosition pos, Board board, List<IChess.ChessPosition> rookMoves, int varX, int varY, IChess.ChessColor color){
        ChessUtility.addXYMove(pos,board,rookMoves,varX,varY,color);

        /*
        if (color == IChess.ChessColor.CLR_WHITE){
            varY = varY - 1;
        }
        else{

            varY = varY + 1;
        }

         */
    }

    /**
     *
     * @param pos
     * @param board
     * @param rookMoves
     * @param varX
     * @param varY
     */
    public static void addXYMove(IChess.ChessPosition pos, Board board, List<IChess.ChessPosition> rookMoves,int varX, int varY){
        ChessUtility.addXYMove(pos,board,rookMoves,varX,varY,7);
    }


    /**
     *
     * @param pos
     * @param board
     * @param rookMoves
     * @param varX
     * @param varY
     * @param dist
     */
    public static void addXYMove(IChess.ChessPosition pos, Board board, List<IChess.ChessPosition> rookMoves,int varX, int varY,int dist){
        IChess.ChessPosition posRef = new IChess.ChessPosition(pos.x  ,pos.y);
        for (int i = 0; i < dist;i++){
            posRef.x = posRef.x + varX;
            posRef.y = posRef.y + varY;
            IChess.ChessPosition validpos = new IChess.ChessPosition(posRef.x  ,posRef.y);
            if (validpos.x >= 0 && validpos.x <=7 && validpos.y >= 0 && validpos.y <=7) {
                if (board.getPiece(validpos) == null) {
                    rookMoves.add(validpos);
                } else {
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
