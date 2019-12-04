package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.EmptyCellException;
import fr.rphstudio.chess.interf.IChess;
import fr.rphstudio.chess.interf.OutOfBoardException;

import java.util.ArrayList;
import java.util.List;

public class ChessModel implements IChess{

    private static ChessModel instance;
    private Board chessBoard;

    private  ChessModel(){
      reinit();




    }



    public static ChessModel getInstance() {
        if(ChessModel.instance == null ) {
            ChessModel.instance = new ChessModel();
        }
        return ChessModel.instance;
    }


    @Override
    public void reinit() {
        chessBoard = new Board();


    }

    @Override
    public ChessType getPieceType(ChessPosition p) throws EmptyCellException, OutOfBoardException {
        Piece piece = chessBoard.getPiece(p);
        if(piece != null){
            return piece.getType();
        }
        else{
            throw new EmptyCellException();
        }

    }

    @Override
    public ChessColor getPieceColor(ChessPosition p) throws EmptyCellException, OutOfBoardException {
        Piece piece = chessBoard.getPiece(p);
        if(piece != null){
            return piece.getColor();
        }
        else{
            throw new EmptyCellException();
        }
    }

    @Override
    public int getNbRemainingPieces(ChessColor color) {
       int counter = chessBoard.getNbPieces(color);
       return counter;



    }

    @Override
    public List<ChessPosition> getPieceMoves(ChessPosition p) {
        Piece piece = chessBoard.getPiece(p);
        if(piece != null){
            return piece.getMoves(p,this.chessBoard);
        }
        else{
            return new ArrayList<>();
        }
    }

    @Override
    public void movePiece(ChessPosition p0, ChessPosition p1) {
        chessBoard.movePiece(p0, p1);
    }

    @Override
    public ChessKingState getKingState(ChessColor color) {
        if (chessBoard.isKingSafe(color)){
            return ChessKingState.KING_SAFE;
        }
        else{return ChessKingState.KING_THREATEN;}
    }

    @Override
    public List<ChessType> getRemovedPieces(ChessColor color) {
        return new ArrayList<>();
    }

    @Override
    public boolean undoLastMove() {
        return false;
    }

    @Override
    public long getPlayerDuration(ChessColor color, boolean isPlaying) {
        return 0;
    }
}
