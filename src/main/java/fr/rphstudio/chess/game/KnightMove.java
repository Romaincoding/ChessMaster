package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess;
import fr.rphstudio.chess.interf.IMove;

import java.util.ArrayList;
import java.util.List;

public class KnightMove implements IMove {


    @Override
    public List<IChess.ChessPosition> getPossibleMoves(IChess.ChessPosition pos, Board board) {

        List<IChess.ChessPosition> knightMoves = new ArrayList<>();

        IChess.ChessPosition pos1 = new IChess.ChessPosition(2, 5);
        knightMoves.add(pos1);

        return knightMoves;
    }
}
