package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess;

import java.util.List;

public class ChessUtility {


    /**
     *
     * @param pos method for the piece move surcharging with the color
     * @param board where are the piece
     * @param rookMoves the piece movement
     * @param varX the variation of the position on the axis X
     * @param varY the variation of the position on the axis Y
     * @param color the color of the piece
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
     * method for the piece move
     * @param pos the pos of the piece
     * @param board where are the piece
     * @param rookMoves the piece movement
     * @param varX the variation of the position on the axis X
     * @param varY the variation of the position on the axis Y
     */
    public static void addXYMove(IChess.ChessPosition pos, Board board, List<IChess.ChessPosition> rookMoves,int varX, int varY){
        ChessUtility.addXYMove(pos,board,rookMoves,varX,varY,7);
    }


    /**
     * method for the piece move surcharging to limit the travel distance
     * @param pos  the pose of the piece
     * @param board where are the piece
     * @param rookMoves the piece movement
     * @param varX the variation of the position on the axis X
     * @param varY the variation of the position on the axis Y
     * @param dist limit the travel distance
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
