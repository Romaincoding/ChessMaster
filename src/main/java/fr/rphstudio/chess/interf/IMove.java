package fr.rphstudio.chess.interf;

import fr.rphstudio.chess.game.Board;

import javax.swing.text.Position;
import java.util.List;

public interface IMove {

    /**
     * All the possible moves of the piece
     * @param pos
     * @param board
     * @return
     */
    public List<IChess.ChessPosition> getPossibleMoves(IChess.ChessPosition pos,Board board);

}
