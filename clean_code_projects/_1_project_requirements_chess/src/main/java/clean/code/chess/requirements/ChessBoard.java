package clean.code.chess.requirements;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;

    private Pawn[][] pieces;

    public ChessBoard() {
        pieces = new Pawn[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];

    }

    public void Add(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
        if (this.IsLegalBoardPosition(xCoordinate,yCoordinate))
        {
           //
           // pawn.getYCoordinate();
            pawn.setXCoordinate(xCoordinate);
            pawn.getXCoordinate();

            pawn.setYCoordinate(yCoordinate);
            pawn.getYCoordinate();
            //pawn.setYCoordinate(yCoordinate);
        }
       //throw new UnsupportedOperationException("Need to implement ChessBoard.add()");
    }

    public boolean IsLegalBoardPosition(int xCoordinate, int yCoordinate) {
        if (0 <= xCoordinate && xCoordinate < MAX_BOARD_HEIGHT) {
            return 0 <= yCoordinate && yCoordinate < MAX_BOARD_WIDTH;
        } else {
            throw new UnsupportedOperationException("Need to implement ChessBoard.IsLegalBoardPosition()");
        }
    }
}
