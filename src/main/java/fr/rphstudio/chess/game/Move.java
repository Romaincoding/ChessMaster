package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess;

public class Move {
    private Piece src;
    private Piece dest;
    private IChess.ChessPosition posSrc;
    private IChess.ChessPosition posDest;


    public Move(Piece src, Piece dest, IChess.ChessPosition posSrc, IChess.ChessPosition posDest) {
        this.src = src;
        this.dest = dest;
        this.posSrc = posSrc;
        this.posDest = posDest;
    }

    public Piece getPieceSrc() {
        return src;
    }
    public Piece getPieceDest() {
        return dest;
    }

    public IChess.ChessPosition getPosSrc() {
        return posSrc;
    }

    public IChess.ChessPosition getPosDest() {
        return posDest;
    }
}
