package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess;
import fr.rphstudio.chess.interf.IChess.*;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private Piece[][] gameBoard;

    /**
     *
     */
    public Board() {
        gameBoard = new Piece[8][8];

        Piece p1 = new Piece(ChessColor.CLR_BLACK, ChessType.TYP_ROOK, new Rook());
        gameBoard[0][0] = p1;
        Piece p2 = new Piece(ChessColor.CLR_BLACK, ChessType.TYP_KNIGHT, new KnightMove());
        gameBoard[0][1] = p2;
        Piece p3 = new Piece(ChessColor.CLR_BLACK, ChessType.TYP_BISHOP, new Bishop());
        gameBoard[0][2] = p3;
        Piece p4 = new Piece(ChessColor.CLR_BLACK, ChessType.TYP_QUEEN, new Queen());
        gameBoard[0][3] = p4;

        Piece p5 = new Piece(ChessColor.CLR_BLACK, ChessType.TYP_KING, new King());
        gameBoard[0][4] = p5;
        Piece p6 = new Piece(ChessColor.CLR_BLACK, ChessType.TYP_BISHOP, new Bishop());
        gameBoard[0][5] = p6;
        Piece p7 = new Piece(ChessColor.CLR_BLACK, ChessType.TYP_KNIGHT, new KnightMove());
        gameBoard[0][6] = p7;
        Piece p8 = new Piece(ChessColor.CLR_BLACK, ChessType.TYP_ROOK, new Rook());
        gameBoard[0][7] = p8;
        Piece p9 = new Piece(ChessColor.CLR_BLACK, ChessType.TYP_PAWN, new Pawn());
        gameBoard[1][0] = p9;
        Piece p10 = new Piece(ChessColor.CLR_BLACK, ChessType.TYP_PAWN, new Pawn());
        gameBoard[1][1] = p10;
        Piece p11 = new Piece(ChessColor.CLR_BLACK, ChessType.TYP_PAWN, new Pawn());
        gameBoard[1][2] = p11;
        Piece p12 = new Piece(ChessColor.CLR_BLACK, ChessType.TYP_PAWN, new Pawn());
        gameBoard[1][3] = p12;
        Piece p13 = new Piece(ChessColor.CLR_BLACK, ChessType.TYP_PAWN, new Pawn());
        gameBoard[1][4] = p13;
        Piece p14 = new Piece(ChessColor.CLR_BLACK, ChessType.TYP_PAWN, new Pawn());
        gameBoard[1][5] = p14;
        Piece p15 = new Piece(ChessColor.CLR_BLACK, ChessType.TYP_PAWN, new Pawn());
        gameBoard[1][6] = p15;
        Piece p16 = new Piece(ChessColor.CLR_BLACK, ChessType.TYP_PAWN, new Pawn());
        gameBoard[1][7] = p16;


        Piece p17 = new Piece(ChessColor.CLR_WHITE, ChessType.TYP_PAWN, new Pawn());
        gameBoard[6][0] = p17;
        Piece p18 = new Piece(ChessColor.CLR_WHITE, ChessType.TYP_PAWN, new Pawn());
        gameBoard[6][1] = p18;
        Piece p19 = new Piece(ChessColor.CLR_WHITE, ChessType.TYP_PAWN, new Pawn());
        gameBoard[6][2] = p19;
        Piece p20 = new Piece(ChessColor.CLR_WHITE, ChessType.TYP_PAWN, new Pawn());
        gameBoard[6][3] = p20;
        Piece p21 = new Piece(ChessColor.CLR_WHITE, ChessType.TYP_PAWN, new Pawn());
        gameBoard[6][4] = p21;
        Piece p22 = new Piece(ChessColor.CLR_WHITE, ChessType.TYP_PAWN, new Pawn());
        gameBoard[6][5] = p22;
        Piece p23 = new Piece(ChessColor.CLR_WHITE, ChessType.TYP_PAWN, new Pawn());
        gameBoard[6][6] = p23;
        Piece p24 = new Piece(ChessColor.CLR_WHITE, ChessType.TYP_PAWN, new Pawn());
        gameBoard[6][7] = p24;
        Piece p25 = new Piece(ChessColor.CLR_WHITE, ChessType.TYP_ROOK, new Rook());
        gameBoard[7][0] = p25;
        Piece p26 = new Piece(ChessColor.CLR_WHITE, ChessType.TYP_KNIGHT, new KnightMove());
        gameBoard[7][1] = p26;
        Piece p27 = new Piece(ChessColor.CLR_WHITE, ChessType.TYP_BISHOP, new Bishop());
        gameBoard[7][2] = p27;
        Piece p28 = new Piece(ChessColor.CLR_WHITE, ChessType.TYP_QUEEN, new Queen());
        gameBoard[7][3] = p28;
        Piece p29 = new Piece(ChessColor.CLR_WHITE, ChessType.TYP_KING, new King());
        gameBoard[7][4] = p29;
        Piece p30 = new Piece(ChessColor.CLR_WHITE, ChessType.TYP_BISHOP, new Bishop());
        gameBoard[7][5] = p30;
        Piece p31 = new Piece(ChessColor.CLR_WHITE, ChessType.TYP_KNIGHT, new KnightMove());
        gameBoard[7][6] = p31;
        Piece p32 = new Piece(ChessColor.CLR_WHITE, ChessType.TYP_ROOK, new Rook());
        gameBoard[7][7] = p32;
    }

    /**
     * @param position
     * @return
     */
    public Piece getPiece(ChessPosition position) {
        if (position.x >= 0 && position.x <= 7 && position.y >= 0 && position.y <= 7) {
            return gameBoard[position.y][position.x];
        } else {
            return null;
        }
    }

    /**
     *
     * @param color
     * @return
     */
    public int getNbPieces(ChessColor color) {
        int counter = 0;

        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                Piece piece = gameBoard[row][col];
                if (piece != null && piece.getColor() == color) {
                    counter++;


                }

            }
        }
        return counter;
    }

    /**
     *
     * @param src
     * @param dest
     */
    public void movePiece(ChessPosition src, ChessPosition dest) {
        this.gameBoard[dest.y][dest.x] = this.gameBoard[src.y][src.x];
        this.gameBoard[src.y][src.x] = null;
        for (int row = 0; row < 8; row++) {
            Piece piece = getPiece(new ChessPosition(row, 0));
            if (piece != null && piece.getType() == ChessType.TYP_PAWN) {
                Piece dame = new Piece(ChessColor.CLR_WHITE, ChessType.TYP_QUEEN, new Queen());
                gameBoard[0][row] = dame;
            }
            piece = getPiece(new ChessPosition(row, 7));
            if (piece != null && piece.getType() == ChessType.TYP_PAWN) {
                Piece dame = new Piece(ChessColor.CLR_BLACK, ChessType.TYP_QUEEN, new Queen());
                gameBoard[7][row] = dame;
            }
        }
    }


    // Roque : algo déplacement du roi
    //compteur de déplacement
    //Roi et tour n'ont jamais bougé, aucune pièces entre le roi et la tour


    /**
     *
     * @param color
     * @return
     */
    public boolean isKingSafe(ChessColor color) {
        ChessPosition kingPos = new ChessPosition();
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                Piece piece = gameBoard[row][col];
                if (piece != null) {
                    if (piece.getType() == ChessType.TYP_KING && piece.getColor() == color) {
                        kingPos.x = col;
                        kingPos.y = row;
                    }
                }

            }
        }
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                Piece piece = gameBoard[row][col];
                if (piece != null) {
                    if (piece.getColor() != color) {
                        ChessPosition enemyPos = new IChess.ChessPosition(col, row);
                        List<ChessPosition> enemyList = piece.getMoves(enemyPos, this);
                        for (int i = 0; i < enemyList.size(); i++) {
                            ChessPosition currentPos = enemyList.get(i);
                            if (kingPos.equals(currentPos)) {
                                return false;
                            }
                        }
                    }
                }

            }
        }
        return true;


    }
}