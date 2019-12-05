package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess;

public class Move {
    private IChess.ChessColor colorSrc;
    private IChess.ChessColor colorDest;
    private IChess.ChessType typeSrc;
    private IChess.ChessType typeDest;
    private IChess.ChessPosition posSrc;
    private IChess.ChessPosition posDest;


    public Move(IChess.ChessColor colorSrc, IChess.ChessColor colorDest, IChess.ChessType typeSrc, IChess.ChessType typeDest, IChess.ChessPosition posSrc, IChess.ChessPosition posDest) {
        this.colorSrc = colorSrc;
        this.colorDest = colorDest;
        this.typeSrc = typeSrc;
        this.typeDest = typeDest;
        this.posSrc = posSrc;
        this.posDest = posDest;
    }
}
