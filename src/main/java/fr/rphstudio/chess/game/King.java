package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess;
import fr.rphstudio.chess.interf.IMove;

import java.util.ArrayList;
import java.util.List;

public class King implements IMove {


    /**
     * All the possible moves of the king
     * @param pos the pos of the piece
     * @param board a board where are the pieces
     * @return the king position
     */
    public List<IChess.ChessPosition> getPossibleMoves(IChess.ChessPosition pos, Board board) {
        List<IChess.ChessPosition> kingMoves = new ArrayList<>();

        //Roque du roi
        // Consulter liste de coup pour voir si le roi a déjà bougé
        // si ce n'est pas le cas regarder si les cases entre lui et la tour sont bien vides
        //si c'est le cas retourner que le roque est possible

        ChessUtility.addXYMove(pos,board,kingMoves,1,0,1);
        ChessUtility.addXYMove(pos,board,kingMoves,0,-1,1);
        ChessUtility.addXYMove(pos,board,kingMoves,-1,-1,1);
        ChessUtility.addXYMove(pos,board,kingMoves,1,1,1);
        ChessUtility.addXYMove(pos,board,kingMoves,0,1,1);
        ChessUtility.addXYMove(pos,board,kingMoves,-1,0,1);
        ChessUtility.addXYMove(pos,board,kingMoves,1,-1,1);
        ChessUtility.addXYMove(pos,board,kingMoves,-1,1,1);

        return kingMoves;
    }
}